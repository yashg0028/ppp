package genericUtilities;




import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


import pageFactory.HCDEReceiveConfirmationPage;

import dataOperations.ExcelOperations;
import pageFactory.HCDEChooseMethodPaymentPage;
import pageFactory.HCDEPaymentInformationPage;
import pageFactory.HCDEVerifyInformationPage;
import pageFactory.HCDEWelcomeToSpeedpayPage;
import pageFactory.PaypalCardPaymentPage;
import pageFactory.PaypalChoosePaymentMethodPage;
import pageFactory.PaypalLoginPage;
import pageFactory.PaypalPaymentPage;
import pageFactory.PaypalVerificationPage;



public class IFrameNavigation extends GlobalVariables {
	
	DataFromDB dataFromDB = new DataFromDB();
	ExcelOperations excelOperations = new ExcelOperations();
	CommonMethods commonMethods = new CommonMethods();
	
	public boolean payFromHCDEIframe() throws Exception {
		
		if(sessionURL.contains("/payment/")){

		
			InitHCDEPages(driver);
			
			ruleAppliedInd = dataFromDB.checkRuleAppliedStatus(ex_InputChannel);
	        ruleText = dataFromDB.checkRuleText(ex_InputChannel);
	      
			if (paymentType.equalsIgnoreCase("ACH")) {
				
				if (ruleText.equalsIgnoreCase("B")||ruleText.equalsIgnoreCase(""))
					elementsFound = payByCoBrandedBankPages();
				else
					elementsFound = payByBankHCDE();
			} else if(paymentType.equalsIgnoreCase("CARD")) {
				if (ruleText.equalsIgnoreCase("B")||ruleText.equalsIgnoreCase(""))
					elementsFound = payByCoBrandedCardPages();
				else
					elementsFound = payByCardHCDE();
			}
		}else if(sessionURL.contains("prepaidpayment")){
			
			InitPaypalPages(driver);
			if(paymentType.contains("Paypal")){
				payFromPaypal();
			}else if(paymentType.contains("Card")){
				payByCard();
			}
			
		}
	
		/*if (elementsFound) {
			if (driver.getCurrentUrl()
					.contains(GlobalVariables.successNotificationUrl)) {
				System.out.println("payment made successfully");
			} else {
				System.out.println("Payment was not successful.Navigated to:"
						+ driver.getCurrentUrl());
				elementsFound = false;
				 excelOperations.writeDataIntoExcel("FAIL", GlobalVariables.tcStatusName);
	             excelOperations.writeDataIntoExcel("Payment was not successful.Navigated to:"
							+ driver.getCurrentUrl()
							+ " and Session ID is:"
							+ GlobalVariables.sessionIDValue,GlobalVariables.tcCommentsName);               
			}
		}*/

		driver.quit();
		return elementsFound;
	}
	
