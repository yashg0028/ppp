Feature: Account LookUp
@Sanity
@Account_LookUp_CMT
Scenario Outline: Validate Account_Lookup_CMT
	Given I have the request XML for "AcctLookUpRequest_CMT" to be run on "<Environment>"
	And I trigger it and check the account status
	Then I write account status to excel 
	
	Examples:
|Environment|
	|ITv1|
	|ITv2|
	|ITv3|
	|e2e|
	