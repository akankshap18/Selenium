package framework;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class InsertingDataToExcelSheet 
{

	public static void main(String[] args) throws Throwable {
		
		//step1:- set file path
		FileInputStream fes = new FileInputStream("./TestData11.xlsx");	
	        //step2:-Excel in read mode
	    Workbook book = WorkbookFactory.create(fes);
		
	    //step3:-fetch the required sheet
	    Sheet sheet = book.getSheet("Sheet1");
	    
	    Row row = sheet.createRow(2);

	    Cell cel = row.createCell(2);
	    
	    cel.setCellValue("QSpiders");
	    
	  FileOutputStream fos = new FileOutputStream("./TestData11.xlsx");
	  book.write(fos);
	  book.close();
    
	}

}