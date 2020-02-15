package module9.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FormPage {
																			//1. webelement creation through a variable(Fname etc) and connecting(@FindBy) it to webelement address.
	@FindBy(name = "ts_first_name")
	WebElement FName;
	
	@FindBy(name = "ts_last_name")
	WebElement LName;
	
	@FindBy(name = "ts_address")
	WebElement Address;
	
	public FormPage(WebDriver driver) {
		PageFactory.initElements(driver, this);		//Create Constructor with webdriver as driver
	}																				//intialise webelements using pagefactory
	
	
	public void FormFill(String fName, String lName, String add) throws Exception {
		
		FName.clear();							//method declaration 
		FName.sendKeys(fName);
		
		LName.clear();
		LName.sendKeys(lName);
		
		Address.clear();
		Address.sendKeys(add);
		
		Thread.sleep(5000);
		
	}
}


