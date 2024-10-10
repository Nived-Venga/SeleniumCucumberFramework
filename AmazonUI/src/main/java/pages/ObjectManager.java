package pages;

import org.openqa.selenium.WebDriver;

import actions.AmazonFashionActions;
import actions.HomePageActions;
import actions.LoginPageActions;

public class ObjectManager {

	public WebDriver driver;

	public ObjectManager(WebDriver driver) {
		this.driver = driver;
	}

	public static LoginPage getLoginPage(WebDriver driver) {
		return new LoginPage(driver);
	}

	public static LoginPageActions getLoginPageActions(WebDriver driver) {
		return new LoginPageActions(driver);
	}
	
	public static HomePage getHomePage(WebDriver driver) {
		return new HomePage(driver);
	}

	public static HomePageActions getHomePageActions(WebDriver driver) {
		return new HomePageActions(driver);
	}

	public static AmazonFashionPage getAmazonFashionPage(WebDriver driver) {
		return new AmazonFashionPage(driver);
	}

	public static AmazonFashionActions getAmazonFashionPageActions(WebDriver driver) {
		return new AmazonFashionActions(driver);
	}
	
	


}
