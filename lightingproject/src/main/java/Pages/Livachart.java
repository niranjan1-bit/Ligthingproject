package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Constant1.Baseclass;

public class Livachart extends Baseclass {
	
	
    @FindBy(xpath = "//div[contains(text(),\"Live Chat\")]")
    WebElement LiveChat;
    @FindBy(xpath = "//input[@id='txt_4167837']")
    WebElement LiveChat_Name;
    @FindBy(xpath = "//input[@id='txt_4167838']")
    WebElement LiveChat_Email;
    @FindBy(xpath = "//button[contains(text(),'Submit')]")
    WebElement LiveChat_Submit;

	
	public Livachart() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	public void LiveChart() throws InterruptedException {
		
		Thread.sleep(8000);
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("arguments[0].click()", LiveChat);
        
        WebDriverWait wait = new WebDriverWait(driver,60) ;
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='txt_4167837']")));
        LiveChat_Name.sendKeys("TEST");
        LiveChat_Email.sendKeys("niranjanavula125@gmail.com");
        
        LiveChat_Submit.click();;
        Thread.sleep(8000);
	}
}