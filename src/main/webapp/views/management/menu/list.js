/**
 * Created by Administrator on 2017/3/2.
 */
(function (window, angular, app, webApp) {
    'use strict';
    webApp.controllerRegister('menuListController', ['$scope', '$window', '$timeout', '$http', '$state', '$stateParams','$mdToast', function ($scope, $window, $timeout, $http, $state, $stateParams, $mdToast) {
        $scope.ss = '姐姐';
        $http({
            method: 'get',
            url: app.getUrl('menu/getMenus'),
        }).then(function (res) {
            $scope.menuList = res.data.data;
        }, function (rej) {

        });
        $scope.nutritionList = [
            {
                id: 601,
                name: 'Frozen joghurt',
                calories: 159,
                fat: 6.0,
                carbs: 24,
                protein: 4.0,
                sodium: 87,
                calcium: '14%',
                iron: '1%'
            }
        ];
    }]);
}(window, window.angular, window.app, window.webApp));