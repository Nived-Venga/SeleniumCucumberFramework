package stepDefinitions;

import io.cucumber.java.en.Then;
import utilities.TestContextSetup;

public class HomePageStepDefinitions {
	//HomePage
	private TestContextSetup context;

	public HomePageStepDefinitions(TestContextSetup context) {
			this.context = context;
		}



	@Then("User validates Homepage")
	public void UserValidateHomePage() {
		String title = context.driver.getTitle();
		System.out.println("User Validate HomePageTitle : " + title);
		System.out.println("User Validate HomePage");
		
	}
}
