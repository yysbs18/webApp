/**
 * Created by Administrator on 2017/3/3.
 */
(function (window, angular, app, webApp) {
    webApp.config(['$stateProvider', '$provide', '$urlRouterProvider', function ($stateProvider, $provide, $urlRouterProvider) {
        $stateProvider._state('webApp', {
            url: '/webApp',
            // abstract: true,
            views: {
                'header': {
                    controller: 'headerController',
                    templateUrl: '../../views/app/header.html'
                },
                'menu': {
                    controller: 'menuController',
                    templateUrl: '../../views/app/menu.html'
                }
            }
        }, [
            '../../views/app/header.js', '../../views/app/header.css', '../../views/app/menu.js', '../../views/app/menu.css'
        ])._state('webApp.login', {
            url: '/login',
            views: {
                'content@': {
                    controller: 'loginController',
                    templateUrl: '../../views/login/login.html'
                }
            }
        }, [
            '../../views/login/login.js', '../../views/login/login.css'
        ])._state('webApp.register', {
            url: '/register',
            views: {
                'content@': {
                    controller: 'registerController',
                    templateUrl: '../../views/login/register.html'
                }
            }
        }, [
            '../../views/login/register.js', '../../views/login/register.css'
        ])._state('webApp.management', {
            url: '/management',
            views: {
                'content@': {
                    controller: 'loginController',
                    templateUrl: '../../views/management/management.html'
                }
            }
        }, [
            '../../views/management/management.js', '../../views/management/management.css'
        ]);
        $urlRouterProvider.otherwise('/webApp');
    }]);
}(window, window.angular, window.app, window.webApp));