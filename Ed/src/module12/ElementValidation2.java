package module12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

public class ElementValidation2 {

	public static void main(String[] args) {

//Head less Browser using Phantomjs
			
		
		System.setProperty("phantomjs.binary.path", "G:\\Folder Structure\\Installation Stuff\\Drivers\\phantomjs.exe");
		WebDriver driver =new  PhantomJSDriver();

		driver.get("https://seleniumautomationpractice.blogspot.com/2017/10/functionisogramigoogleanalyticsobjectri.html");
		
		driver.findElement(By.id("profession-1")).click();
		
		WebElement checkBox = driver.findElement(By.id("profession-1"));
		
		boolean Validation = checkBox.isSelected();
		
		System.out.println(Validation);
	}
}
