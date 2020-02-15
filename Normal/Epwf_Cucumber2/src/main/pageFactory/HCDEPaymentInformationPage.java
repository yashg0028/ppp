package pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HCDEPaymentInformationPage {
	
	@FindBy(id = "MethodOfPayment")
	private static WebElement paymentMethodComboBox;
	
	@FindBy(name = "routingNum")
	private static WebElement routingNumberTextBox;
	
	@FindBy(name = "bankAccntNum")
	private static WebElement accountNumberTextBox;
	
	@FindBy(name = "cardNum")
	private static WebElement cardNumberTextBox;
	
	@FindBy(name = "cardZip")
	private static WebElement zipcodeTextBox;
	
	@FindBy(id = "expiryMonth")
	private static WebElement expiryMonthComboBox;
	
	@FindBy(id = "expiryYear")
	private static WebElement expiryYearComboBox;
	
	@FindBy(xpath = "//input[@id='DateOfPayment']")
	private static WebElement dateOfPaymentTextbox;
	
	@FindBy(xpath="//span[contains(@onclick,'TCCheckbox')]")
	private static WebElement iAgreeCheckbox;
	
	@FindBy(xpath="(//span[@class='checkbox-disable-icon'])[1]")
	private static WebElement saveCheckbox;
	
	@FindBy(name = "Next")
	private static WebElement nextButton;
	
	@FindBy(id="PaymentAmount")
	private static WebElement amountPaidTextBox;

	public static WebElement getSaveCheckbox(){
		return saveCheckbox;
	}

	public static WebElement getIAgreeCheckbox() {
		return iAgreeCheckbox;
	}

	public static WebElement getDateOfPaymentTextbox() {
		return dateOfPaymentTextbox;
	}

	
	public static WebElement getAmountPaidTextBox() {
		return amountPaidTextBox;
	}


	public static WebElement getPaymentMethodComboBox() {
		return paymentMethodComboBox;
	}

	public static WebElement getRoutingNumberTextBox() {
		return routingNumberTextBox;
	}

	public static WebElement getAccountNumberTextBox() {
		return accountNumberTextBox;
	}

	public static WebElement getCardNumberTextBox() {
		return cardNumberTextBox;
	}

	public static WebElement getZipcodeTextBox() {
		return zipcodeTextBox;
	}

	public static WebElement getExpiryMonthComboBox() {
		return expiryMonthComboBox;
	}

	public static WebElement getExpiryYearComboBox() {
		return expiryYearComboBox;
	}
	
	
	public static WebElement getNextButton() {
		return nextButton;
	}
	
	
	
	
	
	//------------------------------------------------------------------
		@FindBy(id="BankAcctType")
			private static WebElement accountdropdown_update;
			
			public static WebElement getaccountdropdown() {
				return accountdropdown_update;
			}
			
			@FindBy(id="reviewAch")
			   private static WebElement nextButton_PaymentInformation;
				public static WebElement clickNextButton()
				{
					return nextButton_PaymentInformation;
				}
				
				@FindBy(id="submitAch")
				   private static WebElement savebutton_PaymentInformation;
					public static WebElement clicksaveButton()
					{
						return savebutton_PaymentInformation;
					}
					
					@FindBy(id="done")
					   private static WebElement donebutton_PaymentInformation;
						public static WebElement doneButton()
						{
							return donebutton_PaymentInformation;
						}

	
}
