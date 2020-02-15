package module2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class SeBasic {

	public static void main(String[] args) {

System.setProperty("webdriver.chrome.driver","G:\\Folder Structure\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		
	}

}
