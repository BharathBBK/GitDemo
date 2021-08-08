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

public class Validatetitle extends base{
	public WebDriver driver;
	
	LandingPage l;
	
	public static Logger log = LogManager.getLogger(base.class.getName());
	
	@BeforeTest
	public void login() throws IOException {
		
		driver =initializeDriver();
		log.info("Driver is initilized");
		 driver.get(prop.getProperty("url"));
		 log.info("Navigated to Home Page");
	}

	
	
	
	@Test
	public void vtitle() throws IOException {
		
	    l = new LandingPage(driver);
		System.out.println(l.FeaturedCourse().getText());
		Assert.assertEquals(l.FeaturedCourse().getText(), "FEATURED COURSES");
		log.info("Successfully validated text msg");
		log.error("text validation failed");
		//Assert.assertTrue(l.menuisdplayed().isDisplayed());
	}
	
	@Test
	public void vsubtitle() throws IOException {
		
		l = new LandingPage(driver);
		System.out.println(l.subtitle().getText());
		Assert.assertEquals(l.subtitle().getText(), "Learn Hot tools like Selenium, Appium, JMeter, SoapUI,Database Testing and more..");
		log.info("Successfully validated text msg");
		log.error("text validation failed");
		//Assert.assertTrue(l.menuisdplayed().isDisplayed());
	}
	
	@AfterTest
	public void close() {
		
		driver.close();
	}
}
