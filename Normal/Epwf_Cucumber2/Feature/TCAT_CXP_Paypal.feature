Feature: Submit Payment

@TCAT_CXP_Paypal
Scenario Outline: Validate TCAT_CXP_Paypal
	Given I have the request XML for "TCAT_CXP_Paypal" to be run on "<Environment>"
	And I trigger it and launch the session URL
	Then I make the payment based on payment type
	Then I validate payment status from DB
	Then I write the payment_id and payment status in excel
	
	Examples:
|Environment|
	|ITv1|
	|ITv2|
	|ITv3|
	|e2e|