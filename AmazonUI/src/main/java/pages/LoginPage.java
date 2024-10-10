package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	private String accountTab = "span[class='nav-line-2 ']";
	private String userName = "input[type='email'][name='email']";
	private String continueButton = "input[id='continue']";
	private String password = "input[type='password'][name='password']";
	private String submitButton = "input[type='submit']";

	public WebElement getAccountTab() {
		return driver.findElement(By.cssSelector(accountTab));
	}

	public WebElement getUserName() {
		return driver.findElement(By.cssSelector(userName));
	}

	public WebElement getContinueButton() {
		return driver.findElement(By.cssSelector(continueButton));
	}

	public WebElement getPassword() {
		return driver.findElement(By.cssSelector(password));
	}

	public WebElement getSubmitButton() {
		return driver.findElement(By.cssSelector(submitButton));
	}

}
