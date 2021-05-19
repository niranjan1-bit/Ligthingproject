package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;

import Constant1.Baseclass;
import Utilities.Waittime;

public class Scrollupdown extends Baseclass {
	
	public Scrollupdown() {
		PageFactory.initElements(driver, this);
	}

	public void pagedown() {
	
		 /* JavascriptExecutor jse = (JavascriptExecutor)driver;
	        jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");*/
	    
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	// This  will scroll down the page by  1000 pixel vertical		
    js.executeScript("window.scrollBy(0,1000)");
    Waittime.waitperiod();
    js.executeScript("window.scrollBy(0,-1000)");
}

}