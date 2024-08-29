package seleniumframework.TestAutomationFramework;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import seleniumframework.TestComponents.Base;

public class fundTransfer extends Base{
	String amount = "1000";
	
	@Parameters({"password"})
	@Test
	public void verifyFunderTranser(String password) { 
		registerUser(password);
		registrationDetails.goTo(baseUrl+"transfer.htm");
		fundtransfer.transferAmount(amount);
		
		String status = fundtransfer.verifyTransferAmount();
		Assert.assertTrue(status.contains("$"+amount));
	}

}
