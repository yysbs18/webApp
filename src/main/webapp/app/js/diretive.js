/**
 * Created by Administrator on 2017/3/8.
 */
(function (window, angular, app, webApp) {
    webApp.directive('nm', ['$timeout', function ($timeout) {
        return {
            restrict: 'A',
            require: '',
            controller: ['$scope', '$element', '$attrs', 'xyKeyBoard', function (scope, element, attrs, xyKeyBoard) {
            }],
            link: function (scope, element, attrs, controller) {
            }
        };
    }]);
}(window, window.angular, window.app, window.webApp));