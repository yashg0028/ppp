package pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HCDETokenizationDetailspage {
	
	@FindBy(id="MethodOfPayment")
	private static WebElement PaymentMethod;
 
	@FindBy(xpath=".//*[@value='NewCheckingAccount']")
	private static WebElement CheckingAccount;
 
	@FindBy(xpath=".//*[@value='NewSavingsAccount']")
	private static WebElement SavingsAccount;
 
	@FindBy(xpath=".//*[@value='NewCreditCard']")
	private static WebElement CreditCard;
 
	@FindBy(xpath = "//input[@id='DateOfPayment']")
	private static WebElement dateOfPaymentTextbox;
 
	@FindBy(id="routingNum")
	private static WebElement routingNumberTextBox;
 
	@FindBy(id="acctNum")
	private static WebElement accountNumberTextBox;
 
	@FindBy(id="voiceTokenNumber")
	private static WebElement voiceTokenTextBox;
 
	@FindBy(id = "expiryMonth")
	private static WebElement expiryMonthComboBox;
	
	@FindBy(id = "expiryYear")
	private static WebElement expiryYearComboBox;
 
	@FindBy(name = "cardZip")
	private static WebElement zipcodeTextBox;
 
	@FindBy(id="TermsAndCon")
	private static WebElement iAgreeCheckBox;
 
	@FindBy(name = "Next")
	private static WebElement nextButton;
 
	@FindBy(id="PaymentAmount")
	private static WebElement amountPaidTextBox;
 
	public static WebElement getPaymentMethod(){
		return PaymentMethod;
    }
 
	public static WebElement getCheckingAccount(){
		return CheckingAccount;
    }
 
	public static WebElement getSavingsAccount(){
		return SavingsAccount;
	}
 
	public static WebElement getCreditCard(){
		return CreditCard;
	}

	public static WebElement getdateOfPaymentTextbox(){
		return dateOfPaymentTextbox;
	}
 
	public static WebElement getroutingNumberTextBox(){
		return routingNumberTextBox;
	}	
 
	public static WebElement getaccountNumberTextBox(){
		return accountNumberTextBox;
	}	
 
	public static WebElement getvoiceTokenTextBox(){
		return voiceTokenTextBox;
	} 
 
	public static WebElement getexpiryMonthComboBox(){
		return expiryMonthComboBox;
	}	
 
	public static WebElement getexpiryYearComboBox(){
		return expiryYearComboBox;
	} 
 
	public static WebElement getiAgreeCheckBox(){
		return iAgreeCheckBox;
	} 
	
	public static WebElement getnextButton(){
		return nextButton;
	} 
 
	public static WebElement getamountPaidTextBox(){
		return amountPaidTextBox;
	} 

	public static WebElement getzipcodeTextBox(){
		return zipcodeTextBox;
	}

 
}
