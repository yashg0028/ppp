package pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HCDEReceiveConfirmationPage {
	
	@FindBy(id = "submitPayment")
	private static WebElement submitPaymentButton;
	
	@FindBy(xpath = "//a[contains(@href,'cancel')]")
	private static WebElement cancelLink;
	
	@FindBy(xpath = "//a[contains(@href,'makeChanges')]")
	private static WebElement makeChangesLink;
	

	public static WebElement getCancelLink() {
		return cancelLink;
	}


	public static WebElement getMakeChangesLink() {
		return makeChangesLink;
	}


	public static WebElement getSubmitPaymentButton() {
		return submitPaymentButton;
	}
	
}
