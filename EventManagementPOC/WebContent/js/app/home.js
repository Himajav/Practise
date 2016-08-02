
var myapp= angular.module("myapp",[]);

//one controller
myapp.controller("createProductCtrl",function($scope,$filter,$http){	
	$scope.createProductVisible=true;
	$scope.visible=true;
	$scope.menuheaders=[{id:1,name:'Enter a New Bottle to the Vault',continent:'newbottleform'},
	                {id:2,name:'Pre-Logout Information',continent:'prelogoutInfo'},
	                {id:3,name:'Sample-Logout Form',continent:'samplelogoutform'},
	                {id:4,name:'Sample-Log In',continent:'sampleloginform'},
	                {id:5,name:'Dispense Sample',continent:'loginform'},
	                {id:6,name:'Distroyed/ Consumed /Transfferred Menu...',continent:'distroyed'},
	                {id:7,name:'Reports Menu ...',continent:'reportsform'},
	                {id:8,name:'Inventory / Maintence Menu ',continent:'maintenceMenu'}
	                ];
	 
	 $scope.saveFromData = function($event,$scope,item) {
   	  var selectedvalue=item;
  
			  var input = $scope;
			 
			  
				 if(selectedvalue === 'Save'){							
					 // On click event ajax call to SAVE data into the DB     
					    // $scope.getDataFromServer = function() {
					         $http({
					                 method : 'GET',
					                 url : './saveProduct.htm',
					                // data: $scope,
					                 params:$scope,
					                 headers: {
					                         'Content-Type': 'application/json'
					                     }
					                /* data: {carrier_id: battleName},
					                 params:{carrier_id: battleName},
					                 headers: {
					                         'Content-Type': 'application/json'
					                     }*/
					         }).success(function(response) {
					        	   $scope.reset();
					        	 $scope.msg=response.message;
					        	 
					        	// $scope.fetchInitalDataResponse($scope,data);							        	
					         }).error(function(data, status, headers, config) {
					        	 console.log(data);							        	 
					                 // called asynchronously if an error occurs
					                 // or server returns response with an error status.
					         });
					      
					    }
			    	  };
			    
			 	     
   	 
   	 
						    	 
				    
});