	// CoBraded pages
	private boolean payByCoBrandedBankPages() throws Exception {
		if (HCDEChooseMethodPaymentPage
						.getPayWithBankBtn().isDisplayed()) {
				HCDEChooseMethodPaymentPage.getPayWithBankBtn().click();
					if (payByBankHCDE())
						return true;
					else
						return false;
		} else {
			/*excelOperations.writeDataIntoExcel("FAIL", colStatus);
			excelOperations.writeDataIntoExcel(GlobalVariables.elementNotFound
					+ " not found in HCDEChooseMethodPaymentPage", colComments);*/
			return false;
		}
	}
	// Pay for the BTN with Bank Details using HCDE
	private boolean payByBankHCDE() throws Exception {
		if (commonMethods
				.CheckElementVisibility(HCDEPaymentInformationPage
						.getPaymentMethodComboBox())) {
			
			Select methodpaymentDropdown = new Select(
					HCDEPaymentInformationPage.getPaymentMethodComboBox());
			
    
		if (verifyHCDEBankPaymentPage()) {
				
			if(scenarioName.contains("New")){
				
				methodpaymentDropdown
				.selectByVisibleText(ex_InstrumentType);
				HCDEPaymentInformationPage.getRoutingNumberTextBox().sendKeys(
						ex_RoutingNumber);
				HCDEPaymentInformationPage.getAccountNumberTextBox().sendKeys(
						commonMethods.getRandomNumber(9));
					
					
				if(HCDEPaymentInformationPage.getSaveCheckbox().isDisplayed()){
					if(scenarioName.contains("DoNotSaveToWallet")){
									;
					}else if(scenarioName.contains("SaveToWallet")){
						HCDEPaymentInformationPage.getSaveCheckbox().click();
					}
				}
			}else{
				
				List<WebElement> methodOfPayments=methodpaymentDropdown.getOptions();
				
				for(int p=0;p<methodOfPayments.size();p++){
					
					if((methodOfPayments.get(p).getText()).contains(ex_InstrumentType)){
						methodpaymentDropdown.selectByVisibleText(methodOfPayments.get(p).getText());
						break;
					}
					
				}
			}
				
			if (HCDEPaymentInformationPage.getAmountPaidTextBox()
					.getAttribute("readonly") == null) {
				HCDEPaymentInformationPage.getAmountPaidTextBox().clear();
				HCDEPaymentInformationPage.getAmountPaidTextBox().sendKeys(
							commonMethods.getAmountToBePaid());
			}
					
			if(scenarioName.contains("Scheduled") && (scenarioName.contains("Ensemble"))==false){

					HCDEPaymentInformationPage.getDateOfPaymentTextbox().click();
					HCDEPaymentInformationPage.getDateOfPaymentTextbox().clear();
					HCDEPaymentInformationPage.getDateOfPaymentTextbox().sendKeys(ex_ScheduledDate);	
				
			}
				
			HCDEPaymentInformationPage.getIAgreeCheckbox().click();

			HCDEPaymentInformationPage.getNextButton().click();
			commonMethods.explicitWait(20, HCDEVerifyInformationPage.getSubmitPaymentButton());
			if (commonMethods
				.CheckElementVisibility(HCDEVerifyInformationPage
								.getSubmitPaymentButton())) {
					HCDEVerifyInformationPage.getSubmitPaymentButton().click();
					return true;
				} else {
					/*excelOperations
							.writeDataIntoExcel(
									"FAIL",
									colStatus);*/
					return false;
				}
			} else {
				/*excelOperations.writeDataIntoExcel("FAIL",
						colStatus);*/
				return false;
			}
		} else {
			/*excelOperations.writeDataIntoExcel("FAIL",
					colStatus);*/
			return false;
		}
	}
		
	// pay from co branded pages card
	private boolean payByCoBrandedCardPages() throws Exception {
		if (commonMethods
				.CheckElementVisibility(HCDEChooseMethodPaymentPage
						.getPayWithCardBtn())) {
			HCDEChooseMethodPaymentPage.getPayWithCardBtn().click();
				if (commonMethods
					.CheckElementVisibility(HCDEWelcomeToSpeedpayPage
							.getAgreeButton())) {
				HCDEWelcomeToSpeedpayPage.getAgreeButton().click();
				if (payByCardHCDE())
					return true;
				else
					return false;
			} else {
				excelOperations.writeDataIntoExcel("FAIL", colTransactionStatus);
				return false;
			}
		} else {
			excelOperations.writeDataIntoExcel("FAIL", colTransactionStatus);
			return false;

		}
	}
		
