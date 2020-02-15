package restassured;

import genericUtilities.GlobalVariables;

public class WebServicesReusables extends GlobalVariables{
	
	public static String getURI()
	{	
	    return ReadPropertyFile.getPropertyValue("ServiceURI");
	}
   public static String getResource()
   {
	   return ReadPropertyFile.getPropertyValue("Resources");
   }
   public static String PostResource()
   {
	   return ReadPropertyFile.getPropertyValue("PostResources");
   }
  
}
