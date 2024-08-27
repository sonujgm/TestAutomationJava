package seleniumframework.TestAutomationFramework;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class registrationPage extends registrationPageFactory{
	
	public WebDriver driver;
	private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
    private static final Random RANDOM = new Random();
    String randomString;
	 
	public registrationPage(WebDriver driver) {
		super(driver);
		this.driver =driver;
		PageFactory.initElements(driver, this);
	}
	
	public String userRegistration(String password) {
		int length = 4; 
        randomString = generateRandomString(length);
        userFirstName.sendKeys(randomString);
        userLastName.sendKeys(randomString);
        address.sendKeys("test address");
        city.sendKeys("kolkata");
        state.sendKeys("West Bengal");
        pincode.sendKeys("7000123");
        phoneNumber.sendKeys("6314496010");
        ssn.sendKeys("123469");
        enterUserCredential(randomString,password);
        repeatedPassword.sendKeys(password);
        register.click();
        
        return randomString;
	}
	
	public void enterUserCredential(String userNameInput,String passwordInput) {
		userName.sendKeys(userNameInput);
		password.sendKeys(passwordInput);
	}
	
	public void enterLoginCredential(String userNameInput,String passwordInput) {
		loginUserName.sendKeys(userNameInput);
		loginPassword.sendKeys(passwordInput);
		loginButton.click();
	}
	
	public String verifyText() {
		String success = welcomeText.getText();
		return success;
	}
	
	public boolean verifyLoginDashboard() {
		boolean result = loginDashboard.isDisplayed();
		return result;
	}
	
	public void goTo(String URL)
	{
		driver.get(URL);
	}
	
	public static String generateRandomString(int length) {
        StringBuilder stringBuilder = new StringBuilder(length);
        
        for (int i = 0; i < length; i++) {
            int randomIndex = RANDOM.nextInt(CHARACTERS.length());
            stringBuilder.append(CHARACTERS.charAt(randomIndex));
        }
        return stringBuilder.toString();
    }
 
}