	//Pay for the BTN using CARD details using IBM
	private boolean payByCardHCDE() throws Exception {
		
		if(verifyHCDECardPaymentPage()){ 
		}
		Select methodpaymentDropdown= new Select(
				HCDEPaymentInformationPage.getPaymentMethodComboBox());
		
		if(scenarioName.contains("New")){
			
			if(HCDEPaymentInformationPage
					.getPaymentMethodComboBox().isDisplayed()) {
				methodpaymentDropdown.selectByVisibleText(ex_InstrumentType);
			}
			if(HCDEPaymentInformationPage.getCardNumberTextBox().isDisplayed()){
				HCDEPaymentInformationPage.getCardNumberTextBox().sendKeys(ex_CardNumber);	
			}
			if(HCDEPaymentInformationPage.getExpiryMonthComboBox().isDisplayed()){
				Select monthDropdown = new Select(HCDEPaymentInformationPage.getExpiryMonthComboBox());
				monthDropdown.selectByIndex(Integer.parseInt(commonMethods.getRandomNumber(1))+2);
			}
			if(HCDEPaymentInformationPage.getExpiryYearComboBox().isDisplayed()){
				Select yearDropDown = new Select(HCDEPaymentInformationPage.getExpiryYearComboBox());
				yearDropDown.selectByIndex(Integer.parseInt(commonMethods.getRandomNumber(1))+2);
			}
			if(HCDEPaymentInformationPage.getZipcodeTextBox().isDisplayed()){
				HCDEPaymentInformationPage.getZipcodeTextBox().clear();
				HCDEPaymentInformationPage.getZipcodeTextBox().sendKeys(commonMethods.getRandomNumber(5));
			}
			if(HCDEPaymentInformationPage.getSaveCheckbox().isDisplayed()){
				if(scenarioName.contains("DoNotSaveToWallet")){
					;
				}else if(scenarioName.contains("SaveToWallet")){
					HCDEPaymentInformationPage.getSaveCheckbox().click();
				}
			}
			
		}else {
			
			List<WebElement> methodOfCardPayments=methodpaymentDropdown.getOptions();
			
			for(int q=0;q<methodOfCardPayments.size();q++){
				
				if((methodOfCardPayments.get(q).getText()).contains(ex_InstrumentType)){
					methodpaymentDropdown.selectByVisibleText(methodOfCardPayments.get(q).getText());
					break;
				}
				
			}
			
		}
		
							
		if(HCDEPaymentInformationPage.getAmountPaidTextBox()
				.getAttribute("readonly") == null && (ruleAppliedInd.equalsIgnoreCase("N") || ruleAppliedInd.equalsIgnoreCase(""))){
			HCDEPaymentInformationPage.getAmountPaidTextBox().clear();
			HCDEPaymentInformationPage.getAmountPaidTextBox().sendKeys(
					commonMethods.getAmountToBePaid());
		}	
					
		if(scenarioName.contains("Scheduled") && (scenarioName.contains("Ensemble"))==false){
			HCDEPaymentInformationPage.getDateOfPaymentTextbox().click();
			HCDEPaymentInformationPage.getDateOfPaymentTextbox().clear();
			HCDEPaymentInformationPage.getDateOfPaymentTextbox().sendKeys(ex_ScheduledDate);
		}
								
		HCDEPaymentInformationPage.getIAgreeCheckbox().click();
		HCDEPaymentInformationPage.getNextButton().click();
				
		if (commonMethods
				.CheckElementVisibility(HCDEVerifyInformationPage
						.getSubmitPaymentButton())) {
			HCDEVerifyInformationPage.getSubmitPaymentButton().click();
			return true;
		} 
		excelOperations.writeDataIntoExcel("FAIL", colTransactionStatus);
		return false;
	}
				
	// verify all elements exist in HCDE bank payment Page
	private boolean verifyHCDEBankPaymentPage() {
		if (commonMethods
				.CheckElementVisibility(HCDEPaymentInformationPage
						.getAmountPaidTextBox())
				&& commonMethods
				.CheckElementVisibility(HCDEPaymentInformationPage
						.getRoutingNumberTextBox())
				&& commonMethods
				.CheckElementVisibility(HCDEPaymentInformationPage
						.getAccountNumberTextBox())
				&& commonMethods
				.CheckElementVisibility(HCDEPaymentInformationPage
						.getNextButton())
				&& commonMethods
				.CheckElementVisibility(HCDEPaymentInformationPage
						.getIAgreeCheckbox()))
			return true;
		else
			return false;
	}
				
	// verify if all elements exist in HCDE card payment page
	private boolean verifyHCDECardPaymentPage() {
		if (commonMethods
				.CheckElementVisibility(HCDEPaymentInformationPage
						.getCardNumberTextBox())
				&& commonMethods
				.CheckElementVisibility(HCDEPaymentInformationPage
						.getExpiryMonthComboBox())
				&& commonMethods
				.CheckElementVisibility(HCDEPaymentInformationPage
						.getExpiryYearComboBox())
				&& commonMethods
				.CheckElementVisibility(HCDEPaymentInformationPage
						.getNextButton())
				&& commonMethods
				.CheckElementVisibility(HCDEPaymentInformationPage
						.getIAgreeCheckbox())
				&& commonMethods
				.CheckElementVisibility(HCDEPaymentInformationPage
						.getZipcodeTextBox()))
			return true;
		else
			return false;
	}
	
