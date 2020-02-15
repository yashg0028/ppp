Feature: Account LookUp

@Account_LookUp
Scenario Outline: Validate Account_LookUp
	Given I have the request XML for "Account_LookUp" to be run on "<Environment>"
	And I trigger it and check the account status
	Then I write account status to excel 
	
	Examples:
|Environment|
	|ITv1|
	|ITv2|
	|ITv3|
	|e2e|
	