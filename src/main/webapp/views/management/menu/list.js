/**
 * Created by Administrator on 2017/3/2.
 */
(function (window, angular, app, webApp) {
    'use strict';
    webApp.controllerRegister('menuListController', ['$scope', '$mdToast', '$window', '$timeout', '$http', '$state', '$stateParams', function ($scope, $mdToast, $window, $timeout, $http, $state, $stateParams) {
        $scope.ss = '姐姐';
        $http({
            method: 'get',
            url: app.getUrl('menu/getMenus'),
        }).then(function (res) {
            $scope.menuList = res.data.data;
        });
        $scope.saveRowCallback = function (row) {
            $mdToast.show(
                $mdToast.simple()
                    .content('Row changed to: ' + row)
                    .hideDelay(3000)
            );
        };
        $scope.changeCallback = function (m) {
            var str = '菜单\"' + m.menuName + '\"已' + (m.flag ? '启用' : '禁用');
            $mdToast.show(
                $mdToast.simple()
                    .content(str)
                    .hideDelay(3000)
            );
        };
    }]);
}(window, window.angular, window.app, window.webApp));