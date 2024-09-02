package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.*;

//import org.junit.runner.RunWith;

//import io.cucumber.junit.CucumberOptions;





@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/features",
				glue = "stepDefinitions"
				//plugin = {"pretty", "html:target/cucumber-reports.html"
	//}
		)
	public class Runner {
}
