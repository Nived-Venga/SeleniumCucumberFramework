package genericFunctions;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;

import pages.ObjectManager;

public class SearchBox {

	private WebDriver driver;
	public SearchBox(WebDriver driver) {
		this.driver=driver;
	}
	public void SearchAnItem(String product, String search_item) throws InterruptedException, AWTException {
		ObjectManager.getHomePageActions(driver).clickOnSearchDropdown();
		ObjectManager.getHomePageActions(driver).SelectOptionSearchDropdownSelect(product);
		ObjectManager.getHomePageActions(driver).SearchForItemSearchTextBox(search_item);
	}
	
	public void ValidateItem(String material)
	{
		System.out.println("Material: " + material);
		//ObjectManager.getAmazonFashionPage(driver).checkCheckboxIsEnabled(material);
		//ObjectManager.getAmazonFashionPageActions(driver).clickOnMaterialCheckBox(material);
		ObjectManager.getAmazonFashionPageActions(driver).validateSearchResultItem(material);
	}
	
}
