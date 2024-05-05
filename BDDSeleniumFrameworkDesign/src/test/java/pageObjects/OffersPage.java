package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OffersPage {

	
	By search = By.xpath("//input[@id='search-field']");
	By productName = By.xpath("//tbody/tr/td[1]");
	
	
	public WebDriver driver;
	public OffersPage(WebDriver driver) {
		
		this.driver=driver;
	}
	
	public void searchItem(String name) {
		
		driver.findElement(search).sendKeys(name);
		
	}
	
	public String getProductname() {
		
		return driver.findElement(productName).getText();

	}
}
