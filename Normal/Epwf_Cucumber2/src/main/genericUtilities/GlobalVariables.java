package genericUtilities;

import java.io.File;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.net.ssl.SSLContext;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.openqa.selenium.WebDriver;

public class GlobalVariables {
	
	//file/path level variables
	public static String tcSheetName="TestCases";
	public static String envAndDBSheetName="EnvironmentAndDB";
	public static String testDataFilePath=new File("src/test/java/testData").getAbsolutePath();
	public static File ExcelFile = new File(testDataFilePath+"\\TestData.xlsx");
	public static final String genericXMLFilePath="src/test/java/testData/XML_Files/";
	public static File XMLFile;
	public static Scanner XMLFileReader;
	public static String XMLString;
	
	//variables taking values from scenario
	public static String paymentType;
	public static String scenarioName;
	public static String paymentScheduleType;
	
	//Response XML tags
	public static final String tagSessionURL = "xs|SessionURL";
	public static final String tagPaymentId = "xs|PaymentId";
	public static final String tagPaymentVerificationTransactionId = "xs|PaymentVerificationTranId";
	public static final String tagTransactionStatus ="bim|TransactionStatus";
	public static final String tagErrorMessage="bim|ErrorMessage";
	
	//response XML values
	public static String sessionURL;
	public static String paymentId;
	public static String paymentVerificationReferenceValue;
	public static String TransactionStatus;
	public static String ErrorMessage;
	
	// HTTP Post variables
	public static SSLContext sslContext;
	public static String responseResult;
	public static CloseableHttpClient httpXMLRunner;
	public static HttpPost httpXMLPoster;
	public static ByteArrayEntity postDataEntity;
	public static CloseableHttpResponse httpXMLResponseReciever;
	public static HttpEntity responseConverter;
	HttpResponse response;
	
	// jsoup variables
	public static Document jsoupParserRequest;
	public static Document jsoupParserResponse;
	public static Document jsoupParserModifyXML;
	public static String commonTagValue;
	public static Element FirstTagValue;
	public static String walletReferenceValue;
	
	//test case excel column values
	public String colScenarioName="ScenarioName";
	public String colBrowser="Browser";
	public String colUrl="URL";
	public String colUsername="Username";
	public String colPassword="Password";
	public String colBTN_BAID="BTN/BAID";
	public String colXMLFileName="XMLFileName";
	public String colInputChannel="InputChannel";
	public String colCustomerType="CustomerType";
	public String colScheduleType="PaymentScheduleType";
	public String colInstrumentType="InstrumentType";
	public String colRoutingNumber="RoutingNumber";
	public String colCardNumber="CardNumber";
	public String colCardName="CardName";
	public String colScheduledDate="ScheduledDate";
	public String colPaymentProcessDate="PaymentProcessDate";
	public String colAccountType="AccountType";
	public String colTransactionStatus="TransactionStatus";
	public String colPaypalUsername="PaypalUsername";
	public String colPaypalPassword="PaypalPassword";
	
	//environment And DB excel column values
	public String colWSDL = "WSDL";
	public String colDBConnectionString="DBConnectionString";
	public String colDBUserName="DBUserName";
	public String colDBPassword="DBPassword";

	
	//excelToVariables
	public static String ex_Browser;
	public static String ex_Url;
	public static String ex_BTN_BAID;
	public static String ex_CustomerType;
	public static String ex_PaymentScheduleType;
	public static String ex_XMLFileName;
	public static String ex_InputChannel;
	public static String ex_WSDL;
	public static String ex_DBConnectionString;
	public static String ex_DBUsername;
	public static String ex_DBPassword;
	public static String ex_InstrumentType;
	public static String ex_RoutingNumber;
	public static String ex_CardNumber;
	public static String ex_CardName;
	public static String ex_ScheduledDate;
	public static String ex_PaymentProcessDate;
	public static String ex_AccountType; //can change it to instrument type
	public static String ex_PaypalUsername;
	public static String ex_PaypalPassword;
	public static ArrayList<String> ex_QportalBTN = new ArrayList<String>();
	public static ArrayList<String> ex_QportalPaymentProcessDt = new ArrayList<String>();
	public static ArrayList<String> ex_QportalBillAcctRegion= new ArrayList<String>();
	public static ArrayList<String> ex_QportalBillAppId= new ArrayList<String>();
	public static ArrayList<String> ex_QportalCustomerType= new ArrayList<String>();
	/*public static ArrayList<String> ex_BillAcctRegion= new ArrayList<String>();
	public static ArrayList<String> ex_BillAcctRegion= new ArrayList<String>();
	public static ArrayList<String> ex_BillAcctRegion= new ArrayList<String>();
	public static ArrayList<String> ex_BillAcctRegion= new ArrayList<String>();
	public static ArrayList<String> ex_BillAcctRegion= new ArrayList<String>();
	public static ArrayList<String> ex_BillAcctRegion= new ArrayList<String>();*/

