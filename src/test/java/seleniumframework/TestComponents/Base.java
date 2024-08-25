package seleniumframework.TestComponents;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters; 
import seleniumframework.TestAutomationFramework.registrationPage;


public class Base {
	
	// git repo: https://github.com/sonujgm/TestAutomationJava/tree/main/src/test/java
	
	public registrationPage registrationDetails;
	public WebDriver driver; 
	
	@BeforeMethod(alwaysRun=true) 
	public void driverSetup ()
	{
		System.setProperty("webDriver.chrome.driver", "C:\\Users\\DELL\\drivers\\chromedriver.exe");
		//WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--remote-allow-origins=*");

		driver = new ChromeDriver(options);
		driver.get("https://parabank.parasoft.com/"); 
		driver.manage().window().setSize(new Dimension(1440,900));//full screen
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		
		registrationDetails = new registrationPage(driver);
		
	}
	
	
	
	
	@AfterMethod(alwaysRun=true)
	
	public void tearDown() throws InterruptedException
	{
		//Thread.sleep(10000);
		driver.quit();
	}

}
