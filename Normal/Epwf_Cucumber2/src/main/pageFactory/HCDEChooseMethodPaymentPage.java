package pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HCDEChooseMethodPaymentPage {
	
	@FindBy(xpath = "//a[contains(text(),'No Fee')]")
	private static WebElement payWithBankBtn;

	@FindBy(xpath = "//a[@onclick = 'spayPopUp()']")
	private static WebElement payWithCardBtn;
	
	public static WebElement getPayWithCardBtn() {
		return payWithCardBtn;
	}
	
	public static WebElement getPayWithBankBtn() {
		return payWithBankBtn;
	}
	
}
