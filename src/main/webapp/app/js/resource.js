(function (window, document) {
    var dev = true
        , node_module = '../../node_modules/'
        , js = [
        'angular/angular.js'
        , 'angular/angular-animate.js'
        , 'angular/angular-aria.js'
        , 'angular/angular-messages.js'
        , 'angular/ocLazyLoad.js'
        , 'angular/ng-file-upload.js'
        , 'angular-material/angular-material.js'
        , 'angular-ui-router/release/angular-ui-router.js'
    ]
        , css = ['angular-material/angular-material.css']
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
    resources += '<link rel="shortcut icon" href="../../app/img/home.ico" />';
    document.write(resources);
    window.app = {
        debug: dev
    };
}(window, window.document));