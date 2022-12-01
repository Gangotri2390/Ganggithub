package Datafile.FileHandling;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class PracFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		XSSFWorkbook workbook = new XSSFWorkbook("C:\\Users\\Lenovo\\eclipse-workspace\\FileHandling\\Datafiles\\Gangotriper.xlsx");
		XSSFSheet Sheet = workbook.getSheet("Sheet1");
		System.out.println(Sheet.getPhysicalNumberOfRows());
		workbook.close();


	}

}
