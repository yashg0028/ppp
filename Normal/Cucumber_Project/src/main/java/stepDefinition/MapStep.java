package stepDefinition;

public class MapStep {
	
	import java.util.Map;

import org.junit.Assert;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	import cucumber.api.DataTable;
	import cucumber.api.java.en.Given;
	import cucumber.api.java.en.Then;
	import cucumber.api.java.en.When;

	public class DataStepDefinition {
		WebDriver driver ;
		private WebDriver data;
		
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
		
		@Then("^User enters username and password$")
		public void user_enters_username_and_password(DataTable credentials ) {
			for (Map<String, String>  data : credentials.asMaps(String.class, String.class));  //asMaps method gives complete access to data table	
			{
			driver.findElement(By.id("pop")).sendKeys(data.get("username")); // column name username
			driver.findElement(By.id("pop")).sendKeys(data.get("password")); //  column name password
			}
		}
		
		@Then("^User clicks on login button$")
		public void user_clicks_on_login_button()
		{
	   driver.findElement(By.id("u_0_2"));
		}
		
		@Then("^User moves to details page$")
		public void user_moves_to_details_page() {
		    // Write code here that turns the phrase above into concrete actions
		}

		@Then("^User enters details$")
		public void user_enters_details(DataTable dealdata) {
				for(Map<String, String> values	 : dealdata.asMaps(String.class, String.class));//asMaps method provides access to data table
				{
				driver.findElement(By.id("firstname")).sendKeys(values.get("firstname")); // column name username
				driver.findElement(By.id("surname")).sendKeys(values.get("lastname")); // column name username
				driver.findElement(By.id("lastname")).sendKeys(values.get("surname")); // column name username
				
				}
		}

		@Then("^close browser$")
		public void close_browser() 
		{
		    driver.close();
		
		}
		}
		
		
	
