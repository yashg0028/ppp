Feature: Account LookUp

@Account_LookUp_WithCombo
Scenario Outline: Validate Account_Lookup_WithCombo
	Given I have the request XML for "Account_Lookup_WithCombo" to be run on "<Environment>"
	And I trigger it and check the account status
	Then I write account status to excel 
	
	Examples:
|Environment|
	|ITv1|
	|ITv2|
	|ITv3|
	|e2e|
	