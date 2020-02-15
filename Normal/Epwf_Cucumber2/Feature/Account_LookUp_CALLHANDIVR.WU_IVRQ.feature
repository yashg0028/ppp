Feature: Account LookUp
@Sanity
@Account_LookUp_CALLHANDIVR.WU_IVRQ 
Scenario Outline: Validate Account_LookUp_CALLHANDIVR.WU_IVRQ
	Given I have the request XML for "AcctLookupRequest_CALLHANDIVR.CALLHANDIVR.WU_IVRQ" to be run on "<Environment>"
	And I trigger it and check the account status
	Then I write account status to excel 
	
Examples:
|Environment|
	|ITv1|
	|ITv2|
	|ITv3|
	|e2e|
	