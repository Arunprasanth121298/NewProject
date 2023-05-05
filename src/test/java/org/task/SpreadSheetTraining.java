package org.task;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class SpreadSheetTraining {

	public static void main(String[] args) throws IOException  {
	File f = new File("C:\\Users\\HP\\eclipse-workspace\\Testings\\Excel\\Sheet.xlsx");
	FileInputStream fln = new FileInputStream(f);
	Workbook s = new XSSFWorkbook(fln);
	Sheet sht = s.getSheet("Data");
	Row row = sht.getRow(0);
	Cell cell = row.getCell(4);
	System.out.println(cell);
	
	
	
	}

}
