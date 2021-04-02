package unicodeTech.TestSuiteB;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class NewProductForMonths extends ParentTestSuiteB{
	
	public void testNewProductForMonths() {
		
		driver.get(siteData.getProperty("url"));
		
		
		//Table Code
		WebElement newProdTable = isElementPresent(objectStorage.getProperty("tbl_newProduct_xpath"));
		List<WebElement> tableRows= newProdTable.findElements(By.tagName("tr"));
		
		for(int row=0 ; row<tableRows.size(); row++) {
			
			List<WebElement> tableCols= tableRows.get(row).findElements(By.tagName("a"));
			
			for(int col=0; col<tableCols.size(); col++) {
				
				logs.info(tableCols.get(col).getText());
			}
			
		}
		
	}

}
