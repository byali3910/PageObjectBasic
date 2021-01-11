package utilities;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

import base.Testbase;

public class DataUtil extends Testbase{
	
	@DataProvider(name="getData")
	public Object[][] getData(Method m)
	{
		String SheetName = m.getName();
		int rows = excel.getRowCount(SheetName);
		int cols = excel.getColumnCount(SheetName);
		
		Object[][] data = new Object[rows-1][cols];
		
		for(int rowNum = 2; rowNum <= rows; rowNum++)
		{
			for(int colNum = 0; colNum < cols; colNum++)
			{
				data[rowNum - 2][colNum]= excel.getCellData(SheetName, colNum, rowNum);
			}
		}
		
		return data;
	}
	

}
