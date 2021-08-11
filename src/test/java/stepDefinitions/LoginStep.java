package stepDefinitions;

import java.io.IOException;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.base;

public class LoginStep extends base {


	@Given("intialize browser with chrome")
	public void intialize_browser_with_chrome() throws IOException {
		// Write code here that turns the phrase above into concrete actions
		driver = initializeDriver();
	}
	 @And("^Navigate to \"([^\"]*)\" site$")
	    public void navigate_to_something_site(String url) throws Throwable {
		 
		 driver.get(url);
	        
	    }
	@And("Click on Login link in home page to land on sign in screen")
	public void click_on_login_link_in_home_page_to_land_on_sign_in_screen() {
		// Write code here that turns the phrase above into concrete actions
		 LandingPage l = new LandingPage(driver);
			// driver.navigate().refresh();
		 if(l.Popup().size() > 0) {
			 
			 l.NoThanks().click();
		 } else if (l.NoThanks().isDisplayed()) {
			 l.NoThanks().click();
		 }
			 l.login();
		
	}
	@When("^user enteres valid (.+) and (.+) and log in$")
    public void user_enteres_valid_something_and_something_and_log_in(String strArg1, String strArg2) throws Throwable {
		
		LoginPage p = new LoginPage(driver);
		 p.Email().sendKeys(strArg1);
		 p.Password().sendKeys(strArg2);
		 p.Submit().click();
		 System.out.println(strArg1 +""+ strArg2);
        
    }
	@Then("Verify that user lands on Home screen")
	public void verify_that_user_lands_on_home_screen() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("invalid cred login failed1");
		System.out.println("invalid cred login failed2");
		
		
	}


	@And("Close Browsers")
	public void close_browsers() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("browsers closed successfully");
	    driver.quit();
	}


}
