package module5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
	
		// Open browser
		System.setProperty("webdriver.chrome.driver", "G:\\Folder Structure\\Installation Stuff\\Drivers\\chromedriver1.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://seleniumautomationpractice.blogspot.com/2017/10/functionisogramigoogleanalyticsobjectri.html");
		
		//creating an object/local variable of Select class and defining which element you want to work with
		Select oSelect = new Select(driver.findElement(By.name("continents")));
		
		Thread.sleep(5000);
		
		//Select by visible text - Africa
		oSelect.selectByVisibleText("Africa");
		
		Thread.sleep(5000);
		
		//Select by Index - South America
		oSelect.selectByIndex(4);
		
		Thread.sleep(5000);
		
		//Select by Value - Antartica
		oSelect.selectByValue("g");	

		Thread.sleep(5000);
		
		driver.quit();
	}

}
