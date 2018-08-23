package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import seleniumPages.Page_GoogleHomepage;

public class StepDefs_GoogleHomepage {

	Page_GoogleHomepage googleHomepage = new Page_GoogleHomepage();
	
	@Given("^I launch Chrome browser$")
	public void i_launch_Chrome_browser() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    googleHomepage.launchBrowser();
	}

	@When("^I open Google Homepage$")
	public void i_open_Google_Homepage() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		googleHomepage.openGoogleURL();
	}

	@Then("^I verify that the page displays search text box$")
	public void i_verify_that_the_page_displays_search_text_box() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		googleHomepage.checkSearchBoxIsDisplayed();
	}

	@Then("^the page displays Google Search button$")
	public void the_page_displays_Google_Search_button() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		googleHomepage.checkGoogleSearchButtonIsDisplayed();
	}

	@Then("^the page displays Im Feeling Lucky button$")
	public void the_page_displays_Im_Feeling_Lucky_button() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		googleHomepage.checkImFeelingLuckyButtonIsDisplayed();
	}	
	
}
