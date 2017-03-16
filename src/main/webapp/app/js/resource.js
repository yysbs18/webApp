(function (window, document) {
    var dev = true
        , node_module = '../../node_modules/'
        , js = [
         'md-data-table/jquery.js'
        , 'md-data-table/lodash.min.js'
        ,'angular/angular.js'
        , 'angular/angular-sanitize.js'
        , 'angular/angular-animate.js'
        , 'angular/angular-aria.js'
        , 'angular/angular-messages.js'
        , 'angular/angular-mocks.js'
        , 'angular-material/angular-material-icons.js'
        , 'angular-material/angular-material.js'
        , 'md-data-table/md-data-table-templates.js'
        , 'md-data-table/md-data-table.js'
        , 'angular-ui-router/release/angular-ui-router.js'
        , 'angular/ng-file-upload.js'
        , 'angular/ocLazyLoad.js'
    ]
        , css = ['angular-material/angular-material.css'
        ,'md-data-table/md-data-table-style.css'
    ]
        , jsTemplate = '<script src="_resource_"></script>'
        , cssTemplate = '<link rel="stylesheet" type="text/css" href="_resource_">'
        , resources = '';
    js.map(function (v) {
        resources += jsTemplate.replace('_resource_', node_module + (dev ? v : v.replace('js', 'min.js')));
    });
    css.map(function (v) {
        resources += cssTemplate.replace('_resource_', node_module + (dev ? v : v.replace('css', 'min.css')));
    });
    js = ['../../app/js/app.js', '../../app/js/states.js'];
    js.map(function (v) {
        resources += jsTemplate.replace('_resource_', v);
    });
    css = ['../../app/css/app.css'];
    css.map(function (v) {
        resources += cssTemplate.replace('_resource_', v);
    });
    resources += '<link rel="shortcut icon" href="../../app/img/home.ico" />';
    document.write(resources);
    window.app = {
        debug: dev
    };
    app.getUrl = function (path) {
        return 'http://192.168.5.95:8080/webApp/' + path + '.do';
    };
    app.serializeData = function (data) {
        if (!angular.isObject(data)) {
            return data == null ? "" : data.toString();
        }
        var buffer = [];
        for (var name in data) {
            if (!data.hasOwnProperty(name)) {
                continue;
            }
            var value = data[name], type = typeof value;
            if (type === 'number' || type === 'string' || type === 'boolean') {
                buffer.push(encodeURIComponent(name) + '=' + encodeURIComponent(value));
            }
        }
        var source = buffer.join("&").replace(/%20/g, "+");
        return source;
    };
}(window, window.document));