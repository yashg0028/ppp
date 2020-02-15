package stepDefinition;

import cucumber.api.java.en.Then;
import dataOperations.ExcelOperations;
import genericUtilities.GlobalVariables;

public class WriteTransactionResultInExcel extends GlobalVariables{
	
	ExcelOperations excelOperations = new ExcelOperations();
	
	@Then("^I write the payment_id and payment status in excel$")
	public void writePaymentIdAndStatusInExcel() throws Exception{
		
		String result=paymentId+" "+":"+" "+paymentDBStatus;
		excelOperations.writeDataIntoExcel(result,colTransactionStatus);
		
	}
	
	@Then("^I write account status to excel$")
	public void iWriteToAccountStatusToExcel() throws Exception {
		System.out.println(TransactionStatus);
		String passResult=TransactionStatus+"uccess";
		String failResult=TransactionStatus+"ailure:"+" "+ErrorMessage;
		if(TransactionStatus.equals("S"))
		{
			excelOperations.writeDataIntoExcel(passResult,colTransactionStatus);
		}
		else if(TransactionStatus.equals("F"))
		{
			excelOperations.writeDataIntoExcel(failResult,colTransactionStatus);
		}
		
	}
	
}
