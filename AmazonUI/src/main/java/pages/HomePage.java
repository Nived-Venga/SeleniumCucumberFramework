package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	private WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	//nav-search-submit nav-sprite
private String searchDropdown = "div[class='nav-search-scope nav-sprite']";
	private String searchDropdownSelect = "select[id='searchDropdownBox']";
	private String searchTextBox = "twotabsearchtextbox";

	public WebElement getSearchDropdown() {
		return driver.findElement(By.cssSelector(searchDropdown));
	}
	
	public WebElement getSearchDropdownSelect() {
		return driver.findElement(By.cssSelector(searchDropdownSelect));
	}

	public WebElement getSearchTextBox() {
		return driver.findElement(By.id(searchTextBox));
	}

}
