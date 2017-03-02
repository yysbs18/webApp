/**
 * Created by Administrator on 2017/3/2.
 */
(function (window, angular, app, webApp) {
    webApp.controllerRegister('loginController', ['$scope', '$window', '$timeout', '$http', '$state', '$stateParams', function ($scope, $window, $timeout, $http, $state, $stateParams) {
        $scope.ss = '姐姐';
    }]);
}(window, window.angular, window.app, window.webApp));