package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	
	public WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	private @FindBy(css="input#user_email")
	WebElement Email;
	
	private @FindBy(css="input[type='password']")
	WebElement Password;
	
	private @FindBy(xpath="//input[@type='submit']")
	WebElement submit;
	
	private @FindBy(css="a[href*=password]")
	WebElement Forgotpassword;
	
	
	public WebElement Email() {
		return Email;
	}
	
	public WebElement Password() {
		return Password;
	}

	public WebElement Submit() {
		return submit;
	}
	

	public ForgotPassword Fpassword() {
		
		Forgotpassword.click();
		return new ForgotPassword(driver);
	}

}
