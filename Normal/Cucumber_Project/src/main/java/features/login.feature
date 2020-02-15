Feature: Free CRM login page

	#without Example Keyword
 	#Scenario: Free CRM login test Scenario
   #Given User is already on login page
    #When Login page title is facebook
    #Then User enters username and password
    #And User clicks on login button


	#without Example Keyword
 	#Scenario: Free CRM login test Scenario
   #Given User is already on login page
    #When Login page title is facebook
    #Then User enters yash and yash@494
    #And User clicks on login button

    
    # With Example Keyword And Scenario outline 
    Scenario Outline: Free CRM login test Scenario
    Given User is already on login page
    When Login page title is facebook
    Then User enters "<username>" and "<password>"
    And User clicks on login button
    Then browser quit
    
    Examples:
          | username | password |
          | yash          | yash@494 |
          |raj              | raj@494  |