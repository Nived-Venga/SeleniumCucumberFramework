package actions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import pages.ObjectManager;

public class HomePageActions {

	private WebDriver driver;

	public HomePageActions(WebDriver driver) {
		this.driver = driver;
	}

	public void clickOnSearchDropdown() {
		ObjectManager.getHomePage(driver).getSearchDropdown().click();
	}
	
	public void clickOnSearchTextBoxt() {
		ObjectManager.getHomePage(driver).getSearchTextBox().click();
	}
	
	public void SelectOptionSearchDropdownSelect(String option) {
		Select select  = new Select(ObjectManager.getHomePage(driver).getSearchDropdownSelect());
		ObjectManager.getHomePage(driver).getSearchTextBox();
		System.out.println("Select: " + select);
		System.out.println("Option: " + option);
		if(option.equalsIgnoreCase("Baby")) {
			System.out.println("I am here");
			select.selectByVisibleText("Baby");
System.out.println("Selected");			
		}
	}
	
	public void SearchForItemSearchTextBox(String search_item) throws InterruptedException, AWTException {
		
		if(search_item.equalsIgnoreCase("Denim")) {
			System.out.println("Inside search");
			ObjectManager.getHomePage(driver).getSearchTextBox().click();
			ObjectManager.getHomePage(driver).getSearchTextBox().sendKeys("Denim");
			Thread.sleep(20);
			System.out.println("Search Completed");
		
		}
		Actions actions = new Actions(driver);
		ObjectManager.getHomePage(driver).getSearchTextBox().click();
		actions.keyUp(Keys.ENTER);
		actions.keyDown(Keys.ENTER);
		ObjectManager.getHomePage(driver).getSearchTextBox().click();
		Robot robot = new Robot();
		ObjectManager.getHomePage(driver).getSearchTextBox().click();
		robot.keyPress(KeyEvent.VK_ENTER);
		System.out.println("ENDED");
	}
}
