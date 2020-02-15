
Feature: Account LookUp

@Account_LookUp_DVAR_EQPOS_False
Scenario Outline: Validate Account_LookUp_DVAR_EQPOS_False
	Given I have the request XML for "AcctLookUpRequest_DVAR.EQPOS.false" to be run on "<Environment>"
	And I trigger it and check the account status
	Then I write account status to excel 
	
	Examples:
|Environment|
	|ITv1|
	|ITv2|
	|ITv3|
	|e2e|
	