package stepDefinitions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LandingPageStepDefinition {

	WebDriver driver;
	public String landingPageProductName;
	public String vegNameOnOffers;
	
	@Given("user is on Greencart landing page")
	public void user_is_on_greencart_landing_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shubh\\OneDrive\\Desktop\\chromedriver.exe");
		driver =  new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
	}

	@When("user search short name {string} and exttracted actual name of product")
	public void user_search_short_name_and_exttracted_actual_name_of_product(String name) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.xpath("//input[@class='search-keyword']")).sendKeys(name);
	    Thread.sleep(3000);
	    landingPageProductName = driver.findElement(By.cssSelector("h4.product-name")).getText().split("-")[0].trim();
	    System.out.println("product name extracted from home page: "+landingPageProductName);
	}

	@Then("user go and search short name {string} on offers page to check if product exist")
	public void user_go_and_search_short_name_on_offers_page_to_check_if_product_exist(String name) {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.linkText("Top Deals")).click();
	    Set<String> s1 = driver.getWindowHandles();
	    Iterator<String> itr = s1.iterator();
	    String parentWindow = itr.next();
	    String childWindow = itr.next();
	    
	    driver.switchTo().window(childWindow);
	    
	    driver.findElement(By.xpath("//input[@id='search-field']")).sendKeys(name);
	    vegNameOnOffers = driver.findElement(By.xpath("//tbody/tr/td[1]")).getText();
	    
	}
	
	@Then("validate product name on offers and landing page")
	public void validate_product_name_on_offers_and_landing_page() {
	    // Write code here that turns the phrase above into concrete actions
	    Assert.assertEquals(landingPageProductName, vegNameOnOffers);
	}

	
}
