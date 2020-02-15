package module3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ErrorValidation {

	public static void main(String[] args) throws InterruptedException {

		// Open Browser
		System.setProperty("webdriver.chrome.driver", "G:\\Folder Structure\\Installation Stuff\\Drivers\\chromedriver1.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.naukri.com/nlogin/login");
		
		driver.findElement(By.id("usernameField")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.id("passwordField")).click();
		Thread.sleep(1000);
		WebElement errmsg = driver.findElement(By.id("passwordField_err"));
		
		boolean ErrorMessage = errmsg.equals("Password cannot be left blank");
		
		System.out.println(ErrorMessage);
		
		
		
	}

}
