package unicodeTech.TestSuiteB;

import org.openqa.selenium.Keys;

import unicodeTech.TestSuiteA.ParentTestSuiteA;

public class SearchProduct extends ParentTestSuiteA {
	
	public void testSearchProduct() {
		
		driver.get(siteData.getProperty("url"));
		
		isElementPresent("ip_keyword_name").sendKeys("Samsung");
		isElementPresent("ip_keyword_name").sendKeys(Keys.ENTER);
		
	}

}
