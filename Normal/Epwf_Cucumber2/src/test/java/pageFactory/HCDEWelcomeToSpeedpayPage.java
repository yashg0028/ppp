package pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HCDEWelcomeToSpeedpayPage {
	
	@FindBy(linkText="I Agree")
	private static WebElement AgreeButton;
	
	@FindBy(id="Cancel")
	private static WebElement CancelButton;

	public static WebElement getAgreeButton() {
		return AgreeButton;
	}

	public static WebElement getCancelButton() {
		return CancelButton;
	}
	
}
