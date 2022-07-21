package Excel_Test;
public class genericMethodCall {
	void one() throws Exception
	{
		getCellTypeSwitch obj = new getCellTypeSwitch();
//		get all data particular sheet
		String path = "./Excel/test.xlsx";
		String sheetName = "data";
		obj.allDataPrint(path, sheetName);
	}
	void two() throws Exception
	{
		String path = "./Excel/test.xlsx";
		String sheetName = "data";
		getParticularCell obj1 = new getParticularCell();
		obj1.particularcell(path, sheetName, 5);
	}
	void three() throws Exception
	{
		String path = "./Excel/test.xlsx";
		String sheetName = "data";
		//call method particular range
		getParticularCell obj1 = new getParticularCell();
				obj1.rangercell(path, sheetName, 6, 8);
	}
	public static void main(String[] args) throws Exception {
		getCellTypeSwitch obj = new getCellTypeSwitch();
//		get all data particular sheet
		String path = "./Excel/test.xlsx";
		String sheetName = "data";
		obj.allDataPrint(path, sheetName);
		//particular cell call
		getParticularCell obj1 = new getParticularCell();
		obj1.particularcell(path, sheetName, 5);
		//call method particular range
		obj1.rangercell(path, sheetName, 6, 8);
		//random cell call
		ramdomCellCall obj2 = new ramdomCellCall();
		obj2.randomcell(path, sheetName);
	}
}
