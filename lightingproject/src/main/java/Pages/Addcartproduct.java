package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Constant1.Baseclass;
import Utilities.Waittime;

public class Addcartproduct extends Baseclass {
	
	@FindBy(xpath = "//span[contains(@title,'ceiling')]")
	WebElement CEILING;
	@FindBy(xpath = "//a[contains(.,'All Chandeliers')]")
	WebElement AllChandeliers;
	@FindBy(xpath = "//img[contains(@alt,'Chandeliers Globe Chandeliers')]")
	WebElement Globechandeliers;

	@FindBy(xpath = "//select[@id='grid-sort-header']")
	WebElement Bestseller;
	
	@FindBy(xpath = "(//input[contains(@type,'checkbox')])[1]")
	WebElement Business;
	
	@FindBy(xpath = "//img[contains(@title,'Raimond Suspension Light')]")
	WebElement Product;
	@FindBy(xpath = "(//button[@id='add-to-cart'])[1]")
	WebElement Addcart;
	@FindBy(xpath = "(//a[@class='minicart-btn-viewcart'])[2]")
	WebElement Checkout;
	
	public Addcartproduct() {
		PageFactory.initElements(driver, this);
	}
	public void Specificproduct() {

		Waittime.waitperiod();

		/*
		 * By loadingImage = By.id("CELING");
		 * 
		 * WebDriverWait wait = new WebDriverWait(driver, 5000);
		 */

		Actions actions = new Actions(driver);

		actions.moveToElement(CEILING).click().perform();
		System.out.println("Done Mouse hover on 'CEILING' from Menu");

		AllChandeliers.click();
		 JavascriptExecutor jse = (JavascriptExecutor)driver;
	        jse.executeScript("arguments[0].click()",Globechandeliers );
		//Globechandeliers.click();

		Select dropdown = new Select(Bestseller);
		dropdown.selectByIndex(4);
		
		JavascriptExecutor jse1 = (JavascriptExecutor)driver;
        jse1.executeScript("arguments[0].click()",Business );
		//Business.click();
        JavascriptExecutor jse2 = (JavascriptExecutor)driver;
        jse2.executeScript("arguments[0].click()",Product );
		//Product.click();
        JavascriptExecutor jse3 = (JavascriptExecutor)driver;
        jse3.executeScript("arguments[0].click()",Addcart );
		//Addcart.click();
        JavascriptExecutor jse4 = (JavascriptExecutor)driver;
        jse4.executeScript("arguments[0].click()",Checkout );
	//Checkout.cick();
        
	}
	

}
