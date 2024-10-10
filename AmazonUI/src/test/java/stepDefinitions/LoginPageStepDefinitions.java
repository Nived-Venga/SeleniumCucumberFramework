package stepDefinitions;

import static org.testng.Assert.assertEquals;

import java.awt.AWTException;
import java.util.List;

import org.testng.annotations.Listeners;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ObjectManager;
import utilities.TestContextSetup;
import genericFunctions.*;


public class LoginPageStepDefinitions {
	TestContextSetup context;

	public LoginPageStepDefinitions(TestContextSetup context) {
		this.context = context;
	}

	@Given("Test start")
	public void TestStart() {
		System.out.println("Automation Started");
		
	}

	@Given("User navigates to amazonurl")
	public void UserNavigateToUrl() {
		context.driver.get("https://www.amazon.in/");
		assertEquals(true, false);

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
		System.out.println("Driver: " + context.driver);
		new LoginToApplication(context.driver).Login("amazon");

	}
	

	@When("^User searches text$")
	public void UserSearchestext(List<String> text) {
		for (String a : text) {
			System.out.println("UserSearchestext: " + a);
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
	
	@When("User selects {string} and Search for an {string}")
	public void UserSelectsProductAndSearchForAnItem(String product, String item) throws InterruptedException, AWTException {
		new SearchBox(context.driver).SearchAnItem(product, item);
		
	}
	
	@When("User validates the searched item {string}")
	public void UserValidatesTheSearchedItem( String item) {
		new SearchBox(context.driver).ValidateItem(item);
		
	}
}
