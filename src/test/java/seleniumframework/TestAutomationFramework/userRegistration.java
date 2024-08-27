package seleniumframework.TestAutomationFramework;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import junit.framework.Assert;
import seleniumframework.TestComponents.Base;

public class userRegistration extends Base{
	public static String userName = "";
	
	@Parameters({"password"})
	@Test(alwaysRun=true)
	public void verifyUserRegestration(String password) {	
		registrationDetails.goTo(baseUrl+"register.htm");
		userName = registrationDetails.userRegistration(password);
		String success = registrationDetails.verifyText();
		Assert.assertEquals(success,registrationSuccessMessage);
	}
}
