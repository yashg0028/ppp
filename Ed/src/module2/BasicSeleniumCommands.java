
package module2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicSeleniumCommands {

	public static void main(String[] args) {
		
		// Initialize / Instantiate / Open Browser
		// Chrome Browser
		System.setProperty("webdriver.chrome.driver", "F:\\Training\\Installation_stuff\\ExeFiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // webdriver Interface is implemented by ChomeDriver class
		
		//Firefox Browser
		
		
		// Close and Quit
		driver.close();// this will close the current active window of the browser with in this instance
		driver.quit();// this will close all the window opened during this instance

		// Get commands
		driver.get("https://www.edureka.co");// to open URL of the AUT
		driver.getTitle();// to fetch the title of the page and use it either for validation
		driver.getCurrentUrl();// to fetch the current URL of the AUT
	
		//Maximise Manage
		 driver.manage().window().maximize();
		
		// Navigation Commands 
		// move to the next page
		driver.navigate().forward();
		// move to previous page
		driver.navigate().back();
		// page refresh
		driver.navigate().refresh();

		//Element Handling
		//Click
		driver.findElement(By.id("")).click();
		//Type commands
		driver.findElement(By.id("")).sendKeys("Abhresh");
		//Clear Commands
		driver.findElement(By.id("")).clear();
	}

}
