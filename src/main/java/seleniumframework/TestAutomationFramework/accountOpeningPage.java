package seleniumframework.TestAutomationFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class accountOpeningPage extends accountOpeningPageFactory{
	public WebDriver driver;

	public accountOpeningPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		super(driver);
		this.driver=driver;
	}
	
	public void selectAccountType(String account) {
		 slectElementByText(accountType,account);
	}
	
	public void selectAccountOpeningAmount() {
		 Select select = new Select(amount);
		 select.selectByIndex(0);
	}
	
	public void clickOpenAccountButton() { 
		clickElement(openAccount);
	}

	public String verifySuccessMessage() {
		String message = successBanner.getText();
		return message;
	}
}
