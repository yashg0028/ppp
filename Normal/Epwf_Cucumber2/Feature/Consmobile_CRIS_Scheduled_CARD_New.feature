Feature: Submit Payment

@Consmobile_CRIS_Scheduled_CARD_New
Scenario Outline: Validate Consmobile_CRIS_Scheduled_CARD_New
	Given I have the request XML for "Consmobile_CRIS_Scheduled_CARD_New" to be run on "<Environment>"
	And I trigger it and launch the session URL
	Then I make the payment based on payment type
	Then I validate payment status from DB
	Then I write the payment_id and payment status in excel
	
Examples:
|Environment|
	|ITv2|
