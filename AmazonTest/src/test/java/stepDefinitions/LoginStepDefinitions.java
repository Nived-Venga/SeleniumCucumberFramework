package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LoginStepDefinitions {

	
	@Given("User navigates to url")
	public void UserNavigateToUrl() {
		System.out.println("User Navigate");
	}
	
	@Then("Validate Title")
	public void ValidateTitle()
	{
		System.out.println("ValidateTitle");
	}
	
	@Then("Validate Amazon Logo")
	public void ValidateAmazonLogo()
	{
		System.out.println("ValidateAmazonLogo");
	}
}
