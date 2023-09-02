package STEPDEFINITION;

import Base.BassClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginPage extends BassClass{
	
	@Given("^Navigate to login Page$")
	public void navigate_to_login_Page() throws Throwable {
	    
	}

	@When("^Enter the UserName \"([^\"]*)\" and  Password \"([^\"]*)\"$")
	public void enter_the_UserName_and_Password(String arg1, String arg2) throws Throwable {
	    
	}

	@When("^Click on the login button$")
	public void click_on_the_login_button() throws Throwable {
	    
	}

	@Then("^Verify home page of Facebook$")
	public void verify_home_page_of_Facebook() throws Throwable {
	    
	}


}
