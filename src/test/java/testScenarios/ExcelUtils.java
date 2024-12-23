package testScenarios;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtils {
 private Workbook workbook;
	public ExcelUtils(String filepath) throws IOException {
		FileInputStream fis = new FileInputStream(filepath);
		workbook =WorkbookFactory.create(fis);
	}
	public String getCellData(String sheeetName , int rowNum , int colNum) {
		Sheet sheet = workbook.getSheet(sheeetName);
		Row row = sheet.getRow(rowNum);
		if(row==null)return "";
		Cell cell =row.getCell(colNum);
		if(cell==null)return "";
		return cell.toString();
	}
	public int getRowCount(String sheetName) {
		Sheet sheet = workbook.getSheet(sheetName);
		return sheet.getPhysicalNumberOfRows();
	}
	public int getColumnCount(String sheetName , int rowNum) {
		Sheet sheet = workbook.getSheet(sheetName);
		Row row =sheet.getRow(rowNum);
		return row.getLastCellNum();
	}
}
