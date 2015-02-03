// / *** MODULE *** / //

var angularModule = angular.module('angularModule', []);

// / *** URL WEB SERVICE *** ///
var ROMANCONVERTER_WEB_SERVICE = 'https://convertromannumberswebapp.herokuapp.com/rest/number?';

// / *** WEB SERVICES *** ///

angularModule.service('convertWebService', function($http) {

	this.convertNumber = function(number) {

		return ($http({
			method : 'GET',
			url : ROMANCONVERTER_WEB_SERVICE,
			params : {
				number : number
			}
		}));
	};
});

// / *** CONTROLLERS *** / //

angularModule.controller('mainController', function($scope, convertWebService) {

	$scope.convert = function() {
		convertWebService.convertNumber($scope.number).success(function(data) {
			if (data != 'error') {
				$scope.romanNumber = data.response;
			}
		});
	}

});
