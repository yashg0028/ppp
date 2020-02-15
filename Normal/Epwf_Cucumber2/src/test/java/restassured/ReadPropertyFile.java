package restassured;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadPropertyFile {
public static String getPropertyValue(String key)
	
	{
	  String filePath="C:\\Users\\ac01878\\Documents\\Automation_Mohit\\config.properties";
	    
		String value="";
		Properties ppt = new Properties();
		try{
		ppt.load(new FileInputStream(filePath));
		value= ppt.getProperty(key);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return value;
	}

}
