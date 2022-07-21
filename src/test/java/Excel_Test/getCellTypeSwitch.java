package Excel_Test;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class getCellTypeSwitch {
	public void allDataPrint(String path , String sheetName) throws Exception
	{
		FileInputStream fis = new FileInputStream(path);
		//Create workbook object by using work book factory
		Workbook wb = WorkbookFactory.create(fis);
		Sheet s1 = wb.getSheet(sheetName);
		for(int i = 0 ; i<=s1.getLastRowNum() ;i++) //row last number
		{
			for(int j = 0 ; j<s1.getRow(i).getLastCellNum();j++) //cell lastt number
			{
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

	public static void main(String[] args) throws Exception
{
		
		//sheet find
		

		
	
	}

}
