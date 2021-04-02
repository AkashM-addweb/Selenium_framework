package unicodeTech.TestSuiteA;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ManufacturersSelection extends ParentTestSuiteA{

	
	public void testManufacturersSelection() {
		
		driver.get(siteData.getProperty("url"));
		
		WebElement manuDD =isElementPresent("dd_manufactureSelection_name");
		List<WebElement> manuValues= manuDD.findElements(By.tagName("option"));
		
		for(int count=1 ; count<manuValues.size();count++ ) {
			
			manuValues.get(count).click();
			logs.info("Title: "+driver.getTitle() +"    URL:"+driver.getCurrentUrl());
			driver.navigate().back();
						
			//We need to add the below lines again because it is a virtual pointer and the list gets reset everytime the page is refreshed
			manuDD =isElementPresent("dd_manufactureSelection_name");
			manuValues= manuDD.findElements(By.tagName("option"));
		}
		
	}
}
