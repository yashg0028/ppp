package pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaypalPaymentPage {
	
	
	@FindBy(id="confirmButtonTop")
	private static WebElement paypalPaymentConfirmationButton;
	
	public static WebElement getPaypalPaymentConfirmationButton(){
		return paypalPaymentConfirmationButton;
	}
	
}
