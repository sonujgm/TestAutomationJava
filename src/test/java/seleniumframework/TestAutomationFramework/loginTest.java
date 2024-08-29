package seleniumframework.TestAutomationFramework;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import junit.framework.Assert;
import seleniumframework.TestComponents.Base;

public class loginTest extends Base{
	public static String userName = "";

	@Parameters({"password" })
	@Test()
	public void verifyLoginCredential(String password) {
		registerUser(password);
		registrationDetails.goTo(baseUrl+"index.htm?ConnType=JDBC");  
		registrationDetails.enterLoginCredential(userName,password);
		boolean status = registrationDetails.verifyLoginDashboard();
		Assert.assertTrue(status);
	}

}
