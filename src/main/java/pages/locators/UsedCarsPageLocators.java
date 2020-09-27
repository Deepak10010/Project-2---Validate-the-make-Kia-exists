package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class UsedCarsPageLocators {

	@FindBy(how=How.XPATH, using = "//a[contains(text(),'Kia')]")
	public WebElement kia_Link;
}
