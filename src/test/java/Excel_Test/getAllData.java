package Excel_Test;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
public class getAllData {
	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("./Excel/test.xlsx");
		//Create workbook object by using workbookfacory
		Workbook wb = WorkbookFactory.create(fis);
		Sheet s1 = wb.getSheet("data");
		for(int i= 0;i<=s1.getLastRowNum();i++)
		{
			for(int j = 0 ; j<s1.getRow(i).getLastCellNum();j++)
			{
				System.out.println(s1.getRow(i).getCell(j).getStringCellValue());
			}
			System.out.println();
		}
	}
}
