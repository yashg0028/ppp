package module5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		// Open browser
		System.setProperty("webdriver.chrome.driver", "G:\\Folder Structure\\Installation Stuff\\Drivers\\chromedriver1.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/droppable/");
		
		//driver.switchTo().frame(0); //using indexnumber 
		
		WebElement IFrame = driver.findElement(By.tagName("iframe")); //using tagname of iframe
		
		driver.switchTo().frame(IFrame);
		
		WebElement Source = driver.findElement(By.id("draggable"));// draggable element finding
		
		WebElement Target = driver.findElement(By.id("droppable"));//droppable element finding
		
		Actions act = new Actions(driver);		//instialising actions cal to perform drag and drop action using perform method
		
		act.dragAndDrop(Source, Target).perform();

	}

}
