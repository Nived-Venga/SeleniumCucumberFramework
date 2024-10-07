package utils;

import org.openqa.selenium.WebDriver;

import pageObjects.PageObjectManager;

public class Context extends BaseClass {

	public WebDriver driver;
	public Context context;
	public BaseClass base;
	public PageObjectManager pageObjectManager;

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	public Context() {
		setDriver(BaseClass.WebDriverManager());
		pageObjectManager = new PageObjectManager(getDriver());

	}
}
