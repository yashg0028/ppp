package module12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class ElementValidation {

	public static void main(String[] args) {

//Head less Browser using htmlunit
		WebDriver driver =new  HtmlUnitDriver();

		driver.get("https://seleniumautomationpractice.blogspot.com/2017/10/functionisogramigoogleanalyticsobjectri.html");
		
		driver.findElement(By.id("profession-1")).click();
		
		WebElement checkBox = driver.findElement(By.id("profession-1"));
		
		boolean Validation = checkBox.isSelected();
		
		System.out.println(Validation);
	}
}
