package Excel_Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class getParticularCell {
public void particularcell(String path , String sheetName , int CellNum) throws Exception
{
	FileInputStream fis = new FileInputStream(path);
	//Create workbook object by using work book factory
	Workbook wb = WorkbookFactory.create(fis);
	Sheet s1 = wb.getSheet(sheetName);
	for(int i = CellNum ; i<=CellNum;i++)
	{
		for(int j = 0 ; j<s1.getRow(i).getLastCellNum();j++)
		{
			//System.out.println(s1.getRow(i).getCell(j).getStringCellValue());
			CellType print = s1.getRow(i).getCell(j).getCellType();
			switch (print) {
			case  STRING : 
				   System.out.println( s1.getRow(i).getCell(j).getStringCellValue());
				break;
			case  NUMERIC : 
				   System.out.println( s1.getRow(i).getCell(j).getNumericCellValue());
				break;
			case BLANK:
				System.out.println( s1.getRow(i).getCell(j) + "blank aahe");
				break;
			case BOOLEAN:
				System.out.println(s1.getRow(i).getCell(j).getBooleanCellValue());
				break;
			case ERROR:
				break;
			case FORMULA:
				System.out.println(s1.getRow(i).getCell(j).getCellFormula());
				System.out.println(s1.getRow(i).getCell(j).getNumericCellValue());
				break;
			case _NONE:
				System.out.println("its blank cell");
				break;
			default:
				break;
			}
		}
		System.out.println();
	}
}
public void rangercell(String path , String sheetName , int range1 , int range2) throws Exception
{
	FileInputStream fis = new FileInputStream(path);
	//Create workbook object by using work book factory
	Workbook wb = WorkbookFactory.create(fis);
	Sheet s1 = wb.getSheet(sheetName);
	for(int i = range1 ; i<=range2;i++)
	{
		for(int j = 0 ; j<s1.getRow(i).getLastCellNum();j++)
		{
			//System.out.println(s1.getRow(i).getCell(j).getStringCellValue());
			CellType print = s1.getRow(i).getCell(j).getCellType();
			switch (print) {
			case  STRING : 
				   System.out.println( s1.getRow(i).getCell(j).getStringCellValue());
				break;
			case  NUMERIC : 
				   System.out.println( s1.getRow(i).getCell(j).getNumericCellValue());
				break;
			case BLANK:
				System.out.println( s1.getRow(i).getCell(j) + "blank aahe");
				break;
			case BOOLEAN:
				System.out.println(s1.getRow(i).getCell(j).getBooleanCellValue());
				break;
			case ERROR:
				break;
			case FORMULA:
				System.out.println(s1.getRow(i).getCell(j).getCellFormula());
				System.out.println(s1.getRow(i).getCell(j).getNumericCellValue());
				break;
			case _NONE:
				System.out.println("its blank cell");
				break;
			default:
				break;
			}
		}
		System.out.println();
	}
}
	public static void main(String[] args) throws Exception {
		

	}

}
