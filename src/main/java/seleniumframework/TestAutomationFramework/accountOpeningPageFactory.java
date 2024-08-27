package seleniumframework.TestAutomationFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class accountOpeningPageFactory extends commonUI{
	public WebDriver driver;

	public accountOpeningPageFactory(WebDriver driver) {
		// TODO Auto-generated constructor stub
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="type")
	WebElement accountType;
	
	@FindBy(id="fromAccountId")
	WebElement amount;
	
	@FindBy(css="[value=\"Open New Account\"]")
	WebElement openAccount;
	
	@FindBy(css="[id=\"openAccountResult\"] h1")
	WebElement successBanner;
	
	
}
