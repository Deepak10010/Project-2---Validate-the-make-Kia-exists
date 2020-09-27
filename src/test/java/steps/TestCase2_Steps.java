package steps;

import org.testng.Assert;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.actions.CarBrowsePageActions;
import pages.actions.TradeMeHomePageActions;
import pages.actions.UsedCarsPageActions;
import utils.SeleniumDriver;

public class TestCase2_Steps {
	CarBrowsePageActions carbrowsepageactions = new CarBrowsePageActions();
	TradeMeHomePageActions trademehomepageactions = new TradeMeHomePageActions();
	UsedCarsPageActions usedcarspageactions = new UsedCarsPageActions();
	
	
	@Given("^I am on the Home Page \"([^\"]*)\"  of TradeMe website$")
	public void i_am_on_the_Home_Page_of_TradeMe_website(String websiteURL) throws Throwable {
		SeleniumDriver.openPage(websiteURL);
	}

	@When("^I move to Motors tab$")
	public void i_move_to_Motors_tab(DataTable arg1) throws Throwable {
	  
	}

	@When("^click on \"([^\"]*)\" tab$")
	public void click_on_tab(String arg1) throws Throwable {
		System.out.println("Move  to 'Motors' tab and click it");
		trademehomepageactions.ClickOnMotorsLink();
	}

	@When("^The Page Title should be \"([^\"]*)\"$")
	public void the_Page_Title_should_be(String expectedTitle) throws Throwable {
		String actual_title = SeleniumDriver.getDriver().getTitle();
	    Assert.assertEquals(actual_title,expectedTitle);
	}

	@When("^click on \"([^\"]*)\" link$")
	public void click_on_link(String arg1) throws Throwable {
		System.out.println("Click on Used Cars link");
		carbrowsepageactions.ClickOnUsedCarsLink();
	}

	@Then("^I should see that the make \"([^\"]*)\" exists$")
	public void i_should_see_that_the_make_exists(String arg1) throws Throwable {
		System.out.println("Checking whether the make 'Kia' exists or not");
		usedcarspageactions.Verify_Kia_Link_exists();
	}

}
