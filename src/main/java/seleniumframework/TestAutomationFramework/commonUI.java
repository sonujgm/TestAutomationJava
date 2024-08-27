package seleniumframework.TestAutomationFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class commonUI {
	
	WebDriver driver;
	
	public commonUI(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickElement(WebElement element) {
		element.click();
	}
 
	public void slectElementByText(WebElement element,String text) {
		Select select = new Select(element);
		select.selectByVisibleText(text);
	}

}
