/* 
 * Copyright (C) 2016 igorb
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
// Setup Polymer options
window.Polymer = {
    dom: 'shadow',
    lazyRegister: true
};

// Load webcomponentsjs polyfill if browser does not support native Web Components
(function () {
    'use strict';

    var onload = function () {
        // For native Imports, manually fire WebComponentsReady so user code
        // can use the same code path for native and polyfill'd imports.
        if (!window.HTMLImports) {
            document.dispatchEvent(
                    new CustomEvent('WebComponentsReady', {bubbles: true})
                    );
        }
    };

    var webComponentsSupported = (
            'registerElement' in document
            && 'import' in document.createElement('link')
            && 'content' in document.createElement('template')
            );

    if (!webComponentsSupported) {
        var script = document.createElement('script');
        script.async = true;
        script.src = '/node_modules/npm-polymer-elements/webcomponentsjs/webcomponents.lite.min.js';
        script.onload = onload;
        document.head.appendChild(script);
    } else {
        onload();
    }
})();

// Load pre-caching Service Worker
//if ('serviceWorker' in navigator) {
//    window.addEventListener('load', function () {
//        navigator.serviceWorker.register('/service-worker.js');
//    });
//}


