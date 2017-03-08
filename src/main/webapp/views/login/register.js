/**
 * Created by Administrator on 2017/3/3.
 */
(function (window, angular, app, webApp) {
    webApp.controllerRegister('registerController', ['$scope', '$window', '$timeout', '$http', '$state', '$stateParams', function ($scope, $window, $timeout, $http, $state, $stateParams) {
        $scope.tt = 'registerController';
        $http({
            method: 'get',
            url: app.getUrl('/user/showInfos.do'),
        }).then(function (res) {
            $scope.list =res.data;
        }, function (rej) {

        });
    }]);
}(window, window.angular, window.app, window.webApp));