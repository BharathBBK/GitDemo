package Academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pageObjects.ForgotPassword;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.base;

public class HomePage extends base{
	
	public WebDriver driver;
	
	public static Logger log = LogManager.getLogger(base.class.getName());
	
	/*@BeforeMethod
	public void login() throws IOException {
		
		driver =InitilizeDriver();
		 driver.get(prop.getProperty("url"));
	}*/

	@BeforeTest
	public void login() throws IOException {
		
		driver =initializeDriver();
	}
	
	@Test(dataProvider="getdata")
	public void basepagenav(String username, String password, String text) throws IOException, InterruptedException {
		
	//driver =InitilizeDriver();
	driver.get(prop.getProperty("url"));
	 LandingPage l = new LandingPage(driver);
	// driver.navigate().refresh();
	 LoginPage p = l.login();
	 p.Email().sendKeys(username);
	 p.Password().sendKeys(password);
	 p.Submit().click();
	 
	 ForgotPassword fp = p.Fpassword();
	 fp.addEmail().sendKeys("validate@abc");
	 Thread.sleep(3000);
	 fp.SendIns().click();
	 
	 //Thread.sleep(2000);
	 System.out.println(text);
	 log.info("Successfully validated Data Provider--"+text);
	 
	 
	}
	
	
	@DataProvider
	public Object[][] getdata() {
		
		//Row stands for how many different data type test should run
		//column stands for how many values for each test
		// array size is 5 = 0,1,2,3,4,
		
		Object[][] data = new Object[2][3];
		//oth row
		data[0][0]="validuser@qa.com";
		data[0][1]="pwd@123";
		data[0][2]="validUserVV";
		// 1st row
		data[1][0]="invaliduser@qa.com";
		data[1][1]="inpwd@123";
		data[1][2]="invalidUserVV";
		
		return data;
	}
	
	
	@AfterTest
public void close() {
		
		driver.close();
	}
	
	
	/*@AfterMethod
	public void close() {
		
		driver.close();
	}*/
	
	
	
}
