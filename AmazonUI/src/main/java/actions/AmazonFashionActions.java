package actions;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Listeners;

import pages.ObjectManager;


public class AmazonFashionActions {

	private WebDriver driver;

	public AmazonFashionActions(WebDriver driver) {
		this.driver = driver;
	}

	public void clickOnMaterialCheckBox(String material) {
		if (material.equalsIgnoreCase("Denim")) {
			ObjectManager.getAmazonFashionPage(driver).getMaterialCheckBox("Denim").click();
		}
	}
	
	public void validateSearchResultItem(String material) {
		if (material.equalsIgnoreCase("Denim")) {
			//System.out.println(ObjectManager.getAmazonFashionPage(driver).getSearchResultItems().getFirst());
			WebDriverWait wait  = new WebDriverWait(driver, Duration.ofSeconds(10));
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			List list = ObjectManager.getAmazonFashionPage(driver).getSearchResultItems();
			Iterator it = list.iterator();
			
			int i=0;
			while(it.hasNext())
			{
				System.out.println("List : " + it.next());
				System.out.println("List Value: " + list.get(i));
				i++;
			}
			String itemName = ObjectManager.getAmazonFashionPage(driver).getSearchResultItems().get(1).getText();
			System.out.println("ItemName : " + itemName);
			System.out.println("Material : " + material);
			//assertEquals(material, itemName.contains(material));
			Assert.assertEquals(material.contains("Denimo"), itemName.contains(material));
		assertEquals(true, false);
		}
	}
}