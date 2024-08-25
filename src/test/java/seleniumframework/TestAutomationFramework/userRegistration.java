package seleniumframework.TestAutomationFramework;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import junit.framework.Assert;
import seleniumframework.TestComponents.Base;

public class userRegistration extends Base{
	public static String userName = "";
	
	@Parameters({"password"})
	@Test
	public void verifyUserRegestration(String password) {	
		registrationDetails.goTo("https://parabank.parasoft.com/parabank/register.htm");
		userName = registrationDetails.userRegistration(password);
		String success = registrationDetails.verifyText();
		Assert.assertEquals(success,"Your account was created successfully. You are now logged in.");
	}
	
    
	@Parameters({"password" })
	@Test(dependsOnMethods= { "verifyUserRegestration" })
	public void verifyLoginCredential(String password) {	
		registrationDetails.goTo("https://parabank.parasoft.com/parabank/index.htm?ConnType=JDBC");  
		registrationDetails.enterLoginCredential(userName,password);
		boolean status = registrationDetails.verifyLoginDashboard();
		Assert.assertTrue(status);
	}
}
