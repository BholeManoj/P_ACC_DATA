package Excel_Test;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class getAllType {

	public static void main(String[] args) throws Exception
	{
		FileInputStream fis = new FileInputStream("./Excel/test.xlsx");
		//Create workbook object by using work book factory
		Workbook wb = WorkbookFactory.create(fis);
		Sheet s1 = wb.getSheet("data");
		//sheet find
		for(int i = 0 ; i<=s1.getLastRowNum() ;i++) //row last number
		{
			for(int j = 0 ; j<s1.getRow(i).getLastCellNum();j++) //cell last number
			{
				CellType print = s1.getRow(i).getCell(j).getCellType();
				System.out.println(print);
			}
			System.out.println();
		}


	}

}
