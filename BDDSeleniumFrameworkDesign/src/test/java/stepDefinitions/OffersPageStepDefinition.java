package stepDefinitions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Then;
import pageObjects.LandingPage;
import pageObjects.OffersPage;
import utils.TestContextSetup;

public class OffersPageStepDefinition {

	public String vegNameOnOffers;
	TestContextSetup testContextSetup;
	
	public OffersPageStepDefinition(TestContextSetup testContextSetup) {
		
		this.testContextSetup=testContextSetup;
		
	}
	
	@Then("user go and search short name {string} on offers page to check if product exist")
	public void user_go_and_search_short_name_on_offers_page_to_check_if_product_exist(String name) {
	    // Write code here that turns the phrase above into concrete actions
		OffersPage offersPage = new OffersPage(testContextSetup.driver);
		
		if(testContextSetup.driver.getTitle().equals("GreenKart - veg and fruits kart")) {
		switchToOfferspage();
		}
		offersPage.searchItem(name);
	    vegNameOnOffers = offersPage.getProductname();
	    
	}
	
	@Then("validate product name on offers and landing page")
	public void validate_product_name_on_offers_and_landing_page() {
	    // Write code here that turns the phrase above into concrete actions
	    Assert.assertEquals(testContextSetup.landingPageProductName, vegNameOnOffers);
	}
	
	public void switchToOfferspage() {
		LandingPage landingPage = new LandingPage(testContextSetup.driver);
		landingPage.clickOnTopDeals();
	    Set<String> s1 = testContextSetup.driver.getWindowHandles();
	    Iterator<String> itr = s1.iterator();
	    String parentWindow = itr.next();
	    String childWindow = itr.next();
	    testContextSetup.driver.switchTo().window(childWindow);
		
	}
}
