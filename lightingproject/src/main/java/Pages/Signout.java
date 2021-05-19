package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Constant1.Baseclass;

public class Signout extends Baseclass {
	
	@FindBy(xpath = "//div[@class='btn-group dropdown-group']")
	WebElement Account;
	@FindBy(xpath = "//a[contains(text(),'Sign Out')]")
    WebElement SignOut;
	
	public Signout() {
		PageFactory.initElements(driver, this);
	}
	
	public void Login1() {
		
		 
		 Actions actions = new Actions(driver);
		 actions.moveToElement(Account).perform();
		 System.out.println("Done Mouse hover on 'Account' from Menu");
		 
		 
	      
	        JavascriptExecutor jse = (JavascriptExecutor)driver;
	        jse.executeScript("arguments[0].click()", SignOut);
	        //SignOut.click();
	       
		
		
	}
	

}