	//variablesThroughWhichXMWillBeModified
	public static String sourceAppId;
	public static String msgSourceSysId;
	public static String billAcctRegion;
	public static String billAppId;
	public static String destAppId;
	
	//other variables
	public static int currentRowNumber=0;
	public static int envRowNumber=0;
	public static WebDriver driver;
	public String currentDateTime;
	//public String executeStr="Y";
	public static String reqXML;
	public static String responseXML;
	public static boolean elementsFound;
	public static int paymentStatusIndex=0;
	public static final String time="T07:35:00.445-05:00";
	public static String exactAmount;
	public static ArrayList<String> qportalAmounts=new ArrayList<String>();
	public static int dbCount=0;
	
	// variable for elements that are not found in a page
	public static String elementNotFound = "";
	
	//xml tags variable
	public static final String tagBTN="ns2:BillingAcctId";
	public static final String tagInputChannel="ns2:InputChannelId";
	public static final String tagBillingAccountRegion="ns2:BillingAcctRegion";
	public static final String tagBillingAppID = "ns2:BillingApplicationId";
	public static final String tagDestinationAppId = "ns2:DestinationApplicationId";
	public static final String tagInputChannelId="ns2:InputChannelId";
	public static final String tagMsgSourceSysTag="bim:MessageSrcSystem";
	public static final String tagSourceAppID="ns2:SrcApplicationId";
	public static final String tagCustomerType="ns2:CustomerType";
	public static final String tagPaymentScheduleType="ns2:PaymentScheduleType";
	public static final String tagPaymentProcessDateTime="ns2:PaymentProcessDateTime";
	public static final String tagRequestID="bim:RequestId";
	
	//MultiPayment Request tags
	public static final String mul_RequestIDTag = "bim:RequestId";
	public static final String mul_MsgSourceSystemTag = "bim:MessageSrcSystem";
	public static final String mul_SourceApplicationTag = "xs:SrcApplicationId";
	public static final String mul_InputChannelTag = "xs:InputChannelId";
	public static final String mul_PaymentProcessDateTag = "xs:PaymentProcessDateTime";
	public static final String mul_CustomerTypeTag = "xs:CustomerType";
	public static final String mul_DestinationAppIDTag = "xs:DestinationApplicationId";
	public static final String mul_BillAccntRegionTag = "xs:BillingAcctRegion";
	public static final String mul_BillAppIDTag = "xs:BillingApplicationId";
	public static final String mul_BillAccntIDTag = "xs:BillingAcctId";
	public static final String mul_PaymentAmtTag = "xs:PaymentAmt";
	
	//dbQueries
	public static final String projCodeDefSourceAppQuery="select SOURCE_APPLICATION_CD from project_code_def where input_channel_cd = '";
	public static final String paymentStatusQuery = "select PAYMENT_STATUS_CD from payment where payment_id = '";
	public static final String batchTransIDQuery = "select batch_transaction_id from batch_transaction where batch_transaction_typ = 'CaptureRequest';";
	public static final String walletCreationQuery = "select record_status_cd from wallet_request where wallet_reference_val = '";
	public static final String multiPaymentIdQuery = "select payment_id from payment where PMT_VERIFICATION_REFERENCE_VAL='";
	public static final String multiPaymentStatusQuery = "select payment_status_cd from payment where PMT_VERIFICATION_REFERENCE_VAL='";
	public static final String isAmountPayableRuleQuery = "select rule_applied_ind from payment_process_rule_ref where rule_nm = 'IsAmtEditable' and  input_channel_cd = '";
	public static final String recordStatusQuey = "select record_status_cd from enrollment_request where BILLING_APPLICATION_ACCNT_ID = '";
	public static final String hcdeIframeTypeRuleQuery = "select RULE_TXT from payment_process_rule_ref where rule_nm = 'HCDEIframeType' and input_channel_cd = '";
	
	//dbConnectionVariables
	public static Connection dBConn;
	public static ResultSet queryResult;
	public static ResultSet queryResultPaymentStatusCd;
	public static PreparedStatement preparedStatement;
	public static Statement statement;
	
	//dbResultsStoredVariables
	public static String ruleAppliedInd;
	public static String ruleText;
	public static ArrayList<String> paymentDBStatusList = new ArrayList<String>();
	public static ArrayList<String> paymentDBTempStatus = new ArrayList<String>();
	List<String> paymentIdList= new ArrayList<String>();
	List<String> paymentStatusCdList= new ArrayList<String>();
	public static String walletDBStatus;
	public static String autopayDBStatus;
	public static String paymentDBStatus;
	
	//dbComparisonData
	public static final String variousPaymentStatus[] = { "capture_ready",
			"capture_requested", "settlement_completed", "posting_requested",
			"posted" };
	public static final String walletRecordStatus = "Processed";
	public static final String autopayRecordStatus[] = {"Processed", "Submitted"};
}
