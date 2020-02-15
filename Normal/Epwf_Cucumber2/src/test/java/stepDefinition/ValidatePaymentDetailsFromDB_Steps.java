package stepDefinition;





import cucumber.api.java.en.Then;
import genericUtilities.DataFromDB;
import genericUtilities.GlobalVariables;

public class ValidatePaymentDetailsFromDB_Steps extends GlobalVariables {
	
	DataFromDB dataFromDB = new DataFromDB();	
	
	@Then("^I validate payment status from DB$")
	public void getPaymentDetailsFromDB() throws Exception{
		
		dataFromDB.checkPaymentStatus(paymentId,paymentStatusQuery);
		
		if(paymentDBStatusList.get(paymentStatusIndex)
				.equalsIgnoreCase("Approved")){
			Thread.sleep(80000);
		}else{
			paymentDBStatus=paymentDBStatusList.get(paymentStatusIndex);
		}
		
		paymentDBStatusList.clear();
		/*boolean status = dataFromDB
				.verifyPaymentStatusPresence(paymentDBStatusList
                                         .get(paymentStatusIndex));
		dataFromDB.verifyDBExpectedValue(status, false,
				paymentStatusIndex);
		paymentStatusIndex=0;*/
		
	}
	
}
