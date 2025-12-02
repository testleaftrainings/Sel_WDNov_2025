package week5.day2;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException {
		
		XSSFWorkbook excel;
		// Step1-> Set path for workbook
		excel = new XSSFWorkbook("./data/CreateLead.xlsx");
		// step2-> Get into the sheet
		XSSFSheet sheet = excel.getSheet("sheet1");
		// Step3-> Gets the last row on the sheet
		int lastRowNum = sheet.getLastRowNum();
		// Step4-> Gets the index of the last cell contained in this row
		short lastCellNum = sheet.getRow(lastRowNum).getLastCellNum();
		// expected value for row is 3
		// expected value for column is 4
		System.out.println( "actual value : "+lastRowNum);
		System.out.println( "actual value : "+lastCellNum);
		//String rowOneColumOneData = excel.getSheet("sheet1").getRow(0).getCell(0).getStringCellValue(); 
		//String rowOneColumTwoData = excel.getSheet("sheet1").getRow(0).getCell(1).getStringCellValue(); 
				// expected value is "Company name"
				// expected value is "first name "
		for (int i = 0; i <= lastRowNum; i++) {
			System.out.print("|");
			for (int j = 0; j <lastCellNum; j++) {
				// Step5-> Read Data from workbook and print
				String testdata = sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.print("\t"+testdata+"\t | ");			
				}
			System.out.println();
		}
		// Step6-> close the workbook
		excel.close();
	}

}
