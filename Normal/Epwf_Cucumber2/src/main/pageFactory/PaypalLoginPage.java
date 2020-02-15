package pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaypalLoginPage {
	
	@FindBy(id="email")
	private static WebElement paypalUsernameTextbox;
	
	@FindBy(id="password")
	private static WebElement paypalPasswordTextbox;
	
	@FindBy(id="btnLogin")
	private static WebElement logInButton;
	
	public static WebElement getPaypalUsernameTextbox(){
		return paypalUsernameTextbox;
	}
	
	public static WebElement getPaypalPasswordTextbox(){
		return paypalPasswordTextbox;
	}
	
	public static WebElement getLogInButton(){
		return logInButton;
	}
	
	
}
