/**
 * Created by Administrator on 2017/3/3.
 */
(function (window, angular, app, webApp) {
    webApp.controllerRegister('headerController', ['$scope', '$window', '$timeout', '$http', '$state', '$stateParams', function ($scope, $window, $timeout, $http, $state, $stateParams) {
        $scope.ss = '姐姐';
    }]);
}(window, window.angular, window.app, window.webApp));