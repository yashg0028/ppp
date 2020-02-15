package module5;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class KeyboardMouseEvents {

	public static void main(String[] args) {

		// Open browser
		System.setProperty("webdriver.chrome.driver",
				"G:\\Folder Structure\\Installation Stuff\\Drivers\\chromedriver1.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://seleniumautomationpractice.blogspot.com/2017/10/automation-testing-sample_28.html");

		WebElement add = driver.findElement(By.name("ts_first_name"));

		Actions act = new Actions(driver);

		act
		.moveToElement(add)
		.keyDown(add, Keys.SHIFT)  // keyDown(WebElement, Keys.SHIFT)
		.sendKeys("abhresh")
		.keyUp(add, Keys.SHIFT)		//relese key through keyUp
		.doubleClick(add)			//left double click of mouse
		.contextClick(add)			//right double click of mouse
		.build()
		.perform();
		
		
		/*
		 * Action newAct = act .moveToElement(add) .keyDown(add, Keys.SHIFT)
		 * .sendKeys("abhresh") .keyUp(add, Keys.SHIFT) .build();
		 * 
		 * newAct.perform();
		 */
	}

}
