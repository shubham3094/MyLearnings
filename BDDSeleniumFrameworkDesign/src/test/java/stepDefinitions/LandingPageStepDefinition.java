package stepDefinitions;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageObjects.LandingPage;
import utils.TestContextSetup;

public class LandingPageStepDefinition {

	public String vegNameOnOffers;
	TestContextSetup testContextSetup;
	
	public LandingPageStepDefinition(TestContextSetup testContextSetup) {
		
		this.testContextSetup=testContextSetup;
		
	}
	
	@Given("user is on Greencart landing page")
	public void user_is_on_greencart_landing_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shubh\\OneDrive\\Desktop\\chromedriver.exe");
		testContextSetup.driver =  new ChromeDriver();
		testContextSetup.driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
	}

	@When("user search short name {string} and exttracted actual name of product")
	public void user_search_short_name_and_exttracted_actual_name_of_product(String name) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		LandingPage landingPage = new LandingPage(testContextSetup.driver);
		landingPage.searchItem(name);
	    Thread.sleep(3000);
	    testContextSetup.landingPageProductName = landingPage.getProductname();
	}

}
