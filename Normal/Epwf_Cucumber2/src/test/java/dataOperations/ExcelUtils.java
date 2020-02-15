package dataOperations;

import java.io.File;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Calendar;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import genericUtilities.GlobalVariables;

public class ExcelUtils extends GlobalVariables {
	
	DataFormatter formatter = new DataFormatter();
	public static Workbook excelWBook;
	public static Sheet excelWSheet;
	public static Row excelRow;
	public static Cell cell;
	int i=0;
	int j=0;
	
	public void openExcelFile(File excelFile,String sheetName) throws EncryptedDocumentException, InvalidFormatException, IOException{
		
		FileInputStream testDataFile =new FileInputStream(excelFile);
		excelWBook = new WorkbookFactory().create(testDataFile); //why we are doing this
		excelWSheet=excelWBook.getSheet(sheetName);
		
	}
	
	public int getRowNumber(String data){
		
		//getLastRowNum() counts from 0
		//getLastCellNum() counts from 1
		//getCell() -->> this method counts from 0
		for(i=0;i<excelWSheet.getLastRowNum();i++){
			
			for(j=0;j<excelWSheet.getRow(i).getLastCellNum();j++){
	
				if(formatter.formatCellValue(excelWSheet.getRow(i).getCell(j)).equalsIgnoreCase(data)){
					return i;	
				}	
				
			}
			
		}
		return i;
	
	}
	
	public int getColumnNumber(String colName){
		
		for(i=0;i<excelWSheet.getLastRowNum();i++){
			
			for(j=0;j<excelWSheet.getRow(i).getLastCellNum();j++){
				if(formatter.formatCellValue(excelWSheet.getRow(i).getCell(j)).equalsIgnoreCase(colName)){
					return j; //why is it that yaha par return ki jagah break diya to value galat jaati h
				}
			}
			
		}
		return j+1;
		
	}
	
	public String getCellData(int rowNumber,int colNumber){
		return excelWSheet.getRow(rowNumber).getCell(colNumber).getStringCellValue();
	}	
			
	
	
	// set excel cell data for the given row and column
	public void setCellData(String Result, int RowNum, int ColNum)
		throws Exception {
		try {
			excelWSheet.getRow(RowNum).createCell(ColNum);
			cell = excelWSheet.getRow(RowNum).getCell(ColNum);
			cell.setCellType(Cell.CELL_TYPE_STRING);
			cell.setCellValue(Result);
			FileOutputStream fileOut = new FileOutputStream(ExcelFile);
			excelWBook.write(fileOut);
			fileOut.flush();
			fileOut.close();
		} catch (Exception e) {
			throw (e);
		}
	}
	
	
	public int getRowCount(String sheetName){
        int index = excelWBook.getSheetIndex(sheetName);
        if(index==-1)
              return 0;
        else{
        excelWSheet = excelWBook.getSheetAt(index);
        int number=excelWSheet.getLastRowNum()+1;
        return number;
        }
        
 }

    public String getCellData(String sheetName,int colNum,int rowNum){
        try{
              
              if(rowNum <=0)
                     return "";
        
        int index = excelWBook.getSheetIndex(sheetName);

        if(index==-1)
              return "";
        
      
        excelWSheet = excelWBook.getSheetAt(index);
        excelRow = excelWSheet.getRow(rowNum-1);
        if(excelRow==null)
              return "";
        cell = excelRow.getCell(colNum);
        if(cell==null)
              return "";
        
   if(cell.getCellType()==Cell.CELL_TYPE_STRING)
          return cell.getStringCellValue();
   else if(cell.getCellType()==Cell.CELL_TYPE_NUMERIC || cell.getCellType()==Cell.CELL_TYPE_FORMULA ){
          
          String cellText  = String.valueOf(cell.getNumericCellValue());
          if (HSSFDateUtil.isCellDateFormatted(cell)) {
            // format in form of M/D/YY
                double d = cell.getNumericCellValue();

                Calendar cal =Calendar.getInstance();
                cal.setTime(HSSFDateUtil.getJavaDate(d));
             cellText =
              (String.valueOf(cal.get(Calendar.YEAR))).substring(2);
            cellText = cal.get(Calendar.MONTH)+1 + "/" +
                       cal.get(Calendar.DAY_OF_MONTH) + "/" +
                       cellText;
            
  

          }

          
          
          return cellText;
   }else if(cell.getCellType()==Cell.CELL_TYPE_BLANK)
       return "";
   else 
          return String.valueOf(cell.getBooleanCellValue());
        }
        catch(Exception e){
              
              e.printStackTrace();
              return "row "+rowNum+" or column "+colNum +" does not exist  in xls";
        }
 }

	
	
}
