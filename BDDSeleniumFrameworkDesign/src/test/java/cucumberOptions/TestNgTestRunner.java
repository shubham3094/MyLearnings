package cucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "src/test/java/features",
		glue= {"stepDefinitions"},
		monochrome=true,
		//dryRun = true,
		plugin = {"pretty"}
		)
public class TestNgTestRunner extends AbstractTestNGCucumberTests {


}
