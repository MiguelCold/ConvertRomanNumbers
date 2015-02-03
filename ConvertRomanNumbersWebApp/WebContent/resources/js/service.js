/// *** URL WEB SERVICE *** ///
var ROMANCONVERTER_WEB_SERVICE = 'http://localhost:5005/ConvertRomanNumbersWebApp/rest/number?';

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
