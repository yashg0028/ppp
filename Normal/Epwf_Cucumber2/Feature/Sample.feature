Feature: Submit Payment

@MYAccount_CRIS_OneTime_ACH_New_Checking_DoNotSaveToWallet
Scenario Outline: Validate MYAccount_CRIS_OneTime_ACH_New_Checking_DoNotSaveToWallet
	Given I have the request XML for "MYAccount_CRIS_OneTime_ACH_New_Checking_DoNotSaveToWallet" on <Environment>
	And I trigger it and launch the session URL
	Then I make the payment based on payment type
	Then I validate payment status from DB
	Then I write the payment_id and payment status in excel
	
Examples:
	|Environment|
	|ITv1|
	|ITv2|
	|ITv3|
	|E2E|