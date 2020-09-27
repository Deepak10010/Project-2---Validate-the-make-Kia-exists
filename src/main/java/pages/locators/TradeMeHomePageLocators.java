package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TradeMeHomePageLocators {

	@FindBy(how=How.XPATH, using = "//a[@id='SearchTabs1_MotorsLink']")
	public WebElement MotorsLink;
}
