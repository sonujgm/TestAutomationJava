package seleniumframework.TestAutomationFramework;

import org.testng.annotations.Test;

import seleniumframework.TestComponents.Base;

public class userRegistration extends Base{
	
	
	
	@Test
	public void verifyUserRegestration() {	
		registrationDetails.goTo();
		registrationDetails.userRegistration();
		
	}

}
