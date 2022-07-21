package Excel_Test;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
public class ramdomCellCall {
	public void randomcell(String path , String sheetName ) throws Exception
	{
		FileInputStream fis = new FileInputStream(path);
		//Create workbook object by using work book factory
		Workbook wb = WorkbookFactory.create(fis);
		Sheet s1 = wb.getSheet(sheetName);
		int min =0;   
		int max = s1.getLastRowNum();
		int range = (min - max) - 1;
		System.out.println("Random Numbers between 10 and 20:");
		int random = (int)(Math.random() * range) + max;
		for(int i = random ; i<=random;i++)
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
				}}
			System.out.println();
		} }
}
