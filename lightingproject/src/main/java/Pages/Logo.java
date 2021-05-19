package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import Constant1.Baseclass;

public class Logo extends Baseclass {
	
	public Logo() {
		PageFactory.initElements(driver, this);
	}
public void Checklogo() {
	  boolean logoPresent = driver.findElement(By.xpath("//header/div[2]/div[2]/a[1]")).isDisplayed();
      System.out.println(logoPresent);
}
}
