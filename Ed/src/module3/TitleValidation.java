package module3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitleValidation {

	public static void main(String[] args) {

		// Open Browser
		System.setProperty("webdriver.chrome.driver", "G:\\Folder Structure\\Installation Stuff\\Drivers\\chromedriver1.exe");
		WebDriver driver = new ChromeDriver();
		
		//Open the AUT
		driver.get("https://www.amazon.in/");
		
		//Capture the Title of the Page
		String Apptitle = driver.getTitle();
		System.out.println(Apptitle);
		
		//validate the actual title VS Expected Title
		boolean Result = Apptitle.equals("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
		
		System.out.println(Result);
	}
}
