package module6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Dependency {

	WebDriver driver;

	@Test(priority = 0)
	public void OpenBrowser() {
		System.setProperty("webdriver.chrome.driver", "G:\\Folder Structure\\Installation Stuff\\Drivers\\chromedriver1.exe");
		driver = new ChromeDriver();

	}

	@Test(priority = 1)
	public void OpenAUT() {
		driver.get("http://newtours.demoaut.com/");
	}

	@Test(priority = 3)
	public void Login() throws InterruptedException {
			
		// Enter UserID
		driver.findElement(By.name("userName")).sendKeys("tutorial");

		// Enter Password
		driver.findElement(By.name("password")).sendKeys("tutorial");

		// Click on Sign in button
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);
	}

	@Test(priority = 2, dependsOnMethods = "Login")
	public void Logout() throws InterruptedException {
		// Click on Sign off
		driver.findElement(By.linkText("SIGN-OF")).click();   /// here attr value is SIGN-OFF, but i gave it as SIGN-OF 
																											//hence this method will fail,hence subsequent dependent method  close browser gets skipped
		Thread.sleep(3000);
	}

	@Test(priority = 6, dependsOnMethods = "Logout")
	public void CloseBrowser() {
		driver.close();
	}
}

