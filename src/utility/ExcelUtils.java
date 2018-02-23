package utility;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
private static XSSFSheet ExcelWSheet;
private static XSSFWorkbook ExcelWBook;
private static XSSFCell cell;
private static XSSFRow row;

public static void setExcelFile(String Path,String SheetName) throws Exception {
	try{
		FileInputStream ExcelFile = new FileInputStream(Path);
		ExcelWBook = new XSSFWorkbook(ExcelFile);
		ExcelWSheet = ExcelWBook.getSheet(SheetName);			
	}catch(Exception e){
		e.printStackTrace();
	}
}

public static String getCellData(int RowNum, int ColNum) throws Exception{
	try{
		cell= ExcelWSheet.getRow(RowNum).getCell(ColNum);
		String cellData = cell.getStringCellValue();
		return cellData;
	}catch(Exception e){
		e.printStackTrace();
	}	
	
	return "";
	
}

public static String setCellData(String Result, int RowNum, int ColNum) throws Exception{
	try{
		row = ExcelWSheet.getRow(RowNum);
		cell = row.getCell(ColNum, row.RETURN_BLANK_AS_NULL);
		if(cell==null){
			cell = row.createCell(ColNum);
			cell.setCellValue(Result);
		}else{
			cell.setCellValue(Result);
		}
		FileOutputStream fileOut = new FileOutputStream(Constant.Path_TestData+Constant.File_TestData);
		ExcelWBook.write(fileOut);
		fileOut.flush();
		fileOut.close();
		
	}catch(Exception e){
		e.printStackTrace();
	}
	return Result;

}
}
