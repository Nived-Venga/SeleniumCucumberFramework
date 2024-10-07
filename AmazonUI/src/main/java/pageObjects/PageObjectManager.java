package pageObjects;

import org.openqa.selenium.WebDriver;


public class PageObjectManager {

	public WebDriver driver;

	public PageObjectManager(WebDriver driver) {
		this.driver = driver;

	}

	public LoginPage getLoginPageObject() {
		LoginPage loginpage = new LoginPage(driver);
		return loginpage;
	}

	public HomePage getHomePageObject() {
		HomePage homepage = new HomePage(driver);
		return homepage;
	}
}
