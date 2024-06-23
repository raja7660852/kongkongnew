package genericUTilities;

import java.io.File;
//import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

/**
 * This class consits of reusable methods related to excel file
 * @author Chaitra M
 *
 */
public class ExcelFileUtility {
	
	/**
	 * This method will read data from given excel file and return the value to caller 
	 * @param sheetName
	 * @param rowNo
	 * @param cellNo
	 * @return Value
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public String readDataFromExcel(String sheetName, int rowNo, int cellNo) throws EncryptedDocumentException, IOException
	{
		File fis = new File(".\\src\\test\\resources\\TestData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String value = wb.getSheet(sheetName).getRow(rowNo).getCell(cellNo).getStringCellValue();
		return value;
	}
	
	
	@DataProvider
	public Object[][] getdata(String sheetName) throws EncryptedDocumentException, IOException
	{
		File fis = new File(".\\src\\test\\resources\\TestData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Organization");
	   int lastrow = sh.getLastRowNum();
	  int lastcell = sh.getRow(0).getLastCellNum();
	  
	  Object[][] data =new Object[lastrow][lastcell];
	  for(int i=1;i<lastrow;i++)
	  {
		  for(int j=0;j<lastcell;j++)
		  {
			  data[i][j]=sh.getRow(i).getCell(j).getStringCellValue();
		  }
		
	  }
	return data;
          
		
	}
	
	

}
