package stepDefinitions;

import java.util.List;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MainSteps {


	@Given("user is on NetBanking landing page")
	public void user_is_on_net_banking_landing_page() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("user landed on NB Page");

	}

	@When("^user login into appication with (.+) and password (.+)$")
	public void user_login_into_appication_with_and_password(String username, String password) {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Login into application with user "+username+" and password is "+password);
	}


	@Then("home page is displayed")
	public void home_page_is_displayed() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("home page is displayed");
	}
	@Then("Cards are displayed")
	public void cards_are_displayed() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Cards are displayed");
	}
	
	@Given("user is on practice landing page")
	public void user_is_on_practice_landing_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user landed on practice Page");
	}
	
	@When("user signup into application")
	public void user_signup_into_application(List<String> dataTable) {
	  
		
		System.out.println(dataTable.get(0));
		System.out.println(dataTable.get(1));
		System.out.println(dataTable.get(2));
		System.out.println(dataTable.get(3));
	}
	
	@Given("setup entries")
	public void setup_entries() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("settingup entries");
	}

	@When("launch browser using config file")
	public void launch_browser_using_config_file() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("launch browser using config file");
	}

	@Then("hit the home page url")
	public void hit_the_home_page_url() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("hit the home page url");
	}
}
