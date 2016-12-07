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
Polymer({
    is: "planitia-home",
    properties: {
        page: {
            type: String,
            reflectToAttribute: true,
            observer: '_pageChanged'
        }
    },
    observers: [
        '_routePageChanged(routeData.page)'
    ],
    
    listeners: {
        'requestChangeRoute': '_requestPageChanged'
    },
    
    _requestPageChanged: function(e) {
        this._routePageChanged(e.detail.route);
    },
    
    _routePageChanged: function (page) {
        if(page === "planitia")
            page = "";
        console.log(page);
        this.page = page || 'dashboard';
    },
    _pageChanged: function (page) {
        // Load page import on demand. Show 404 page if fails
        var resolvedPageUrl = this.resolveUrl('planitia-' + page + '.html');
        this.importHref(resolvedPageUrl, null, this._showPage404, true);
    },
    _showPage404: function () {
        this.page = 'page404';
    }
});


