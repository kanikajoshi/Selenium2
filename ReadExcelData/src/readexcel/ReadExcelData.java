package readexcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		File src = new File("C:/ExcelData/TestData.xlsx");

		FileInputStream fs = new FileInputStream(src);

		XSSFWorkbook wb = new XSSFWorkbook(fs);

		int rowCount = wb.getSheetAt(0).getLastRowNum();

		for (int i = 0; i < (rowCount + 1); i++) {

			String data = wb.getSheetAt(0).getRow(i).getCell(0).getStringCellValue();
			String data2 = wb.getSheetAt(0).getRow(i).getCell(1).getStringCellValue();
			System.out.println(data + data2);
		}

		wb.close();
	}

}
