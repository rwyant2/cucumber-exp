package stepDefinitions;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import seleniumPages.PapaCuke;

import java.util.List;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import org.openqa.selenium.By;

public class StepDefs_OhLookMoreSteps {

	// The selenium code is encapsulated in PapaCuke, all this does is invoke
	// those methods.
	PapaCuke papa = new PapaCuke();
	
	// The method for launching Chrome already exists in another stepdef class
	
	@Given("^i go to the html5 demo page$")
	public void i_go_to_the_html5_demo_page() throws Exception {
		papa.navToDemoPage();
	}

	@When("^i fill in text \"([^\"]*)\"$")
	public void i_fill_in_text(String arg1) throws Exception {
		papa.enterInTextField(arg1);
	}

	@When("^i click submit$")
	public void i_click_submit() throws Exception {
		papa.submit();
	}

	@Then("^the text \"([^\"]*)\" appears magicably through the power of springboot$")
	public void the_text_appears_magicably_through_the_power_of_springboot(String arg1) throws Exception {
		papa.verifyTextField(arg1);
	}

	@Then("^i choose delicious hot dog condiments$")
	public void i_choose_delicious_hot_dog_condiments(DataTable arg1) throws Exception {
		List<Map<String, String>> list = arg1.asMaps(String.class, String.class);
		Iterator<?> i = list.iterator();
		while (i.hasNext()) {
			Map<String, String> entry = (Map<String, String>) i.next();
			papa.makeDropDownSelection(entry.get("topping"));
			papa.validateDropDownSelection(entry.get("result"));
			papa.navToDemoPage();
		}	    
	}
	
}
