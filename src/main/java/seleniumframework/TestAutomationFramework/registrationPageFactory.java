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
	
	@FindBy(id="customer.phoneNumber")
	WebElement phoneNumber;
	
	@FindBy(id="customer.username")
	WebElement userName;
	
	@FindBy(id="customer.password")
	WebElement password;
	
	@FindBy(id="customer.ssn")
	WebElement ssn;
	
	
	@FindBy(id="repeatedPassword")
	WebElement repeatedPassword;
	
	@FindBy(css="input[value=\"Register\"]")
	WebElement register;
	
	@FindBy(css="[id=\"rightPanel\"] p")
	WebElement welcomeText;
	
	@FindBy(css="[name=\"username\"]")
	WebElement loginUserName;
	
	@FindBy(css="[name=\"password\"]")
	WebElement loginPassword;
	
	@FindBy(id="showOverview")
	WebElement loginDashboard;	
	
	@FindBy(css="[value=\"Log In\"]")
	WebElement loginButton;
	
}
