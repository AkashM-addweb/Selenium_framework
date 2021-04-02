package unicodeTech.TestSuiteC;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MenuList extends ParentTestSuiteC {

	public void TestMenuList() {
		
		driver.get(siteData.getProperty("url"));
		
		WebElement mainMenu= isElementPresent("div_menu_id");		
		List<WebElement> menuLinks= mainMenu.findElements(By.tagName("a"));
		
		for(int count=0 ; count <menuLinks.size(); count++) {
			
			menuLinks.get(count).click();
			driver.navigate().back();
			
			mainMenu= isElementPresent("div_menu_id");		
			menuLinks= mainMenu.findElements(By.tagName("a"));
		}
		
	}
	
}
