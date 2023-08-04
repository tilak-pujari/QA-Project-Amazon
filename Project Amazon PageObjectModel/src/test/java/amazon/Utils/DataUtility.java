package amazon.Utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataUtility {

	public String getDataFromPropertiesFile(String key) throws IOException {
		FileInputStream fis = new FileInputStream("src/test/resources/commonData.properties");
		Properties pobj = new Properties();
		pobj.load(fis);
		String value = pobj.getProperty(key);
		return value;
	}

	public String getDataFromXLFile(String sheetName, int rowNum, int cellNum) throws IOException {
		FileInputStream fis = new FileInputStream("//src/test/resources/commonData.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sh = book.getSheet(sheetName);

		DataFormatter format = new DataFormatter();
		String value = format.formatCellValue(sh.getRow(rowNum).getCell(cellNum));
		return value;
	}

	public String getDataFromXLFile(int sheetNum, int rowNum, int cellNum) throws IOException {
		FileInputStream fis = new FileInputStream("src/test/resources/commonData.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sh = book.getSheetAt(sheetNum);

		DataFormatter format = new DataFormatter();
		String value = format.formatCellValue(sh.getRow(rowNum).getCell(cellNum));
		return value;
	}

}
