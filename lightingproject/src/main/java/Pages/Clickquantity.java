package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Constant1.Baseclass;

public class Clickquantity extends Baseclass {

	@FindBy(xpath = "//span[contains(@class,'qty-increment-decrement qty-increment')]")
	WebElement Click;
	
	public Clickquantity() {
		
		PageFactory.initElements(driver, this);
	}
	
	public void Verifyquantity1() {
		
		// JavascriptExecutor jse2 = (JavascriptExecutor)driver;
	        //jse2.executeScript("arguments[0].click()",Click );

		Click.click();
	}
	
	
	
}
