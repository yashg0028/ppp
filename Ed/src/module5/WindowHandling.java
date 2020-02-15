package module5;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {
		
		
		// Open browser
		System.setProperty("webdriver.chrome.driver", "G:\\Folder Structure\\Installation Stuff\\Drivers\\chromedriver1.exe");
		WebDriver driver = new ChromeDriver();
		
		//Open AUT
		driver.get("https://seleniumautomationpractice.blogspot.com/2019/04/new-window.html");
		driver.manage().window().maximize();
		
		//PART 1
		//Get the window handle for Main Window
		String mwn = driver.getWindowHandle();
		
		System.out.println("Main window name is :- " + mwn);
		System.out.println("===================================================");
		
		//Click on the button to  open the new window	
		driver.findElement(By.xpath("//*[@onclick='myFunction()']")).click();


		//PART 2
		//Get all window name
		Set<String> all = driver.getWindowHandles();

		System.out.println("All window name :- " + all);
		System.out.println("===================================================");

		//PART 3
		//Switch between the windows that are available for action
		//To switch between the windows with least java concept usage
		
		for(String awl : all) {
			
		//Currently I am on B window as it is Active window with the help of Switch I am moving to A window
		driver.switchTo().window(awl);
		
		Thread.sleep(3000);
		
		// from A to B
		driver.switchTo().window(awl);
		driver.manage().window().maximize();


		Thread.sleep(3000);

		driver.switchTo().window(awl);
		Thread.sleep(3000);

		driver.switchTo().window(awl);
		Thread.sleep(3000);

		
		}
		driver.close();
	}
}
 