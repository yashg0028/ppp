package stepDefinition;

import cucumber.api.java.en.Then;
import genericUtilities.GlobalVariables;
import genericUtilities.IFrameNavigation;

public class Payment_Steps extends GlobalVariables {
	
	IFrameNavigation iFrameNavigation = new IFrameNavigation();
	
	@Then("^I make the payment based on payment type$")
	public void make_Payment_Details() throws Exception{
		
		if(sessionURL.contains("hcde")){
			iFrameNavigation.payFromHCDEIframe();
		}
		
	}
	
}
