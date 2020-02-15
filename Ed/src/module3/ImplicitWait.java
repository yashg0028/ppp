package module3;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) throws InterruptedException {

		// Open browser
		System.setProperty("webdriver.chrome.driver", "G:\\Folder Structure\\Installation Stuff\\Drivers\\chromedriver1.exe");
		WebDriver driver = new ChromeDriver();

		// PageLoad
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS); // 0-10

		driver.get("http://www.edureka.co/");

		// Implicitly wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// SetScript Timeout
		driver.manage().timeouts().setScriptTimeout(40, TimeUnit.SECONDS);

		driver.findElement(By.name("userName")).sendKeys("tutorial");// 0-10
		driver.findElement(By.name("password")).sendKeys("tutorial");// 0-10
		driver.findElement(By.name("login")).click();// 0-10

		driver.findElement(By.linkText("PROFILE")).click();// 0-10

		driver.quit();

	}

}
