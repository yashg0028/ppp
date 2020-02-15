package module6;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterisation {

	WebDriver driver;
	
	@Test(priority = 0)
	public void OpenBrowser() {
		// Open Browser
		System.setProperty("webdriver.chrome.driver", "G:\\Folder Structure\\Installation Stuff\\Drivers\\chromedriver1.exe");
		driver = new ChromeDriver();
	}

	@Test(priority = 1)
	public void OpenAUT() {

		driver.get("https://github.com/");
		
	}

	@Parameters ({"Username", "Password"})
	@Test(priority = 2)
	public void Login(String UName, String Pass) throws InterruptedException {

		driver.findElement(By.xpath("//*[@href='/login']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("login_field")).sendKeys(UName);
		
		driver.findElement(By.id("password")).sendKeys(Pass);
		
		driver.findElement(By.name("commit")).click();

	}

	@Test(priority = 3)
	public void Logout() throws InterruptedException {

		Thread.sleep(3000);
		
		driver.findElement(By.xpath("/html/body/div[1]/header/div[8]/details/summary/img")).click();
		
		driver.findElement(By.xpath("/html/body/div[1]/header/div[8]/details/details-menu/form/button")).click();
				
	}

	@Test(priority = 4)
	public void CloseTestCase() throws InterruptedException {

		Thread.sleep(3000);
		
		driver.quit();
		
	}

}
