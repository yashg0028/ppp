/*package module11;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
//////////////////////////////////silukix version jar is required/////////////////////
public class Sikuli {

	public static void main(String[] args) throws FindFailed, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "G:\\Folder Structure\\Installation Stuff\\Drivers\\chromedriver1.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.instagram.com/");

		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Screen s = new Screen();
		
		s.getScreen().click("G:\\From Git hub\\Edureka_29th July\\Edureka_29thJuly\\AutoitSikuli\\LoginButton.JPG");

		Pattern un = new Pattern("G:\\From Git hub\\Edureka_29th July\\Edureka_29thJuly\\AutoitSikuli\\UserNameTextBox.JPG");
		

		Thread.sleep(5000);
		
		s.getScreen().type(un, "Edureka");
		
	}

}
*/