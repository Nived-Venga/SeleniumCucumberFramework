package resources;

import org.openqa.selenium.WebDriver;
import pages.LoginPage;

public class HelperClass {


	public void getLoginPage(WebDriver driver) {
		new LoginPage(driver);
	}

	// public HelperClass() {
	// this.driver=driver;
	// }

	// public static WebDriver getDriver() {
	// return driver;
	// }

	// public static void setDriver() {
	// if(driver!= null) {
	// System.out.println("HelperClass getDriver" + HelperClass.getDriver());
	// HelperClass.getDriver();
	// }

}
