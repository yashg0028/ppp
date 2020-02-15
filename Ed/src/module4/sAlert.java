package module4;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sAlert {

	public static void main(String[] args) throws InterruptedException {

		// Open browser
		System.setProperty("webdriver.chrome.driver", "G:\\Folder Structure\\Installation Stuff\\Drivers\\chromedriver1.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://seleniumautomationpractice.blogspot.com/2018/01/blog-post.html");
		
		driver.findElement(By.id("alert")).click();
		Thread.sleep(1000);
		
		//Call the  Alert Interface and switch to the Alert
		Alert sA = driver.switchTo().alert();
		
		Thread.sleep(1000);

		//Print the text of the Alert
		System.out.println(sA.getText());
		
		Thread.sleep(1000);

		//Click on OK button of the ALert
		sA.accept();
		
		}

}
