package seleniumframework.TestAutomationFramework;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import junit.framework.Assert;
import seleniumframework.TestComponents.Base;

public class openAccount extends Base{
	
	public static String successfulMessage = "Account Opened!";
	
	@Parameters({"password"})
	@Test
	public void verifyNewAccountOpening(String password) throws InterruptedException {
		registrationDetails.goTo(baseUrl+"register.htm");
		registrationDetails.userRegistration(password);
		
		registrationDetails.goTo(baseUrl+"openaccount.htm");
		accountOpening.selectAccountType("SAVINGS");
		accountOpening.selectAccountOpeningAmount();
		accountOpening.clickOpenAccountButton();
		
		Assert.assertEquals(accountOpening.verifySuccessMessage(), successfulMessage);
	}

}
