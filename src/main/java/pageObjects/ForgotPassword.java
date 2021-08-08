package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotPassword {
	
	public WebDriver driver;
	
	
    public ForgotPassword(WebDriver driver) {
    	
    	this.driver = driver;
    	PageFactory.initElements(driver,this);
    }
    
    @FindBy(css="input#user_email")
    WebElement Email;
    
    @FindBy(name="commit")
    WebElement submit;
    
    public WebElement addEmail() {
    	return Email;
    }
    
    public WebElement SendIns() {
    	return submit;
    }
}
