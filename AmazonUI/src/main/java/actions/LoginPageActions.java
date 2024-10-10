package actions;

import org.openqa.selenium.WebDriver;
import pages.ObjectManager;

public class LoginPageActions {
	WebDriver driver;

	public LoginPageActions(WebDriver driver) {
		this.driver = driver;
	}

	public void accountTabClick() {
		ObjectManager.getLoginPage(driver).getAccountTab().click();
	}

	public void enterUserName() {
		ObjectManager.getLoginPage(driver).getUserName().sendKeys("nivedvenga@gmail.com");
	}

	public void continueButtonClick() {
		ObjectManager.getLoginPage(driver).getContinueButton().click();
	}

	public void enterPassword() {
		ObjectManager.getLoginPage(driver).getPassword().sendKeys("Test@1234");
	}

	public void submitClick() {
		ObjectManager.getLoginPage(driver).getSubmitButton().click();
	}

}
