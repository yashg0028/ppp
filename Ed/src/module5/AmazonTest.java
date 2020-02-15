package module5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonTest {
	
	

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "G:\\Folder Structure\\Installation Stuff\\Drivers\\chromedriver76.exe" );
		WebDriver driver = new ChromeDriver();
		//Open AUT
		driver.get("https://www.amazon.in/");
		
		WebElement mh = driver.findElement(By.cssSelector("#nav-link-shopall > span.nav-line-2"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(mh).perform();

		WebElement mh2 = driver.findElement(By.xpath("//*[@id=\"nav-flyout-shopAll\"]/div[2]/span[6]/span"));
		
		Actions act2 = new Actions(driver);
		
		act2.moveToElement(mh2).perform();
	
		
		
	}

}
