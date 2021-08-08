package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
	
	public WebDriver driver;
	
	public LandingPage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css="a[href*= 'sign_in']")
	WebElement login;
	
	@FindBy(xpath="//button[text()='NO THANKS']")
	WebElement NoThanks;
	
	@FindBy(xpath="//h2[text()='Featured Courses']")
	WebElement FeaturedCourse;
	
	@FindBy(css="ul.nav.navbar-nav.navbar-right")
	WebElement menubar;
	
	@FindBy(xpath="//p[contains(text(),'Learn Hot')]")
	WebElement subtitle;
	
	public WebElement subtitle() {
		return subtitle;
	}
	
	
	public LoginPage login() {
		 login.click();
		 LoginPage p = new LoginPage(driver);
		 return p;
	}
	public WebElement FeaturedCourse() {
		return FeaturedCourse;
	}
	public WebElement menuisdplayed() {
		return menubar;
	}
	
	public WebElement NoThanks() {
		return NoThanks;
	}
	
	public List<WebElement> Popup() {
		return driver.findElements(By.xpath("//button[text()='NO THANKS']"));
	}

}
