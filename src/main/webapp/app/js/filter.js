/**
 * Created by Administrator on 2017/3/8.
 */
(function (window, angular, app, webApp) {
    webApp.filter('pageFilter', [function () {
        return function (list, page) {
            if (angular.isArray(list)) {
                return list.slice((page.currentPage - 1) * page.perPage, page.currentPage * page.perPage);
            }
            else {
                return list;
            }
        }
    }]);
}(window, window.angular, window.app, window.webApp));