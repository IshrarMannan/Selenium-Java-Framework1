package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;

	public static void main(String[] args) {
		getRowCount();
		getCellDataString();
		getCellDataNumber();
		getColCount();
	}

	public static void getRowCount()
	{
	
		try {
			workbook = new XSSFWorkbook("C:\\Users\\BS784\\OneDrive\\Documents\\Automation\\Maven_Project\\excel\\data.xlsx");
			sheet= workbook.getSheet("Sheet1");
			int countRow=sheet.getPhysicalNumberOfRows();
			System.out.println(countRow);
			
			
		} catch (IOException exp) {
			System.out.println("Msg: "+ exp.getMessage());
			System.out.println("Cause: "+ exp.getCause());
			exp.printStackTrace();
		}
	}
	public static void getColCount()
	{
	
		try {
			workbook = new XSSFWorkbook("C:\\Users\\BS784\\OneDrive\\Documents\\Automation\\Maven_Project\\excel\\data.xlsx");
			sheet= workbook.getSheet("Sheet1");
			int countCol=sheet.getRow(0).getPhysicalNumberOfCells();
			System.out.println(countCol);
			
			
		} catch (IOException exp) {
			System.out.println("Msg: "+ exp.getMessage());
			System.out.println("Cause: "+ exp.getCause());
			exp.printStackTrace();
		}
	}
	
	public static void getCellDataString()
	{
		try {
			workbook = new XSSFWorkbook("C:\\Users\\BS784\\OneDrive\\Documents\\Automation\\Maven_Project\\excel\\data.xlsx");
			sheet= workbook.getSheet("Sheet1");
			String cellData=sheet.getRow(0).getCell(0).getStringCellValue();
			System.out.println(cellData);

			
			
		} catch (IOException exp) {
			System.out.println("Msg: "+ exp.getMessage());
			System.out.println("Cause: "+ exp.getCause());
			exp.printStackTrace();
		}
	}
	public static void getCellDataNumber()
	{
		try {
			workbook = new XSSFWorkbook("C:\\Users\\BS784\\OneDrive\\Documents\\Automation\\Maven_Project\\excel\\data.xlsx");
			sheet= workbook.getSheet("Sheet1");
			double cellData=sheet.getRow(1).getCell(1).getNumericCellValue();
			System.out.println(cellData);

			
			
		} catch (IOException exp) {
			System.out.println("Msg: "+ exp.getMessage());
			System.out.println("Cause: "+ exp.getCause());
			exp.printStackTrace();
		}
	}
	
	
	

}
