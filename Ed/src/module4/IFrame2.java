package module4;
import java.util.List;

import org.apache.http.impl.client.SystemDefaultCredentialsProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrame2 {

	public static void main(String[] args) throws InterruptedException {
		// Open browser
		System.setProperty("webdriver.chrome.driver", "G:\\Folder Structure\\Installation Stuff\\Drivers\\chromedriver1.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://seleniumautomationpractice.blogspot.com/2019/07/example-of-html-iframe-alternative.html");
	
		List	<WebElement> iframeElements = (List<WebElement>) driver.findElement(By.tagName("iframe"));
		int numberoftags = iframeElements.size();
		System.out.println(numberoftags);
		
		driver.switchTo().frame("ID_Frame1"); //switch into first frame using id number

		driver.findElement(By.name("ts_first_name")).sendKeys("Abhresh");

		driver.findElement(By.name("ts_last_name")).sendKeys("Sugandhi");
		
		driver.switchTo().parentFrame();		//coming back to parent frame
		
		/*driver.switchTo().frame("ID_Frame2"); //switch into second frame using id element
*/
		WebElement iframeElement = driver.findElement(By.id("ID_Frame2"));
		 driver.switchTo().frame(iframeElement);	/// using webelement..here webelement is iframe--
		driver.findElement(By.name("firstname")).sendKeys("Abhresh");

		driver.findElement(By.name("lastname")).sendKeys("Sugandhi");

		
	}

}
