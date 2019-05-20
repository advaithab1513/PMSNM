package junk2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead 
{
	public static void main(String[] args) throws IOException
	{
		HashMap<String, HashMap<String, String>> map = new HashMap<String, HashMap<String, String>>();
		HashMap<String, String> excelData = new HashMap<String, String>();
		File f = new File("C://users//mallikar//PMSNM_Automation//PMSNM_Automation//Data//input.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook book = new XSSFWorkbook(fis);
		Sheet sheet = book.getSheet("Sheet1");
		String sheetName = sheet.getSheetName();
		Row row = sheet.getRow(0);
		String cellKey = row.getCell(0).getStringCellValue().trim();
		String cellValue = row.getCell(1).getStringCellValue().trim();
		excelData.put(cellKey, cellValue);
		map.put(sheetName, excelData);
		System.out.println(map.get(sheetName).get("URL"));
		
		
		
	}
}
