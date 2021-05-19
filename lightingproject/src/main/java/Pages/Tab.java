package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Constant1.Baseclass;
import Utilities.Waittime;
/****************************************************************************
 * '* NAME : SelectselinglightsTab '* APPLICATION NAME : ylighting '* CREATED BY :
 * Niranjan Avula '* CREATED DATE : 17-05-2021 '* PARAMETERS : NA '
 ***************************************************************************/

public class Tab extends Baseclass{
	
	// WebElment Locators
	
	@FindBy(xpath = "//span[contains(@title,'ceiling')]") WebElement CEILING;
	@FindBy(xpath = "//a[contains(.,'All Chandeliers')]") WebElement AllChandeliers;
	@FindBy(xpath = "//img[contains(@alt,'Chandeliers Globe Chandeliers')]") WebElement  Globechandeliers;
	
	@FindBy(xpath = "//select[@id='grid-sort-header']") WebElement Bestseller;
	@FindBy(xpath = "//img[contains(@title,'Harmony Chandelier')]") WebElement Three;
	
	@FindBy(xpath = "(//button[@id='add-to-cart'])[1]") WebElement Addcart;
	
	// Constructor
	
	public Tab () {
		PageFactory.initElements(driver, this);
	}
	
	
	public  void Addproduct() {
		
Waittime.waitperiod();
		
/*By loadingImage = By.id("CELING");

		WebDriverWait wait = new WebDriverWait(driver, 5000);*/
		
		Actions actions = new Actions(driver);
		
		 actions.moveToElement(CEILING).click().perform();
		 System.out.println("Done Mouse hover on 'CEILING' from Menu");
		
		AllChandeliers.click();
		 JavascriptExecutor jse2 = (JavascriptExecutor)driver;
	        jse2.executeScript("arguments[0].click()",Globechandeliers );
		//Globechandeliers.click();
		
		Select dropdown= new Select(Bestseller);
		 dropdown.selectByIndex(3);
		
		
		Three.click();
		
		
		Addcart.click();
		
	}
	
}
	
	
	
	


