package restassured;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import dataOperations.ExcelUtils;
import genericUtilities.CommonMethods;
import genericUtilities.GlobalVariables;

public class PayLoad extends GlobalVariables{
	
     
	public static String placePostBody() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		ArrayList<String> aList = new ArrayList<String>();
		 ExcelUtils excUi = new ExcelUtils();
		 excUi.openExcelFile(ExcelFile,cardNumSheetNameForIPS);
		 int count =  excUi.getRowCount(cardNumSheetNameForIPS);
		 for(int i=2; i<count; i++) {
			 aList.add(excUi.getCellData(cardNumSheetNameForIPS, 0, i));
		 }
		 Collections.shuffle(aList);
		 ex_CardNumber = aList.get(0);
		CommonMethods cMethods = new CommonMethods();
		randomNumber = cMethods.getRandomNumber(6);
		
		String payload="{" + 
				"\""+	randomNumber+"\""+":{" + 
				"    \"pan\":\""+ex_CardNumber+"\"," + 
				"    \"cv2\":\"710\"," + 
				"    \"eckoh_reference\":\"eckoh_serv01-201710190118-225\"" + 
				"  }" + 
				"}";
		
		return payload;
	}

}
