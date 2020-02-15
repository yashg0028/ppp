package module9.TestCase;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import module9.Pages.FormPage;

public class DDT {

	//Open browser
	//Open AUT
	//FormFill - Fetch the data from Excel File
	//Close Browser
	
	WebDriver driver;
	Workbook wb;
	Sheet sh;
	int norows;
	int nocols;
	
	
	@BeforeSuite
	public void OpenAUT() {
		 
		System.setProperty("webdriver.chrome.driver", "G:\\Folder Structure\\Installation Stuff\\Drivers\\chromedriver1.exe");
		driver = new ChromeDriver();

		driver.get("https://seleniumautomationpractice.blogspot.com/2017/10/automation-testing-sample_28.html");

	}
	
	@AfterSuite
	public void QuitProcess() {
		driver.quit();
	}
	
	@Test(dataProvider = "testDataFeeder")		//using test annotation and calling methods from object class to pass inputs
																					//provide connectivity between data provider and @test annotation
																					//by calling dataprovider =dataprovider method name.. so that @test considers datapro as input
	public void FormFill(String fName, String lName, String add) throws Exception {
		
		FormPage fp = new FormPage(driver);   //importing formpage class to test case
		fp.FormFill(fName, lName, add);
		
	}
	
										//////////***** Fetching Data From Excel Sheet***************/////////////////////
	
	@DataProvider				//dataprovider annotation and array concepts
	public Object[][] testDataFeeder() throws Exception{					//It is mandatory for a @DataProvider method to return the data 
																														//in the form of double array of Object class (Object [][]).
																														//The first array represents a data set where as the second array contains the parameter values.
		
		//To import the Excel file and fetch the bytes from the file
		FileInputStream fis = new FileInputStream("G:\\From Git hub\\Edureka_29th July\\Edureka_29thJuly\\src\\module9\\TestData\\TestData.xlsx");
		
		//Open Workbook(excel sheet is known as WB for Apache)
		wb = WorkbookFactory.create(fis); // create is default file which has to access file through path//
		
		//Open Sheet under the above workbook..sheet name is sheet1
		sh = wb.getSheet("Sheet1");
		
		//total of norows
		norows = sh.getLastRowNum()+1; //getlastrowmethod is accessed from apache
		System.out.println(norows);
				
		//total of nocols																		// norows:: 9+1: 10
		nocols = sh.getRow(0).getLastCellNum();							// nocolms:: in row 0 last cell num is c--ie [0,1,2] :3
		System.out.println(nocols);
		
		Object[][] formData = new Object[norows][nocols];   //putting all the data in formdata container

		for(int row=0; row<norows; row++) 
		{
			for(int col=0; col<nocols; col++) 
			{
				//fetch the data from the cell using row and col numbers from the loop process
				formData[row][col] = sh.getRow(row).getCell(col).toString();
			}
			
		}
		
		return formData;
	}
}
