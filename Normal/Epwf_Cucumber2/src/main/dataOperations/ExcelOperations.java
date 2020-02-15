package dataOperations;

import java.io.File;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import genericUtilities.GlobalVariables;

public class ExcelOperations extends GlobalVariables {
	
	int colNumber;
	ExcelUtils excelUtils = new ExcelUtils();
	
	public void setDataAsPerScenario(String data) throws EncryptedDocumentException, InvalidFormatException, IOException{
		
		currentRowNumber=excelUtils.getRowNumber(data);
		
		if(data.contains("TCAT_CXP")){
			
			colNumber = excelUtils.getColumnNumber(colBrowser);
			ex_Browser= excelUtils.getCellData(currentRowNumber, colNumber);
			
			colNumber = excelUtils.getColumnNumber(colXMLFileName);
			ex_XMLFileName= excelUtils.getCellData(currentRowNumber, colNumber);
			
			colNumber = excelUtils.getColumnNumber(colPaypalUsername);
			ex_PaypalUsername= excelUtils.getCellData(currentRowNumber, colNumber);
			
			colNumber = excelUtils.getColumnNumber(colPaypalPassword);
			ex_PaypalPassword= excelUtils.getCellData(currentRowNumber, colNumber);
			
			colNumber = excelUtils.getColumnNumber(colBTN_BAID);
			ex_BTN_BAID= excelUtils.getCellData(currentRowNumber, colNumber);
			
			if(data.contains("CARD")){
				colNumber = excelUtils.getColumnNumber(colCardNumber);
				ex_CardNumber=excelUtils.getCellData(currentRowNumber, colNumber);
				colNumber = excelUtils.getColumnNumber(colCardName);
				ex_CardName=excelUtils.getCellData(currentRowNumber, colNumber);
			}
			
		}else{
			
			colNumber = excelUtils.getColumnNumber(colBTN_BAID);
			ex_BTN_BAID=excelUtils.getCellData(currentRowNumber, colNumber);
			
			colNumber = excelUtils.getColumnNumber(colBrowser);
			ex_Browser=excelUtils.getCellData(currentRowNumber, colNumber);
			
			colNumber = excelUtils.getColumnNumber(colXMLFileName);
			ex_XMLFileName=excelUtils.getCellData(currentRowNumber, colNumber);
			
			colNumber = excelUtils.getColumnNumber(colInputChannel);
			ex_InputChannel=excelUtils.getCellData(currentRowNumber, colNumber);
					
			colNumber = excelUtils.getColumnNumber(colCustomerType);
			ex_CustomerType=excelUtils.getCellData(currentRowNumber, colNumber);
					
			colNumber = excelUtils.getColumnNumber(colInputChannel);
			ex_InputChannel=excelUtils.getCellData(currentRowNumber, colNumber);
			
			colNumber = excelUtils.getColumnNumber(colInstrumentType);
			ex_InstrumentType=excelUtils.getCellData(currentRowNumber, colNumber);
			
			if(data.contains("ACH") && (data.contains("Existing"))==false){
				colNumber = excelUtils.getColumnNumber(colRoutingNumber);
				ex_RoutingNumber=excelUtils.getCellData(currentRowNumber, colNumber);
			}
			
			if(data.contains("CARD") && (data.contains("Existing"))==false){
				colNumber = excelUtils.getColumnNumber(colCardNumber);
				ex_CardNumber=excelUtils.getCellData(currentRowNumber, colNumber);
			}
			
			if(data.contains("Scheduled")&&(data.contains("Ensemble"))==false){
				colNumber = excelUtils.getColumnNumber(colScheduledDate);
				ex_ScheduledDate=excelUtils.getCellData(currentRowNumber, colNumber);
			}
			
			if(data.contains("Scheduled")&&data.contains("Ensemble")){
				colNumber = excelUtils.getColumnNumber(colPaymentProcessDate);
				ex_PaymentProcessDate=excelUtils.getCellData(currentRowNumber, colNumber);
			}
			
		}
		
	}
	
	public void setDBAndEnvironmentValues(String environment) throws EncryptedDocumentException, InvalidFormatException, IOException{
		
		excelUtils.openExcelFile(ExcelFile, envAndDBSheetName);
		
		envRowNumber=excelUtils.getRowNumber(environment);
		
		colNumber = excelUtils.getColumnNumber(colWSDL);
		ex_WSDL=excelUtils.getCellData(envRowNumber, colNumber);
	
		colNumber = excelUtils.getColumnNumber(colDBConnectionString);
		ex_DBConnectionString=excelUtils.getCellData(envRowNumber, colNumber);
		
		colNumber = excelUtils.getColumnNumber(colDBUserName);
		ex_DBUsername=excelUtils.getCellData(envRowNumber, colNumber);
		
		colNumber = excelUtils.getColumnNumber(colDBPassword);
		ex_DBPassword=excelUtils.getCellData(envRowNumber, colNumber);
		
	}
	
	//Write data into excel
	public void writeDataIntoExcel(String data,String columnName) throws Exception{
		
		excelUtils.openExcelFile(ExcelFile, tcSheetName);
		colNumber = excelUtils.getColumnNumber(columnName);
		excelUtils.setCellData(data,currentRowNumber,colNumber);
		
	}
	
}
