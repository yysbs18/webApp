/**
 * Created by Administrator on 2017/3/2.
 */
(function (window, angular, app, undefined) {
    var webApp = window.webApp = angular.module('webApp', ['ui.router', 'ngAnimate', 'ngMaterial', 'ngMessages', 'oc.lazyLoad',]);
    webApp.config(['$httpProvider', '$controllerProvider', '$filterProvider', '$ocLazyLoadProvider', "$compileProvider", '$stateProvider', function ($httpProvider, $controllerProvider, $filterProvider, $ocLazyLoadProvider, $compileProvider, $stateProvider) {
        webApp.controllerRegister = $controllerProvider.register;
        webApp.filterRegister = $filterProvider.register;
        //lazy load config
        $ocLazyLoadProvider.config({
            debug: app.debug,
            events: true
        });
        $httpProvider.interceptors.push('sessionInjector');
        $httpProvider.defaults.timeout = 30000;
        $compileProvider.aHrefSanitizationWhitelist(/^\s*(https?|ftp|mailto|file|javascript):/);

        $stateProvider._state = function (name, stateConfig, resource, serie) {
            stateConfig.resolve = stateConfig.resolve || {};
            var resolveName = name + '_lazyLoad'
                , injects = ['$state', '$ocLazyLoad']
                , parent = name.indexOf('.') != -1 ? name.replace(/\.[^\.]+$/g, '') : false;
            if (stateConfig.resolve[resolveName]) {
                throw new Error(resolveName + ' in resolve conflict');
            } else {
                if (parent) {
                    injects.push(parent + '_lazyLoad');
                }
                injects.push(handle);
                stateConfig.resolve[resolveName] = injects;
                function handle($state, $ocLazyLoad) {
                    if (serie) {
                        return $ocLazyLoad.load({
                            serie: true,
                            files: resource
                        });
                    } else {
                        return $ocLazyLoad.load(resource);
                    }
                }
            }
            $stateProvider.state(name, stateConfig);
            return $stateProvider;
        };

        webApp.run(['$rootScope', '$window', function ($rootScope, $window) {
            $rootScope.$on('ocLazyLoad.fileLoaded', function (e, file) {
                file;
            });
            $rootScope.$on('$stateNotFound',
                function (event, unfoundState, fromState, fromParams) {
                    console.log('$stateNotFound');
                    console.log(unfoundState.to); // "lazy.state"
                    console.log(unfoundState.toParams); // {a:1, b:2}
                    console.log(unfoundState.options); // {inherit:false} + default options
                });
            $rootScope.$on('$stateChangeSuccess',
                function (event, toState, toParams, fromState, fromParams) {
                    // console.log('$stateChangeSuccess')
                    // console.log(toState); // "lazy.state"
                    // console.log(fromState); // "lazy.state"
                    //清楚多余样式
                    if (fromState.name) {
                        var style = $window.document.querySelector('#' + fromState.name.replace(/\W/g, ''));
                        style && $window.document.body.removeChild(style);
                    }
                    //隐藏menu
                    if (toState.name.indexOf('dw.edit') != -1 || toState.name.indexOf('dw.view') != -1) {
                        xyMenu.hide();
                    } else {
                        xyMenu.show();
                    }

                    // console.log(unfoundState.toParams); // {a:1, b:2}
                    // console.log(unfoundState.options); // {inherit:false} + default options
                });
            $rootScope.$on('$stateChangeStart',
                function (event, toState, toParams, fromState, fromParams) {
                    // console.log('$stateChangeStart')
                    // console.log(unfoundState.to); // "lazy.state"
                    // console.log(unfoundState.toParams); // {a:1, b:2}
                    // console.log(unfoundState.options); // {inherit:false} + default options
                });
            $rootScope.$on('$stateChangeError',
                function (event, toState, toParams, fromState, fromParams, error) {
                    event.preventDefault();
                    var msg = '路由出错';
                    if (error.message.indexOf('Unable to load') != -1) {
                        msg = '加载资源失败';
                    }
                    console.log(msg);
                });
        }]);
    }]);
    webApp.factory("transformRequestAsFormPost", function () {
        function transformRequest(data) {
            return (app.serializeData(data));
        }
        return (transformRequest);
    });
    webApp.factory('sessionInjector', ['$q','transformRequestAsFormPost',
        function ($q,transformRequestAsFormPost) {
            var sessionInjector = {
                request: function (config) {
                    if (config.data) {
                        config.transformRequest = transformRequestAsFormPost;
                        config.headers['Content-Type'] = "application/x-www-form-urlencoded; charset=utf-8";
                    }
                    if (typeof config.timeout == 'undefined') {
                        config.timeout = 60000;
                    }
                    return config;
                },
                requestError: function (rejection) {
                    return $q.reject(rejection);
                },
                response: function (response) {
                    return response;
                },
                responseError: function (response) {
                    return $q.reject(response);
                }
            };
            return sessionInjector;
        }]);
}(window, window.angular, window.app));