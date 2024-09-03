package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	
	@Before()
	public void TestInitiation() {
		System.out.println("Test started");
	}
	
	@After()
	public void TestTermination() {
		System.out.println("Test ended");
	}
	
}
