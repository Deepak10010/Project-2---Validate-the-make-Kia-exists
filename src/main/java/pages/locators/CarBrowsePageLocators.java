package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CarBrowsePageLocators {

	@FindBy(how=How.XPATH, using = "//ul[@class='motors-landing-list']//a[contains(text(),'Used cars')]")
	public WebElement UsedCarsLink;
}
