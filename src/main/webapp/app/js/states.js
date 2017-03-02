/**
 * Created by Administrator on 2017/3/3.
 */
(function (window, angular, app, webApp) {
    webApp.config(['$stateProvider', '$provide', '$urlRouterProvider', function ($stateProvider, $provide, $urlRouterProvider) {
        $stateProvider._state('login', {
            url: '/login',
            views: {
                'fixed': {
                    controller: 'loginController',
                    templateUrl: '../../views/login/login.html'
                }
            }
        }, [
            '../../views/login/login.js', '../../views/login/login.css'
        ])._state('management', {
            url: '/management',
            views: {
                'fixed': {
                    controller: 'loginController',
                    templateUrl: '../../views/management/management.html'
                }
            }
        }, [
            '../../views/management/management.js', '../../views/management/management.css'
        ]);
        $urlRouterProvider.otherwise('/login');
    }]);
}(window, window.angular, window.app, window.webApp));