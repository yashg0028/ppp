package module3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) throws InterruptedException {

		// Open browser
		System.setProperty("webdriver.chrome.driver", "G:\\Folder Structure\\Installation Stuff\\Drivers\\chromedriver1.exe");
		WebDriver driver = new ChromeDriver();
		
		// Open the AUT
		driver.get(
				"https://seleniumautomationpractice.blogspot.com/2017/10/functionisogramigoogleanalyticsobjectri.html");

		//enter into data text box
		driver.findElement(By.xpath("//*[@id='datepicker']")).sendKeys("30/11/1986");
		
		// Using Date TextBox interacting with Selenium IDE Checkbox
		driver.findElement(By.xpath("//*[@id='datepicker']//following::input[5]")).click();
		Thread.sleep(5000);

		// Using Date TextBox interacting with Male Radiobutton
		driver.findElement(By.xpath("//*[@id='datepicker']//preceding::input[9]")).click();
		Thread.sleep(5000);

		// Using Date TextBox interacting with the linktext "Test File to Download"
		String Heading = driver.findElement(By.xpath("//*[contains(text(), 'n For')]")).getText();

		System.out.println(Heading);
		
		// Using Date TextBox interacting with the linktext "Test File to Download"
		driver.findElement(By.xpath("//*[starts-with(text(),'Test')]")).click();
		Thread.sleep(5000);

		driver.close();

	}

}
