package stepDefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.Context;

public class Hooks {
	WebDriver driver;
	private Context context;

	public Hooks(Context context) {
		this.context = context;
	}

	@Before()
	public void TestInitiation() {
		System.out.println("Test started");
	}

	@After()
	public void TestTermination() {
		context.getDriver().close();
		System.out.println("Test ended");
	}

}
