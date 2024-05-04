package cucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="src/test/java/features",
		glue= {"stepDefinitions"},
		monochrome = true,
		tags="@Smoke or @Regression", // (will run with tags either smoke or regression)
		//tags="@Smoke and @Regression"  (will run with both tags available smoke and regression)
		//tags="not @Regression"  //(will run scenarios with No Regression tags)
		plugin= {"pretty", "html:target/cucumber.html", "json:target/cucumber.json"},
		dryRun = true
		)
public class TestNgTestRunner extends AbstractTestNGCucumberTests{

}
