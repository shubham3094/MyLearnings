package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.TestContextSetup;

public class LandingPage {

	By search = By.xpath("//input[@class='search-keyword']");
	By productName = By.cssSelector("h4.product-name");
	By topDealsLink = By.linkText("Top Deals");
	
	
	public WebDriver driver;
	public LandingPage(WebDriver driver) {
		
		this.driver=driver;
	}
	
	public void searchItem(String name) {
		
		driver.findElement(search).sendKeys(name);
		
	}
	
	public String getProductname() {
		
		return driver.findElement(productName).getText().split("-")[0].trim();

	}
	
	public void clickOnTopDeals() {
		
		 driver.findElement(topDealsLink).click();
		
	}
}
