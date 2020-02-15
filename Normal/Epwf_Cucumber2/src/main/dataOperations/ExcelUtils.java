package dataOperations;

import java.io.File;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
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
	
	
}
