package module11;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoIT {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", "G:\\Folder Structure\\Installation Stuff\\Drivers\\chromedriver1.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://seleniumautomationpractice.blogspot.com/2017/10/functionisogramigoogleanalyticsobjectri.html");
		
		driver.findElement(By.name("photo")).click();
		
		Thread.sleep(5000);
		
		Runtime.getRuntime().exec("G:\\From Git hub\\Edureka_29th July\\Edureka_29thJuly\\AutoitSikuli\\AutoITScript2.exe");
		
		//Runtime.getRuntime method to execute the path where  image is stored.
	}

}
