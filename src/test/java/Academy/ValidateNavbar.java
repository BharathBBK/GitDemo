package Academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pageObjects.LandingPage;
import resources.base;

public class ValidateNavbar extends base{
	public WebDriver driver;
	
	public static Logger log = LogManager.getLogger(base.class.getName());
	
	@BeforeTest
	public void login() throws IOException {
		
		driver =initializeDriver();
		log.info("Driver is initilized");
		 driver.get(prop.getProperty("url"));
		 log.info("Navigated to Home Page");
	}

	
	
	
	@Test
	public void ValidateNavbarM() throws IOException {
		
		LandingPage l = new LandingPage(driver);
		log.info("Successfully validated text msg");
		log.error("text validation failed");
		log.error("Navigation bar is not selected");
		Assert.assertTrue(l.menuisdplayed().isSelected());
		
	}
	
	@AfterTest
	public void close() {
		
		driver.close();
	}
}
