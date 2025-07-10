package genericUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {

	/**
	 * This method is used to read String data from excel
	 * User must pass sheetName, rowIndex, Column Index
	 * @param sheetName
	 * @param rowIndex
	 * @param colIndex
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	
	public String getStringDataFromExcel(String sheetName,int rowIndex,int colIndex) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/testdata/iWantTFC.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		return workbook.getSheet(sheetName).getRow(rowIndex).getCell(colIndex).getStringCellValue();
		
	}
	
	/**
	 * This method is used to read Boolean data from excel
	 * User must pass sheetName, rowIndex, Column Index
	 * @param sheetName
	 * @param rowIndex
	 * @param colIndex
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	
	public boolean getBooleanDataFromExcel(String sheetName,int rowIndex,int colIndex) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/TestData/TestScriptData.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		return workbook.getSheet(sheetName).getRow(rowIndex).getCell(colIndex).getBooleanCellValue();
		
	}
	
	/**
	 * This method used to read Numeric data form excel
	 * User must pass sheet name, rowIndex, column Index
	 * @param sheetName
	 * @param rowIndex
	 * @param colIndex
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	
	public double getNumericDataFromExcel(String sheetName,int rowIndex,int colIndex) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/TestData/TestScriptData.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		return workbook.getSheet(sheetName).getRow(rowIndex).getCell(colIndex).getNumericCellValue();
		
	}
	
	/**
	 * This method used to read local date and time from an excel file
	 * User must pass sheet name, rowIndex, columnIndex
	 * @param sheetName
	 * @param rowIndex
	 * @param colIndex
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public LocalDateTime getDateTimeDataFromExcel(String sheetName,int rowIndex,int colIndex) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/TestData/TestScriptData.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		return workbook.getSheet(sheetName).getRow(rowIndex).getCell(colIndex).getLocalDateTimeCellValue();
}
}
