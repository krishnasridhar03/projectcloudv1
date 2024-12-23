package testScenarios;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class TestDataProvider {

	@DataProvider(name="menuData")
	public Object[][]getMenuData() throws IOException{
		String filepath ="./testData/projectcloudv1.xlsx";
		ExcelUtils excel =new ExcelUtils(filepath);
		
		int rowcount =excel.getRowCount("Sheet1");
		int colcount =excel.getColumnCount("Sheet1", 0);
		
		Object[][] data = new Object[rowcount-1][colcount];
		
		for(int i=1;i<rowcount;i++) {
			for(int j=0;j<colcount;j++) {
				data[i-1][j]=excel.getCellData("Sheet1", i, j);
			}
		}
		return data;
	}
}
