package module6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DisableEnable {

	WebDriver driver;

	@Test(priority = 0)
	public void OpenBrowser() {
		System.setProperty("webdriver.chrome.driver", "G:\\Folder Structure\\Installation Stuff\\Drivers\\chromedriver1.exe");
		driver = new ChromeDriver();
		
	}

	@Test(priority = 21)
	public void OpenAUT() {
		driver.get("http://newtours.demoaut.com/");
	}

	@Test(priority = 25, enabled = false)
	public void Login() throws InterruptedException {

		driver.findElement(By.linkText("SIGN-ON")).click();

		// Enter UserID
		driver.findElement(By.name("userName")).sendKeys("tutorial");

		// Enter Password
		driver.findElement(By.name("password")).sendKeys("tutorial");

		// Click on Sign in button
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);
	}

	@Test(priority = 44,enabled = false)
	public void Logout() throws InterruptedException {
		// Click on Sign off
		driver.findElement(By.linkText("SIGN-OFF")).click();
		Thread.sleep(3000);
	}

	@Test(priority = 49)
	public void TestRegisterLink() {
		driver.findElement(By.linkText("REGISTER")).click();
	}

	@Test(priority = 53)
	public void TestSupportLink() {
		driver.findElement(By.linkText("SUPPORT")).click();
	}

	@Test(priority = 68)
	public void CloseBrowser() {
		driver.close();
	}

}
