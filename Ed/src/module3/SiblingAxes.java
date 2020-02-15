package module3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SiblingAxes {		


	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "G:\\Folder Structure\\Installation Stuff\\Drivers\\chromedriver1.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
	Select drpdwn=new Select(driver.findElement(By.xpath("//select[@id='day']/following-sibling::select[1]")));
    drpdwn.selectByVisibleText("Sept");
		
	}

}
