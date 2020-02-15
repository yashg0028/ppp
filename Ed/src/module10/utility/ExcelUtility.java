package module10.utility;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {

	static Workbook wb;
	static Sheet sh;
	
	public static void SetupExcel(String Path, String SheetName) throws Exception {
		
		FileInputStream fis = new FileInputStream(Path);
		
		wb = WorkbookFactory.create(fis);
		
		sh =  wb.getSheet(SheetName);
		
	}
	
	public static String getData(int rowno, int colno) {
		
		String Data = sh.getRow(rowno).getCell(colno).toString();
		
		return Data;
	}
}
