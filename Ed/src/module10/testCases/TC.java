package module10.testCases;

import module10.actions.ActionKeywords;
import module10.utility.ExcelUtility;

public class TC {

	public static void main(String[] args) throws Exception {
		
		String Path = "G:\\Workspace\\Edureka\\src\\module10\\testData\\MyDataEngine.xlsx";

		ExcelUtility.SetupExcel(Path, "Sheet1");    // calling Excelutility class and providing inputs such as path and sheet name
		
		for(int i=0; i<4; i++)
		{   
			String Keywords = ExcelUtility.getData(i, 1);  //storing data into a container by accesing excelutility class getdata method
			
			if(Keywords.equals("OpenBrowser"))	//if keyword equals to open browser
			{
				ActionKeywords.OpenBrowser();  //call the action method from actionkeywords class
			}
			else if (Keywords.equals("Navigate"))
			{
				ActionKeywords.Navigate();		// //call the action method from action class
			}
			else if (Keywords.equals("ClickGmail"))
			{
				ActionKeywords.ClickGmail();
			}
		}
	}

}
