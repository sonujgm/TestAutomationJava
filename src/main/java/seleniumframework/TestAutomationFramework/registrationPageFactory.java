package seleniumframework.TestAutomationFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class registrationPageFactory {

WebDriver driver;
	
	public registrationPageFactory(WebDriver driver)
	{
	 	//initialization 
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id="customer.firstName")
	WebElement userFirstName;
	
	@FindBy(id="customer.lastName")
	WebElement userLastName;
//	
	@FindBy(id="customer.address.street")
	WebElement address;
	
	@FindBy(id="customer.address.city")
	WebElement city;
	
	@FindBy(id="customer.address.state")
	WebElement state;
	
	@FindBy(id="customer.address.zipCode")
	WebElement pincode;
	
	
}
