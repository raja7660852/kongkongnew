package contactsTests;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritedateinExcelFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream fis=new FileOutputStream(".\\src\\test\\resources\\jjghgfutf.xlsx");
		

	XSSFWorkbook wb=new XSSFWorkbook();
	XSSFSheet sheet = wb.createSheet("Organization");
	
	
	XSSFRow row1 = sheet.createRow(0);
	row1.createCell(0).setCellValue("java");
	row1.createCell(1).setCellValue("automation");
	row1.createCell(2).setCellValue("framwork");
	
	XSSFRow row2 = sheet.createRow(1);
	row2.createCell(0).setCellValue("java2");
	row2.createCell(1).setCellValue("automation2");
	row2.createCell(2).setCellValue("framwork2");
	
	XSSFRow row3 = sheet.createRow(2);
	row3.createCell(0).setCellValue("java3");
	row3.createCell(1).setCellValue("automation3");
	row3.createCell(2).setCellValue("framwork3");
	
	
	wb.write(fis);
	wb.close();
	System.out.println("file is created");
		

	}

}
