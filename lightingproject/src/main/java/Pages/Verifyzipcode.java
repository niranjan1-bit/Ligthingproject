package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Constant1.Baseclass;

public class Verifyzipcode extends Baseclass {
	@FindBy(name = "dwfrm_cart_couponCode")
	WebElement Cuponcode;
	@FindBy(xpath = "//span[contains(.,'Apply')]")
	WebElement Apply;
	@FindBy(xpath = "//input[@class='taxCalc']")
	WebElement Zipcode;
	@FindBy(xpath = "//input[@class='taxCalcBtn']")
	WebElement Go;
	
	public Verifyzipcode() {
		PageFactory.initElements(driver, this);
	}
	public void Code() {
		Cuponcode.sendKeys(prop.getProperty("PromeCode"));
		Apply.click();
		Zipcode.sendKeys(prop.getProperty("code"));
		 JavascriptExecutor jse2 = (JavascriptExecutor)driver;
	        jse2.executeScript("arguments[0].click()",Go );
		//Go.click();
		
		
		
		
		
	}
	
	
	

}
