package genericFunctions;

import org.openqa.selenium.WebDriver;
import pages.ObjectManager;

public class LoginToApplication {

	WebDriver driver;

	public LoginToApplication(WebDriver driver) {
		this.driver = driver;
	}

	// application = "Amazon"
	public void Login(String application) {
		if (application.equalsIgnoreCase("Amazon")) {
			ObjectManager.getLoginPageActions(driver).accountTabClick();
			ObjectManager.getLoginPageActions(driver).enterUserName();
			ObjectManager.getLoginPageActions(driver).continueButtonClick();
			ObjectManager.getLoginPageActions(driver).enterPassword();
			ObjectManager.getLoginPageActions(driver).submitClick();

		}
	}

}
