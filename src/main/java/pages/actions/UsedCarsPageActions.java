package pages.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import pages.locators.UsedCarsPageLocators;
import utils.SeleniumDriver;

public class UsedCarsPageActions {

	UsedCarsPageLocators usedcarspagelocators = null;
	
	public UsedCarsPageActions() {
		this.usedcarspagelocators = new UsedCarsPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), usedcarspagelocators);
	}
	
	public void Verify_Kia_Link_exists() {

    	WebDriver driver=SeleniumDriver.getDriver();
       	if(driver.findElement(By.xpath("//a[contains(text(),'Kia')]"))!= null){
    		
    		System.out.println("Element is Present");
    		}else{
    		System.out.println("Element is Absent");
    		}
			
		}
	}

