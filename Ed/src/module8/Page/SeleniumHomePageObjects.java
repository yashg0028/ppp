package module8.Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SeleniumHomePageObjects {
	
	@FindBy(partialLinkText = "Downloa")
	WebElement ClickDownload;
	
	@FindBy(linkText = "Projects")
	WebElement ClickProjects;
	
	@FindBy(linkText = "Browser Automation")
	WebElement ClickHome;
	
	public SeleniumHomePageObjects(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void GotoDownload() {
		ClickDownload.click();
		
	}
	
	public void GotoProjects() {
		ClickProjects.click();
	}
	
	public void GotoHome() {
		ClickHome.click();
	}
}
