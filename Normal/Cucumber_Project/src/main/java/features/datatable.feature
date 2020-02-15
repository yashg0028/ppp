Feature: deal data creation
Scenario:  create a new data deal sceanrio 

   Given User is already on login page
   When Login page title is facebook
   Then User enters username and password
   	   	| yash | yash@494 |
   And User clicks on login button
   Then User moves to details page
   Then User enters details 
   | Raj | kumar | pop |
   Then close browser