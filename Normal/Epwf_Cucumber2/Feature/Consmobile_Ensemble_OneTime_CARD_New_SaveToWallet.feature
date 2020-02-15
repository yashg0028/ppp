Feature: Submit Payment

@Consmobile_Ensemble_OneTime_CARD_New_SaveToWallet 
Scenario Outline: Validate Consmobile_Ensemble_OneTime_CARD_New_SaveToWallet
	Given I have the request XML for "Consmobile_Ensemble_OneTime_CARD_New_SaveToWallet" to be run on "<Environment>"
	And I trigger it and launch the session URL
	Then I make the payment based on payment type
	Then I validate payment status from DB
	Then I write the payment_id and payment status in excel
	
Examples:
|Environment|
	|ITv2|
	