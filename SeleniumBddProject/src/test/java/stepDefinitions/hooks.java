package stepDefinitions;

import io.cucumber.java.Before;

//Hooks are pre-requites steps which are common across all features files unlike Background feature is used for single feature file
public class hooks {

	@Before("@Netbanking")
	public void netbankingSetUp() {
		
		System.out.println("Setting entries in NB");
	}
	
	@Before("@Mortgage")
	public void mortgageSetUp() {
		
		System.out.println("Setting entries in mortgage");
	}
	
	//Order of execution by test runner
	// @Before(in hooks) -> Background(in feature files) -> Sceanrios -> @After
}
