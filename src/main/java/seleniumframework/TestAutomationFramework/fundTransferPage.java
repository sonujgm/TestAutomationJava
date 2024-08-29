package seleniumframework.TestAutomationFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class fundTransferPage extends fundTransferPageFactory{
	WebDriver driver;
	public fundTransferPage(WebDriver driver) {
		super(driver);
		this.driver =driver;
		PageFactory.initElements(driver, this);
	}
	
	public void transferAmount(String amount) {
		amountInput.sendKeys(amount);
		slectElementByIndex(fromAccountField,0);
		slectElementByIndex(toAccountField,0);
		clickElement(transferButton);
	}
	
	public String verifyTransferAmount() {
		waitForDisplay(resultSection);
		String result = transferAmount.getText();
		return result;
	}

}
