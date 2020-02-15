package module8.TestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import module8.Page.GoogleHomePageObjects;
import module8.Page.SeleniumHomePageObjects;

public class GoogleSearch {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "G:\\Folder Structure\\Installation Stuff\\Drivers\\chromedriver1.exe");
		driver = new ChromeDriver();

		driver.get("https://www.google.com/");
		
		GoogleHomePageObjects page = new GoogleHomePageObjects(driver); //using google page object
		
		page.SearchOnGoogle("SeleniumHQ");   //calling SearchOnGoogle Method using page instance
		
		page.SearchOnGoogle("Edureka");		//calling SearchOnGoogle Method using page instance
		
		page.SearchOnGoogle("Abhresh");		//calling SearchOnGoogle Method using page instance
		
		page.SearchOnGoogle("SeleniumHQ");	//calling SearchOnGoogle Method using page instance
		
		page.ClickSelLink();									//calling ClickSelLink Method using page instance
				
		SeleniumHomePageObjects page2 = new SeleniumHomePageObjects(driver); //using Selenium Page Object
																				// Calling Selenium page class and using Selenium page methods.
		Thread.sleep(5000);
		
		page2.GotoDownload();		//calling GotoDownload Method using page2 instance
		
		Thread.sleep(5000);
		
		page2.GotoHome();			//calling GotoHome Method using page2 instance
		
		Thread.sleep(5000);
		
		page2.GotoProjects();		//calling GotoProjects Method using page2 instance
		
		
		driver.quit();
		
		
	}

}
