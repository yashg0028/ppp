package restassured;

import static com.jayway.restassured.RestAssured.given;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

import dataOperations.ExcelOperations;



public class RestMethods extends PayLoad{
	public void postRequest() throws EncryptedDocumentException, InvalidFormatException, IOException {
	        
		
			RestAssured.baseURI=ExcelOperations.ex_TokenId;
		    System.out.println("Token URL is " + RestAssured.baseURI+"/HCDE/wsi/services/voicetoken/tokenize");
		    
			Response response = given().
			when().contentType(ContentType.JSON).body(PayLoad.placePostBody()).post(WebServicesReusables.PostResource());
			String responseValue = response.asString();
			System.out.println("Token Status is " + responseValue);	
			
			if(responseValue.equalsIgnoreCase("success!")){
				System.out.println("TokenID =" + randomNumber);
			}
		}

}
