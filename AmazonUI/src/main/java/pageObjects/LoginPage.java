package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	private String accountTab = "span[class='nav-line-2 ']";
	private String userName = "input[type='email'][name='email']";
	private String continueButton = "input[id='continue']";
	private String password = "input[type='password'][name='password']";
	private String submitButton = "input[type='submit']";
	private WebDriver driver;


	public void accountTabClick() {
		System.out.println("Driver accoutTabClick: " + driver);
		driver.findElement(By.cssSelector(accountTab)).click();
	}

	public void enterUserName() {
		driver.findElement(By.cssSelector(userName)).sendKeys("nivedvenga@gmail.com");
	}

	public void continueButtonClick() {
		driver.findElement(By.cssSelector(continueButton)).click();
	}

	public void enterPassword() {
		driver.findElement(By.cssSelector(password)).sendKeys("Test@1234");
	}

	public void submitClick() {
		driver.findElement(By.cssSelector(submitButton)).click();
	}

	public void login() {
		accountTabClick();
		enterUserName();
		continueButtonClick();
		enterPassword();
		submitClick();
	}

}
