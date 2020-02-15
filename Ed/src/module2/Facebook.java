package module2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Sleeper;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
     
		 //step 1--instantiate the browser
		System.setProperty("webdriver.chrome.driver", "G:\\Folder Structure\\Installation Stuff\\Drivers\\chromedriver1.exe");
		WebDriver driver =new ChromeDriver();
		
		//step 2--open the browser
		driver.get("https://www.facebook.com");
		
		//step 3--locators
		//id
		driver.findElement(By.id("u_0_l")).sendKeys("Abhresh");
		
		//name
		driver.findElement(By.name("lastname")).sendKeys("SS");
		
		//classname for login usually web elements will have similar class name hence its not a best choice to find element
		driver.findElement(By.className("inputtext")).sendKeys("999999999");
		driver.findElement(By.className("inputtext")).sendKeys("pwd");
		
		//id for pwd because class name is same for login and pwd
		driver.findElement(By.id("pass")).sendKeys("Abhresh");
		
		
		//linktext
		driver.findElement(By.linkText("Forgotten account?")).click();
		Thread.sleep(5000);
		driver.navigate().back();
		
		//partial link text
		driver.findElement(By.partialLinkText("n a")).click();
		Thread.sleep(5000);
		driver.navigate().back();
		
		//css
		driver.findElement(By.cssSelector("#u_0_x")).sendKeys("lplp");
			
	}

}
