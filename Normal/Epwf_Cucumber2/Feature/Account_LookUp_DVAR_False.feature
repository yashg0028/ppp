Feature: Account LookUp

@Account_LookUp_DVAR_False
Scenario Outline: Validate Account_LookUp_DVAR_False
	Given I have the request XML for "AcctLookUpRequest_DVAR.false" to be run on "<Environment>"
	And I trigger it and check the account status
	Then I write account status to excel 
	
	Examples:
|Environment|
	|ITv1|
	|ITv2|
	|ITv3|
	|e2e|
	