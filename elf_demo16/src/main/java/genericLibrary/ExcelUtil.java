package genericLibrary;

import java.io.File;
import java.io.FileInputStream;
import java.util.Date;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.usermodel.Sheet;
public class ExcelUtil extends BaseClass {

	public String excelStringValueData(String absolutePath, String sheetName, int row, int cell) throws Exception {
		File absPath = new File(absolutePath);
		FileInputStream fis = new FileInputStream(absPath);

		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetName);
		String cellValue = sheet.getRow(row).getCell(cell).getStringCellValue();

		return cellValue;		
	}

	public double excelNumericCellData(String absolutePath, String sheetName, int row, int cell) throws Exception, Exception {
		File absPath = new File(absolutePath);
		FileInputStream fis = new FileInputStream(absPath);

		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetName);
		double cellValue = sheet.getRow(row).getCell(cell).getNumericCellValue();

		return cellValue;		
	}


	public Date excelDateCellData(String absolutePath, String sheetName, int row, int cell) throws Exception, Exception {
		File absPath = new File(absolutePath);
		FileInputStream fis = new FileInputStream(absPath);

		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetName);
		Date cellValue = sheet.getRow(row).getCell(cell).getDateCellValue();

		return cellValue;		
	}

	public boolean excelBooleanCellData(String absolutePath, String sheetName, int row, int cell) throws Exception, Exception {
		File absPath = new File(absolutePath);
		FileInputStream fis = new FileInputStream(absPath);

		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetName);
		boolean cellValue = sheet.getRow(row).getCell(cell).getBooleanCellValue();

		return cellValue;		
	}



}

