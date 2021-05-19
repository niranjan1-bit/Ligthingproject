package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Constant1.Baseclass;

public class Removeproduct extends Baseclass {
	
	
    @FindBy(xpath = "//button[@value='Remove']")
    WebElement Remove;

	  public Removeproduct() {
		  PageFactory.initElements(driver, this);
	  }
public void removecart() throws InterruptedException {
	
	 
	        Thread.sleep(3000);
	        JavascriptExecutor jse = (JavascriptExecutor)driver;
	        jse.executeScript("arguments[0].click()", Remove);
	        //Remove.click();
	    }
}
	  
	  
	  
	  

