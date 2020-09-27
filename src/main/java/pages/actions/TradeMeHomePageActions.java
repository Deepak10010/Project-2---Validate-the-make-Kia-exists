package pages.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import pages.locators.TradeMeHomePageLocators;
import utils.SeleniumDriver;

public class TradeMeHomePageActions {
	
	TradeMeHomePageLocators trademehomepagelocators = null;

	public TradeMeHomePageActions() {
		this.trademehomepagelocators = new TradeMeHomePageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), trademehomepagelocators);
	}
	
	public void ClickOnMotorsLink() {
		trademehomepagelocators.MotorsLink.click();
	}
}
