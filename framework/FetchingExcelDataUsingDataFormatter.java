package framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchingExcelDataUsingDataFormatter 
{
	public static void main(String[] args) throws Throwable 
	{
		//step1:- set file path
		FileInputStream fes = new FileInputStream("D:\\QSpiders\\Selenium\\TestData11.xlsx");	
		//step2:-Excel in read mode
		Workbook book = WorkbookFactory.create(fes);

		//step3:-fetch the required sheet
		Sheet sheet = book.getSheet("Sheet1");

		Row row = sheet.createRow(0);

		Cell cell = row.createCell(0);
		
		DataFormatter data = new DataFormatter();
		String excelData = data.formatCellValue(cell);
		
		System.out.println(excelData);
	}
}
