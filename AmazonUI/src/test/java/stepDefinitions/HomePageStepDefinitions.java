package stepDefinitions;

import io.cucumber.java.en.Then;
import utils.Context;

public class HomePageStepDefinitions {
	
	private Context context;

	public HomePageStepDefinitions(Context context) {
			this.context = context;
		}



	@Then("User validates Homepage")
	public void UserValidateHomePage() {
		String title = context.driver.getTitle();
		System.out.println("User Validate HomePageTitle : " + title);
		System.out.println("User Validate HomePage");
		
	}
}
