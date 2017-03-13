/**
 * Created by Administrator on 2017/3/3.
 */
(function (window, angular, app, webApp) {
    webApp.controllerRegister('menuController', ['$scope', '$window', '$timeout', '$http', '$state', '$stateParams', function ($scope, $window, $timeout, $http, $state, $stateParams) {
        var none = ['webApp.login'];
        $scope.showMenu = function () {
            var flag = true;
            none.map(function (v) {
                if ($state.is(v)) {
                    flag = false;
                }
            });
            return flag;
        };
        $http({
            method: 'get',
            url: app.getUrl('menu/getMenus'),
            params: {},
        }).then(function (res) {

        }, function (rej) {

        });
    }]);
}(window, window.angular, window.app, window.webApp));