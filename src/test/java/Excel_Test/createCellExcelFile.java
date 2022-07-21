package Excel_Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class createCellExcelFile {
	void read() throws Exception
	{
		
		
	}
	public static void main(String[] args) throws Exception {
//		createCellExcelFile  obj = new createCellExcelFile();
//		obj.read();
		FileInputStream fis  = new FileInputStream("./Excel/createData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet s1 = wb.getSheet("testData");
		//String s1  ;
		int a = wb.getNumberOfSheets();
		System.out.println(a);
		for(int i = 1 ; i<=10;i++)
		{
			for(int j = 1 ; j<=10;j++)
			{
				//s1.createRow(i).createCell(j).setCellValue("case");
				s1.getRow(i).createCell(j).setCellValue("case");
			}
			
	}
		
		FileOutputStream fos = new FileOutputStream("./Excel/createData.xlsx");
		wb.write(fos);
		fos.close();

	}

}
