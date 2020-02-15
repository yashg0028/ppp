package pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaypalCardPaymentPage {
	@FindBy(id="name")
	private static WebElement cardNumber;
	
	@FindBy(id="NameOnCard")
	private static WebElement nameOnCard;
	
	@FindBy(id="expiryMonth")
	private static WebElement expirationMonth;
	
	@FindBy(id="expiryYear")
	private static WebElement expirationyear;
	
	@FindBy(name="cardZip")
	private static WebElement billingZipCode;
	
	@FindBy(xpath="//span[@onclick='javascript:enableCardTCCheckbox()']")
	private static WebElement agreeTermsAndConditionCheckbox;
	
	@FindBy(id="submitCard")
	private static WebElement placeMyOrderSecurelyButton;
	
	public static WebElement getCardNumber()
	{
		return cardNumber;
	}

	public static WebElement getNameOnCard()
	{
		return nameOnCard;
	}
	
	public static WebElement getExpirationMonth()
	{
		return expirationMonth;
	
	}
	public static WebElement getExpirationYear()
	{
		return expirationyear;
	}
	
	public static WebElement getBillingZipCode()
	{
		return billingZipCode;
	}
	public static WebElement getAgreeTermsAndConditionCheckbox()
	{
		return agreeTermsAndConditionCheckbox;
	}
	public static WebElement getPlaceMyOrderSecurelyButton()
	{
		return placeMyOrderSecurelyButton;
	}
}
