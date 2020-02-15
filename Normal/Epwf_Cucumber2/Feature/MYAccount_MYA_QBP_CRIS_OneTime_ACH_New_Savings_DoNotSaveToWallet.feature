Feature: Submit Payment

@MYAccount_MYA_QBP_CRIS_OneTime_ACH_New_Savings_DoNotSaveToWallet
Scenario Outline: Validate MYAccount_MYA_QBP_CRIS_OneTime_ACH_New_Savings_DoNotSaveToWallet
	Given I have the request XML for "MYAccount_MYA_QBP_CRIS_OneTime_ACH_New_Savings_DoNotSaveToWallet" to be run on "<Environment>"
	And I trigger it and launch the session URL
	Then I make the payment based on payment type
	Then I validate payment status from DB
	Then I write the payment_id and payment status in excel
	
Examples:
|Environment|
	|ITv2|