package seleniumframework.TestComponents;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import junit.framework.Assert;
import seleniumframework.TestAutomationFramework.accountOpeningPage;
import seleniumframework.TestAutomationFramework.fundTransfer;
import seleniumframework.TestAutomationFramework.fundTransferPage;
import seleniumframework.TestAutomationFramework.registrationPage;


public class Base {
	
	// git repo: https://github.com/sonujgm/TestAutomationJava/tree/main/src/test/java
	
	public static registrationPage registrationDetails;
	public accountOpeningPage accountOpening;
	public fundTransferPage fundtransfer;
	public WebDriver driver; 
	public static String baseUrl = "https://parabank.parasoft.com/parabank/";
	public static String registrationSuccessMessage = "Your account was created successfully. You are now logged in.";
	public static String userName = "";
	
	@Parameters({"browser"})
	@BeforeMethod(alwaysRun=true) 
	public void driverSetup (String browser)
	{
		if(browser.equalsIgnoreCase("chrome")) {
		System.setProperty("webDriver.chrome.driver", "C:\\Users\\DELL\\drivers\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--remote-allow-origins=*");

		driver = new ChromeDriver(options);
		}  else if (browser.equalsIgnoreCase("firefox")) {
		 System.setProperty("webdriver.gecko.driver", "C:\\Users\\DELL\\drivers\\geckodriver.exe");
		 driver = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("edge")) {
			// Edge
			System.setProperty("webdriver.edge.driver", "edge.exe");
			driver = new EdgeDriver();
		}
		
		driver.get("https://parabank.parasoft.com/"); 
		driver.manage().window().setSize(new Dimension(1440,900)); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		
		registrationDetails = new registrationPage(driver);
		accountOpening = new accountOpeningPage(driver);
		fundtransfer = new fundTransferPage(driver);
		
	}
	
	@Parameters({"password"})
	public static void registerUser(String password) {	
		try {
			registrationDetails.goTo(baseUrl+"register.htm");
			userName = registrationDetails.userRegistration(password);
		} catch (Exception e) { 
			e.printStackTrace();
		}  
		String success = registrationDetails.verifyText();
		Assert.assertEquals(success,registrationSuccessMessage);
	}
	
	public String getScreenshot(String testCaseName,WebDriver driver) throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File file = new File(System.getProperty("user.dir") + "//reports//" + testCaseName + ".png");
		FileUtils.copyFile(source, file);
		return System.getProperty("user.dir") + "//reports//" + testCaseName + ".png";
	}
	
	@AfterMethod(alwaysRun=true)
	public void tearDown() throws InterruptedException
	{
		driver.quit();
	}
}
