package module3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementValidation {

	public static void main(String[] args) {

		// Open Browser
		System.setProperty("webdriver.chrome.driver", "G:\\Folder Structure\\Installation Stuff\\Drivers\\chromedriver1.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://seleniumautomationpractice.blogspot.com/2017/10/functionisogramigoogleanalyticsobjectri.html");
		
		driver.findElement(By.id("profession-1")).click();
		
		WebElement checkBox = driver.findElement(By.id("profession-1"));
		
		boolean Validation = checkBox.isSelected();
		
		System.out.println(Validation);
	}
}
