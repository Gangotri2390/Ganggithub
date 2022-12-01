package com.datafile;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class File {

	public static void main(String[] args) throws IOException, InterruptedException {
//		System.out.println(System.getProperty("user.dir"));
		String webpath=	System.getProperty("user.dir");
		
		XSSFWorkbook workbook=new XSSFWorkbook (webpath+"\\FileHandling\\demojobbers.xlsx");
		XSSFSheet sheet= workbook.getSheet("Sheet1");
		
	
		
		


	}


}
