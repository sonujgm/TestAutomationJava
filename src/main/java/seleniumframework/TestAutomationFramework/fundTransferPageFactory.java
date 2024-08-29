package seleniumframework.TestAutomationFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class fundTransferPageFactory extends commonUI{
	
	WebDriver driver;
	
	public fundTransferPageFactory(WebDriver driver) {
		super(driver);
		this.driver =driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "amount")
	WebElement amountInput;
	
	@FindBy(id = "fromAccountId")
	WebElement fromAccountField;
	
	@FindBy(id = "toAccountId")
	WebElement toAccountField;

	@FindBy(css = "input[value='Transfer']")
	WebElement transferButton;
	
	@FindBy(id = "amountResult")
	WebElement transferAmount;
	
	@FindBy(id = "showResult")
	WebElement resultSection;
	 
}
