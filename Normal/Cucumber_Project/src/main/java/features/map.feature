Feature: deal data creation
Scenario:  create a new data deal sceanrio 

   Given User is already on login page
   When Login page title is facebook
   Then User enters username and password
  
 		| username |  password |
   	   	| yash 				| yash@494 |
   And User clicks on login button
   Then User moves to details page
   Then User enters details 
   
   | firstname | lastname | surname |   # column names in map 
   | Raj 			| kumar 		| pop |
   | Raj1 			| kumar1	| pop1 |
   | Raj 2			| kumar2 	| pop2 |
   
   Then close browser