	public void payFromPaypal(){
		
		PaypalChoosePaymentMethodPage.getPaypalButton().click();
		PaypalChoosePaymentMethodPage.getAgreeTermsAndConditionCheckbox().click();
		commonMethods.JavaScriptExecutorClick(PaypalChoosePaymentMethodPage.getContinueToPaypalButton());
		String firstWindowHandle=driver.getWindowHandle();
		for(String winHandle : driver.getWindowHandles()){
            driver.switchTo().window(winHandle);
            driver.manage().window().maximize();
        }
        commonMethods.implicitWait(5000);
		driver.switchTo().frame(driver.findElement(By.name("injectedUl")));
		PaypalLoginPage.getPaypalUsernameTextbox().sendKeys(ex_PaypalUsername);
		commonMethods.explicitWait(100, PaypalLoginPage.getPaypalPasswordTextbox());
		PaypalLoginPage.getPaypalPasswordTextbox().sendKeys(ex_PaypalPassword);
		PaypalLoginPage.getLogInButton().click();
		driver.switchTo().defaultContent();
		WebElement agreeAndContinue=driver.findElement(By.id("confirmButtonTop"));
		commonMethods.JavaScriptExecutorClick(agreeAndContinue);
		commonMethods.implicitWait(10000);
		driver.switchTo().window(firstWindowHandle);
		commonMethods.implicitWait(10000);
		if(commonMethods.CheckElementVisibility(PaypalVerificationPage.getPlaceMyOrderSecurelyButton()))
		{
			commonMethods.explicitWait(100, PaypalVerificationPage.getPlaceMyOrderSecurelyButton());
			commonMethods.JavaScriptExecutorClick(PaypalVerificationPage.getPlaceMyOrderSecurelyButton());
		}
		
	}
	
public void payByCard(){
		
		PaypalChoosePaymentMethodPage.getCardButton().click();
		
		if(commonMethods.CheckElementVisibility(PaypalCardPaymentPage.getCardNumber()))
		{
			PaypalCardPaymentPage.getCardNumber().sendKeys(ex_CardNumber);
		}
		if(commonMethods.CheckElementVisibility(PaypalCardPaymentPage.getNameOnCard()))
		{
			PaypalCardPaymentPage.getNameOnCard().sendKeys(ex_CardName);
		}
		if(commonMethods.CheckElementVisibility(PaypalCardPaymentPage.getExpirationMonth()))
		{
			Select s11 = new Select(PaypalCardPaymentPage.getExpirationMonth());
		    s11.selectByIndex(1);
		}
		if(commonMethods.CheckElementVisibility(PaypalCardPaymentPage.getExpirationYear()))
		{
			Select s12 =new Select(PaypalCardPaymentPage.getExpirationYear());
			s12.selectByIndex(2);
		}
		if(commonMethods.CheckElementVisibility(PaypalCardPaymentPage.getBillingZipCode()))
		{
			PaypalCardPaymentPage.getBillingZipCode().clear();
			PaypalCardPaymentPage.getBillingZipCode().sendKeys(commonMethods.getRandomNumber(5));
		}
		PaypalCardPaymentPage.getAgreeTermsAndConditionCheckbox().click();
		if(commonMethods.CheckElementVisibility(PaypalCardPaymentPage.getPlaceMyOrderSecurelyButton()))
		{
			commonMethods.explicitWait(100, PaypalCardPaymentPage.getPlaceMyOrderSecurelyButton());
			commonMethods.JavaScriptExecutorClick(PaypalCardPaymentPage.getPlaceMyOrderSecurelyButton());
		}
	}
	
	// Initiate page factory for HCDE pages (why we are using these methods)
	private static void InitHCDEPages(WebDriver driver) {
		
		PageFactory.initElements(driver, HCDEPaymentInformationPage.class);
		PageFactory.initElements(driver, HCDEReceiveConfirmationPage.class);
		PageFactory.initElements(driver, HCDEVerifyInformationPage.class);
		PageFactory.initElements(driver, HCDEChooseMethodPaymentPage.class);
		PageFactory.initElements(driver, HCDEWelcomeToSpeedpayPage.class);
					
	}
	
	private static void InitPaypalPages(WebDriver driver){
		PageFactory.initElements(driver, PaypalChoosePaymentMethodPage.class);
		PageFactory.initElements(driver, PaypalLoginPage.class);
		PageFactory.initElements(driver, PaypalVerificationPage.class);
	}

}
