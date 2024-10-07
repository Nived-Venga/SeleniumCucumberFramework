package stepDefinitions;

import java.util.List;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.PageObjectManager;
import utils.Context;

public class LoginPageStepDefinitions {
private Context context;

public LoginPageStepDefinitions(Context context) {
		this.context = context;
	}


	
	@Given("Test start")
	public void TestStart() {
		System.out.println("Automation Started");
	}

	
	@Given("User navigates to amazonurl")
	public void UserNavigateToUrl() {
		context.getDriver().get("https://www.amazon.in/");
		
	}

	@Then("Validate Title")
	public void ValidateTitle() {
		System.out.println("ValidateTitle");
	}

	@Then("Validate Amazon Logo")
	public void ValidateAmazonLogo() {
		System.out.println("ValidateAmazonLogo");
	}
	
	@Given("User login to amazonurl")
	public void UserLoginToUrl() {
	
		PageObjectManager pageObjectManager = new PageObjectManager(context.getDriver());
		pageObjectManager.getLoginPageObject().login();
	}

	@When("^User searches text$")
	public void UserSearchestext(List<String> text) {
		for(String a: text)
		{
			System.out.println("UserSearchestext: " + a );
		}
		
	}

	@Then("Search Items are displayed properly")
	public void SearchItemsAreDisplayedProperly() {
		System.out.println("SearchItemsAreDisplayedProperly");
	}
	
	@Then("Validate Logged In User")
	public void ValidateLoggedInUser() {
		System.out.println("ValidateLoggedInUser");
	}
}
