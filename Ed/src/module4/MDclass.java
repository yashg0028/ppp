
package module4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MDclass {

	public static void main(String[] args) throws InterruptedException {

		// Open browser
		System.setProperty("webdriver.chrome.driver", "G:\\Folder Structure\\Installation Stuff\\Drivers\\chromedriver1.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com");
		Thread.sleep(1000);

		
		driver.findElement(By.xpath("//*[@class='_2zrpKA _1dBPDZ']")).sendKeys("Edureka");
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();

	}

}
