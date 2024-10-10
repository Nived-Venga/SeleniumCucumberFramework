package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonFashionPage {

	private WebDriver driver;

	public AmazonFashionPage(WebDriver driver) {
		this.driver=driver;
	}
	String material;
	
	public String getCheckbox(String material) {
		System.out.println("Material getmateriale : " + material);
		System.out.println("Checkbox: " + checkbox);
		return "li[aria-label='" + material + "']" +  " input[type='checkbox']";
	}
	
	public void checkCheckboxIsEnabled(String material) {
		Boolean a1 = driver.findElement(By.cssSelector(getCheckbox(material))).isEnabled();
		Boolean a2 = driver.findElement(By.cssSelector(getCheckbox(material))).isDisplayed();
		Boolean a3 = driver.findElement(By.cssSelector(getCheckbox(material))).isSelected();
		System.out.println("a1: " + a1  + " a2: " + a2 + " a3: " + a3);
	}
	private String checkbox = "li[aria-label='" + material + "']" +  " input[type='checkbox']";
	private String searchResultItems = "span[class='a-size-base-plus a-color-base a-text-normal']";
	
	public WebElement getMaterialCheckBox(String material) {
		System.out.println("Material Amazon FashionPage : " + material);
		this.material = material;
		return driver.findElement(By.cssSelector(getCheckbox(material)));
	}
	
	public List<WebElement> getSearchResultItems() {
		return driver.findElements(By.cssSelector(searchResultItems));
	}
}
