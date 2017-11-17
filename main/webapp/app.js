'use strict';

var myApp = angular.module('myApp', [ 'ngRoute' ]);

myApp.config(function($routeProvider, $qProvider) {
	$routeProvider
	.when("/", {
		templateUrl : "campaignList.html",
		controller : "campaignListController"
	}).when("/list", {
		templateUrl : "campaignList.html",
		controller : "campaignListController"
	}).when("/userProfile", {
		templateUrl : "userProfile.html",
		controller : "userProfileController"	
	}).when("/about", {
		templateUrl : "about.html"
	});

	$qProvider.errorOnUnhandledRejections(false);
});


myApp.controller('campaignListController', function($scope, $http,$location) {
	console.log("campaignListController");
});


myApp.controller('userProfileController', function($scope, $http, $location) {
	console.log("userProfileController");
});