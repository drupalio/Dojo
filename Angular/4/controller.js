angular.module('dojo', []).controller('dojoCtrl', ['$scope','$http', function ($scope,$http) {
	$http({
        method : "GET",
        url : "http://drupalio.com/wp-json/wp/v2/posts"
    }).then(function mySuccess(response) {
        $scope.data = response.data;
    }, function myError(response) {
        $scope.myWelcome = response.statusText;
    });
}]);