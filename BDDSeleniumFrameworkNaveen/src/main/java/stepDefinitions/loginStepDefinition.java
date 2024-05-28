package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class loginStepDefinition {
	
	WebDriver driver;
	
	@Given("^User is already on login page$")
	public void user_already_on_login_page() throws Throwable{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shubh\\OneDrive\\Desktop\\chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.freecrm.com");
		throw new PendingException();
	
	}
	
	@When("^tittle of login page is Free CRm$")
	public void tittle_of_login_page_is_Free_CRm() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    String title = driver.getTitle();
	    Assert.assertEquals("#1 Free CRM for Any Business: Online Customer Relationship Software", title);
	}

	@Then("^user enters username and password$")
	public void user_enters_username_and_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^user user clicks on login button$")
	public void user_user_clicks_on_login_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^user is on home page$")
	public void user_is_on_home_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

}
