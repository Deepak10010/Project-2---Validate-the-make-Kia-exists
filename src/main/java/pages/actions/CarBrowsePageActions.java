package pages.actions;

import org.openqa.selenium.support.PageFactory;

import pages.locators.CarBrowsePageLocators;
import utils.SeleniumDriver;

public class CarBrowsePageActions {
	CarBrowsePageLocators carbrowsepagelocators = null;
	
	public CarBrowsePageActions() {
		this.carbrowsepagelocators = new CarBrowsePageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), carbrowsepagelocators);
	}
	
	public void ClickOnUsedCarsLink() {
		carbrowsepagelocators.UsedCarsLink.click();
	}
}
