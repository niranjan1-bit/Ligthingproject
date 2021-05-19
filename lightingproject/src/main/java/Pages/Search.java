package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Constant1.Baseclass;

public class Search extends Baseclass {
	
	@FindBy(xpath = "//input[@id='searchinput']")
    WebElement Search;
   
    @FindBy(xpath = "//button[@id='simplesearchbtn']")
    WebElement Searchbtn;
    public Search() {
    	PageFactory.initElements(driver, this);
    }

    public void searchitem() {
    	
    JavascriptExecutor jse = (JavascriptExecutor)driver;
    jse.executeScript("arguments[0].click()", Search);   
    Search.sendKeys("Fans");       

     
    JavascriptExecutor jse1 = (JavascriptExecutor)driver;
    jse1.executeScript("arguments[0].click()", Searchbtn);
}
    
}
