package stepDefinition;

import java.io.IOException;



import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.xml.sax.SAXException;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import dataOperations.ExcelOperations;
import dataOperations.ExcelUtils;
import genericUtilities.CommonMethods;
import genericUtilities.GlobalVariables;
import genericUtilities.ModifyXML;
import genericUtilities.XMLFileReader;


public class CreateAndRunRequest_Steps extends GlobalVariables {
	
	public static ExcelUtils excU = new ExcelUtils();
	ExcelOperations excelOperations = new ExcelOperations();
	ModifyXML modifyXML = new ModifyXML();
	CommonMethods commonMethods = new CommonMethods();
	XMLFileReader getXML = 	new XMLFileReader();
	
	@Given("^I have the request XML for \"([^\"]*)\" to be run on \"([^\"]*)\"$") //why we are giving the symbols and writing @Given
	public void create_Request_Xml(String scenario,String environment) throws EncryptedDocumentException, InvalidFormatException, IOException, SQLException, ParserConfigurationException, SAXException, TransformerException{
		scenarioName=scenario;
		excU.openExcelFile(ExcelFile,tcSheetName);
		//why can't we give open excelFile commands from here
		commonMethods.setVariablesAsPerScenario(scenario);
		excelOperations.setDataAsPerScenario(scenario);
		excelOperations.setDBAndEnvironmentValues(environment);
		modifyXML.modifyForSubmitPayment(genericXMLFilePath+ex_XMLFileName);
		reqXML=getXML.getReqXML(genericXMLFilePath+ex_XMLFileName);	
		System.out.println("Request XML --");
		System.out.println();
		System.out.println(reqXML);
		System.out.println();
	}
	
	@And("^I trigger it and launch the session URL$")
	public void trigger_And_Launch() throws KeyManagementException, NoSuchAlgorithmException{
		
		commonMethods.invokeWebService();
		sessionURL=CommonMethods.httppost.getTagValue(tagSessionURL);
		paymentId =CommonMethods.httppost.getTagValue(tagPaymentId);
		commonMethods.launchBrowser();
		
	}
	@And("^I trigger it and check the account status$")
	public void iTriggerItAndCheckTheAccountStatus() throws Exception
	{
		commonMethods.invokeWebService();
		TransactionStatus=CommonMethods.httppost.getTagValue(tagTransactionStatus);
		ErrorMessage=CommonMethods.httppost.getTagValue(tagErrorMessage);
	}

	
	
}
