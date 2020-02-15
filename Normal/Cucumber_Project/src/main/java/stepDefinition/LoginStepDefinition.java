package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinition {
	
	WebDriver driver ;

	@Given ( "^User is already on login page$" )  // ^$ special character.... so that cucumber can understand this statement.
	public  void user_already_on_login_page() 
	{
		System.setProperty("webdriver.chrome.driver","G:\\Folder Structure\\Installation Stuff\\Drivers\\chromedriver76.exe");
 		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		}
	
	@When("^Login page title is facebook$")
	public void login_page_title_is_facebook() {
		String title= driver.getTitle();
		System.out.println( "Title IS :: "+title);
		Assert.assertEquals("Facebook – log in or sign up", title);	  
	}
	
	/*@Then("^User enters username and password$")
	public void user_enters_username_and_password() 
	{
	driver.findElement(By.name("email")).sendKeys("yash");
	driver.findElement(By.id("pass")).sendKeys("pwd");  
	}
	*/
	//******************************************************************************************//
	/*@Then("^User enters \\”(.*)\\”  and \\”(.*)\\”$")   //without example keyword,,, while sending only one user details
	public void user_enters_username_and_password1(String username, String password) 
	{
	driver.findElement(By.name("email")).sendKeys("username");
	driver.findElement(By.id("pass")).sendKeys("password");  
	}
	*/
	//******************************************************************************************//
	
	@Then("^User enters \"([^\"]*)\" and \"([^\"]*)\"$")   //with example keyword,,, while sending so many users details
	public void user_enters_and(String username, String password) 
	{
	driver.findElement(By.id("email")).sendKeys(username);
	driver.findElement(By.id("pass")).sendKeys(password);  
	}
	//**********************************************************************************************//
	@Then("^User clicks on login button$")
	public void user_clicks_on_login_button()
	{
   driver.findElement(By.id("u_0_2"));
	}
	

@Then("^browser quit$")
public void browser_quit() {
    driver.close();
}

}


