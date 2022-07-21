package Excel_Test;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;  
public class day_1 {
	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("./Excel/test.xlsx");
		//Create workbook object by using workbookfacory
		Workbook wb = WorkbookFactory.create(fis);
		//fetch number of sheet present in workbook
		int totalsheet = wb.getNumberOfSheets();
		System.out.println(totalsheet);
		//getSheetName particular
		String sheetName = wb.getSheetName(0);
		System.out.println(sheetName);
		//particular sheet index
		int sheetIndex = wb.getSheetIndex("data");
		System.out.println(sheetIndex);
		//get sheet
		Sheet s1 = wb.getSheet("data");
		//find raw complete
		int lastrawnum = s1.getLastRowNum();
		System.out.println("lastrawnum=  "  +lastrawnum );
		//physical number
		int phyrawnum = s1.getPhysicalNumberOfRows();
		System.out.println("phyrawnum " + phyrawnum);
		//row data
		Row row = s1.getRow(0);
		//last index at row 0
		int r0 = row.getLastCellNum();
		System.out.println("row 0 last index number = " +r0); //start from 1
		//physical data present at cell
		int r1 = row.getPhysicalNumberOfCells();
		System.out.println(r1); //start from 1
		//paticular cell value data print
		Cell cell = row.getCell(4);  //start from 0 
		String celldata = cell.getStringCellValue();
		System.out.println(celldata);
	}
}
