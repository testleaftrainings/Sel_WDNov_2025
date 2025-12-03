package week5.day3;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataLibrary {
	
	public static String[][] readData(String filePath) throws IOException {
		XSSFWorkbook excel;
		excel = new XSSFWorkbook("./data/"+filePath+".xlsx");
		XSSFSheet sheet = excel.getSheet("sheet1");
		int lastRowNum = sheet.getLastRowNum();
		short lastCellNum = sheet.getRow(lastRowNum).getLastCellNum();
		// Instansiation way - Array : 2-Dimensional
		String[][] dataWareHouse = new String[lastRowNum][lastCellNum];
		for (int i = 1; i <= lastRowNum; i++) {
			System.out.print("|");
			for (int j = 0; j <lastCellNum; j++) {
				String testdata = sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.print("\t"+testdata+"\t|");	
				//[1-1][0]==> [0][0]
				dataWareHouse[i-1][j]=testdata;
				}
			System.out.println();
		}
		excel.close();
		return dataWareHouse;
	}

}
