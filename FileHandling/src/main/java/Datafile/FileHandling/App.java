package Datafile.FileHandling;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class App {
	public static void main(String[] args) throws IOException {
		XSSFWorkbook workbook = new XSSFWorkbook("D:\\Downloads\\GangotriWorkbook.xlsx");
		XSSFSheet Sheet = workbook.getSheet("Sheet1");
		System.out.println(Sheet.getPhysicalNumberOfRows());

	}

}