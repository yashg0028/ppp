package pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaypalChoosePaymentMethodPage {
	
	@FindBy(id="paypal-img-id")
	private static WebElement paypalButton;
	
	@FindBy(xpath="//span[@onclick='javascript:enablePaypalCheckbox()']")
	private static WebElement agreeTermsAndConditionCheckbox;
	
	@FindBy(id="submitPaypal")
	private static WebElement continueToPaypalButton;
	
	@FindBy(id="card-img-id")
	private static WebElement cardButton;
	
	public static WebElement getPaypalButton(){
		return paypalButton;
	}
	
	public static WebElement getAgreeTermsAndConditionCheckbox(){
		return agreeTermsAndConditionCheckbox;
	}
	
	public static WebElement getContinueToPaypalButton(){
		return continueToPaypalButton;
	}
	
	public static WebElement getCardButton()
	{
		return cardButton;
	}
}
