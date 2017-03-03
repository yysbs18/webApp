/**
 * Created by Administrator on 2017/3/2.
 */
(function (window, angular, app, webApp) {
    webApp.controllerRegister('loginController', ['$scope', '$mdSidenav', function ($scope, $mdSidenav) {
        $scope.ss = '姐姐';
        $scope.toggleLeft = buildToggler('left');
        $scope.toggleRight = buildToggler('right');

        function buildToggler(componentId) {
            return function () {
                var m = $mdSidenav(componentId);
                m.toggle();
            };
        }
    }]);
}(window, window.angular, window.app, window.webApp));