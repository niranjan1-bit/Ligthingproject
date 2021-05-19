package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Constant1.Baseclass;
import Utilities.Waittime;

/****************************************************************************
 * '* NAME : Login '* APPLICATION NAME : ylighting '* CREATED BY :
 * Niranjan Avula '* CREATED DATE : 17-05-2021 '* PARAMETERS : NA '
 ***************************************************************************/

public class Login extends Baseclass {
	// WebElment Locators
	
	@FindBy(xpath = "//div[@class='btn-group dropdown-group']")
	WebElement Account;
	@FindBy(xpath = "(//a[@class='userlogin'])[1]")
	WebElement Login;
	@FindBy(xpath = "//input[@id='dwfrm_login_username']")
	WebElement Username;
	@FindBy(xpath = "//input[@id='dwfrm_login_password']")
	WebElement Password;

	@FindBy(xpath = "//span[contains(.,'Sign In')]")
	WebElement SignIn;
	
	// Constructor

	public Login() {
		PageFactory.initElements(driver, this);
	}

	public void Clicklogin() throws InterruptedException {

		Account.click();
		Waittime.waitperiod();
		Login.click();
		Waittime.waitperiod();
		
		By loadingImage = By.id("Username");

		WebDriverWait wait = new WebDriverWait(driver, 3000);

		wait.until(ExpectedConditions.invisibilityOfElementLocated(loadingImage));

		Username.sendKeys(prop.getProperty("Emailaddress"));

		Password.clear();
		Password.sendKeys(prop.getProperty("Password"));
		Waittime.waitperiod();
		try {
			WebElement button = driver.findElement(By.xpath("//span[contains(.,'Sign In')]"));
			button.click();
		} catch (org.openqa.selenium.StaleElementReferenceException ex) {
			WebElement button = driver.findElement(By.xpath("//span[contains(.,'Sign In')]"));
			button.click();
		}

		SignIn.click();

	}

}
