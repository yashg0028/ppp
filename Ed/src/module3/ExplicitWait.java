package module3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {

		// Open browser
		System.setProperty("webdriver.chrome.driver", "G:\\Folder Structure\\Installation Stuff\\Drivers\\chromedriver1.exe");
		WebDriver driver = new ChromeDriver();

		// Open AUT
		driver.get("http://seleniumautomationpractice.blogspot.com/2017/10/waitcommands.html");

		WebDriverWait wait = new WebDriverWait(driver, 25);
  
	wait.until(ExpectedConditions.elementToBeClickable(By.linkText("LinkText-6"))).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("LinkText-6"))).click();
	}
}
