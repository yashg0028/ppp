package genericUtilities;

import java.sql.SQLException;
import java.util.Set;

import dataOperations.ExcelOperations;



public class DataFromDB extends GlobalVariables {
	
	CommonMethods commonMethods = new CommonMethods();
	ExcelOperations excelOperations = new ExcelOperations();
	
	// Get payment status from DB
	public void checkPaymentStatus(String paymentID,String paymentQuery) throws SQLException {
		
		commonMethods.queryResultFromDB(paymentQuery
				+ paymentID + "'");
		
		while (queryResult.next()) {
			paymentDBStatusList.add(queryResult
					.getString("payment_status_cd"));
		}
		
	}

	// Verify payment status from availability in the string array
	public boolean verifyPaymentStatusPresence(String PaymentStatus) {
		boolean flag = false;
		for (String verify : variousPaymentStatus) {
			if (PaymentStatus.equalsIgnoreCase(verify)) {
				flag = true;
				break;
			}
		}
		return flag;
	}

	// Get wallet status from DB
	public void checkRecordStatusforWalletManagement(
			String walletReferenceValue) throws SQLException {
		commonMethods
				.queryResultFromDB(walletCreationQuery
						+ walletReferenceValue + "'");
		while (GlobalVariables.queryResult.next()) {
			GlobalVariables.walletDBStatus = queryResult
					.getString("record_status_cd");
		}
	}

	// Verify wallet status
	public boolean verifyWalletStatusPresence(String walletStatus) {
		if (walletStatus.equalsIgnoreCase(walletRecordStatus)) {
			return true;
		} else {
			return false;
		}
	}
	
	
	//verify autopay record status	
	public boolean verifyAutopayrecordPresence(String autopayStatus) {
		boolean flag = false;
		for(String s1 : autopayRecordStatus){
			if (autopayStatus.equalsIgnoreCase(s1)) {
				flag = true;
				break;
		}
		}
		return flag;
		
	}
	
	// Get wallet status from DB
	public void checkRecordStatusforAutopay(
			String billingAcntId) throws SQLException, InterruptedException {
		commonMethods
				.queryResultFromDB(GlobalVariables.recordStatusQuey
						+ billingAcntId + "' order by created_dttm desc");
		while (queryResult.next()) {
			autopayDBStatus = GlobalVariables.queryResult
					.getString("record_status_cd");
			if(GlobalVariables.billAppId.contains("ENS")||GlobalVariables.billAppId.contains("LATIS")){
				if(autopayDBStatus.equalsIgnoreCase("Processed")){
				break;
				}
			}else if(GlobalVariables.billAppId.contains("CRIS")){
				if(autopayDBStatus.equalsIgnoreCase("Submitted")){
				break;
				}
			}
			
		}
		
	}
	
	//Check rules for rule_txt
    public String checkRuleText(String inputChannel) throws SQLException{
    	   
           String rule_text = "";
           commonMethods.queryResultFromDB(GlobalVariables.hcdeIframeTypeRuleQuery
                        + inputChannel + "'");
           while (GlobalVariables.queryResult.next()) {
                  rule_text = GlobalVariables.queryResult
                               .getString("rule_txt");
           }
           return rule_text;
    }
    
  //Check rules applied status
    public String checkRuleAppliedStatus(String inputChannel) throws SQLException{
           String rule_applied_ind = "";
           commonMethods.queryResultFromDB(GlobalVariables.isAmountPayableRuleQuery
                        + inputChannel + "'");
           while (GlobalVariables.queryResult.next()) {
                  rule_applied_ind = GlobalVariables.queryResult
                               .getString("rule_applied_ind");
           }
           return rule_applied_ind;
    }
    
 // verify DB status of payment
 	public void verifyDBExpectedValue(boolean status, boolean walletMgmt,
 			int paymentStatusIndex) throws Exception {
 		if (status) {
 			if (walletMgmt) {
 				System.out.println("wallet status is : "
 						+ GlobalVariables.walletDBStatus);
 				excelOperations.writeDataIntoExcel("PASS", colTransactionStatus);
 	            /*excelOperations.writeDataIntoExcel("wallet status is : " + GlobalVariables.walletDBStatus
 						+ " and wallet ID is : "
 						+ GlobalVariables.walletReferenceValue,colComments); */
 			} else {
 				System.out.println("payment status is : "
 						+ paymentDBStatusList
 								.get(paymentStatusIndex));
 				/*excelOperations.writeDataIntoExcel(GlobalVariables.paymentDBStatus.toString(), colStatus);
 				excelOperations.writeDataIntoExcel("PASS", colStatus);
 	            excelOperations.writeDataIntoExcel("Payment status is : "
 						+ GlobalVariables.paymentDBStatus
 						.get(paymentStatusIndex)
 				+ " and Payment ID is : "
 				+ paymentId,colComments); */
 			}
 		} else {
 			if (walletMgmt) {
 				System.out.println("wallet status is : "
 						+ GlobalVariables.walletDBStatus);
 				excelOperations.writeDataIntoExcel("FAIL", colTransactionStatus);
 	            /*excelOperations.writeDataIntoExcel("wallet status is : " + GlobalVariables.walletDBStatus
 						+ " and wallet ID is : "
 						+ GlobalVariables.walletReferenceValue,colComments);*/
 			} else {
 				System.out.println("payment status is : "
 						+ GlobalVariables.paymentDBStatusList
 								.get(paymentStatusIndex));
 				/*excelOperations.writeDataIntoExcel(GlobalVariables.paymentDBStatus.toString(), colStatus);
 				excelOperations.writeDataIntoExcel("FAIL", colStatus);
 	            excelOperations.writeDataIntoExcel("Payment status is:"+ GlobalVariables.paymentDBStatus.get(paymentStatusIndex)+ " and Payment ID is : "+ paymentId,colComments);*/
 			}
 		}
 	}
	
}
