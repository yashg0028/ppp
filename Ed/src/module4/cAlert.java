package module4;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cAlert {

	public static void main(String[] args) throws InterruptedException {

		// Open browser
		System.setProperty("webdriver.chrome.driver", "G:\\Folder Structure\\Installation Stuff\\Drivers\\chromedriver1.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://seleniumautomationpractice.blogspot.com/2018/01/blog-post.html");

		Thread.sleep(1000);

		driver.findElement(By.id("confirm")).click();
		Thread.sleep(1000);

		// Call the Alert Interface and switch to the Alert
		Alert cA = driver.switchTo().alert();

		System.out.println(cA.getText());
		Thread.sleep(1000);
		
		cA.dismiss();	
	}
}
