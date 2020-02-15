package module5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelect {

	public static void main(String[] args) throws InterruptedException {
		
		// Open browser
		System.setProperty("webdriver.chrome.driver", "G:\\Folder Structure\\Installation Stuff\\Drivers\\chromedriver1.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://seleniumautomationpractice.blogspot.com/2017/10/functionisogramigoogleanalyticsobjectri.html");
		driver.manage().window().maximize();

		Select oSelect = new Select(driver.findElement(By.name("selenium_commands")));
		
		oSelect.selectByIndex(1);
		
		Thread.sleep(5000);
		
		oSelect.deselectByVisibleText("Navigation Commands");
		
		oSelect.selectByIndex(1);
		oSelect.selectByIndex(2);
		oSelect.selectByIndex(3);
		Thread.sleep(5000);
		oSelect.selectByIndex(4);
		oSelect.selectByIndex(0);
		
		Thread.sleep(5000);
		oSelect.deselectAll();
		driver.quit();
		
	}

}
