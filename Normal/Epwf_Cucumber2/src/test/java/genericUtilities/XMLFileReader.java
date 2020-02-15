package genericUtilities;

import java.io.File;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.qwest.mdw.common.utilities.FileHelper;



public class XMLFileReader {
	
	//private String XML_SRC_DIR_PATH;
	
	/*public XMLFileReader()
	{
		
	}
	
	public XMLFileReader(String XML_SRC_DIR_PATH_IN)
	{
		setXML_SRC_DIR_PATH(XML_SRC_DIR_PATH_IN);
	}
	
	
	public List<String> getXML_List(String filePath) {
		
		List<String> testCaseIDList=new ArrayList<String>();
		File directory = new File(filePath);
	       File[] fList = directory.listFiles();
	        for (File file : fList){
	        	if(file.isFile())
	        	{
	        	testCaseIDList.add(file.getName());
	        	}
	        }
		
		return testCaseIDList;
	}*/

	public String getReqXML(String filePath) throws IOException {
		
		String req=null;
		//System.out.println("Inside read xml testCaseID:::"+testCaseID);
		try {
			FileInputStream fio=new FileInputStream(filePath);
			req= FileHelper.getFileContents(filePath);
			//System.out.println("REQ XML IS :::"+reqXML);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return req;
	}
	
	
	     
	      
	     
	
	
	
	
	
	
	/*public String getXML_SRC_DIR_PATH() {
		return XML_SRC_DIR_PATH;
	}


	private void setXML_SRC_DIR_PATH(String XML_SRC_DIR_PATH_IN) {
		XML_SRC_DIR_PATH = XML_SRC_DIR_PATH_IN;
	}*/
	
	
//	private String getCurrentDirectoryPath()
//	{
//		StringBuilder temp=null;
//		String currentDirectory;
//		File file = new File(""+this.getClass().toString().replace(".", "\\"));
//		System.out.println("AB"+file.getAbsolutePath().trim());
//		temp=new StringBuilder(file.getAbsolutePath().trim().replace("class ",""));
//		System.out.println("temp is ::"+temp);
//		currentDirectory =temp.replace(temp.lastIndexOf("\\"), temp.length(),"").toString() ;
//		System.out.println("Current working directory : "+currentDirectory);
//		return currentDirectory;
//	}

	
	/*public static void getPWD()
	{
		
		System.out.println("PWD:"+new File(".").getAbsolutePath());
		System.out.println("CWD:"+System.getProperty("user.dir"));
	}
	*/
	/*public static void main(String[] args) {
		getPWD();
		
//		System.out.println("HHHH::"+System.getProperty("user.dir"));
//		String path=System.getProperty("user.dir")+"\\test\\com\\qwest\\epwf\\app\\webservices";
//		XMLFileReader test=new XMLFileReader(path);
//		test.getTestCaseNumbers();
//		test.getReqXML(path+"\\Temp.xml");
		//new XMLFileReader(System.getProperty("user.dir")+"\\test\\com\\qwest\\epwf\\app\\webservices").getTestCaseNumbers();
	}*/
}
