import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ReadExcel {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		HSSFWorkbook workbook = new HSSFWorkbook(new FileInputStream("excel.xls"));
		HSSFSheet sheet = workbook.getSheetAt(0);
		HSSFRow row = sheet.getRow(0);
		if (row.getCell(0).getCellType() == HSSFCell.CELL_TYPE_STRING) {
			System.out.println(row.getCell(0).getStringCellValue());
		}
		if (row.getCell(1).getCellType() == HSSFCell.CELL_TYPE_NUMERIC) {
			System.out.println(row.getCell(1).getDateCellValue());
		}
	}
}
