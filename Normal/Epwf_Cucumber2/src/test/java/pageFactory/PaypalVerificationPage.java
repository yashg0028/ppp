package pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaypalVerificationPage {

	@FindBy(id="submitPaypal")
	private static WebElement placeMyOrderSecurelyButton;
	
	public static WebElement getPlaceMyOrderSecurelyButton(){
		return placeMyOrderSecurelyButton;
	}
		
}
