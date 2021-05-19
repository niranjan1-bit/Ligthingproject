package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Constant1.Baseclass;
import Utilities.Waittime;

/****************************************************************************
 * '* NAME : Createaccount '* APPLICATION NAME : ylighting '* CREATED BY :
 * Niranjan Avula '* CREATED DATE : 14-05-2021 '* PARAMETERS : NA '
 ***************************************************************************/

public class Createaccount extends Baseclass {

	// WebElment Locators

	@FindBy(xpath = "//div[@class='btn-group dropdown-group']")
	WebElement Account;
	@FindBy(xpath = "//a[@id='my_account_hdr_link']")
	WebElement Myaccount;
	@FindBy(xpath = "//input[@id='dwfrm_profile_customer_firstname']")
	WebElement Firstname;
	@FindBy(xpath = "//input[@id='dwfrm_profile_customer_lastname']")
	WebElement Lastname;
	@FindBy(xpath = "//input[@id='dwfrm_profile_customer_email']")
	WebElement Email;
	@FindBy(xpath = "//input[@id='dwfrm_profile_customer_emailconfirm']")
	WebElement Confirmemail;
	@FindBy(xpath = "//input[@id='dwfrm_profile_login_password']")
	WebElement Password;
	@FindBy(xpath = "//input[@id='dwfrm_profile_login_passwordconfirm']")
	WebElement Confirmpassword;
	@FindBy(xpath = "//span[text()='Create Account']")
	WebElement Create;

	// Constructor

	public Createaccount() {
		PageFactory.initElements(driver, this);
	}

	public void Account() throws InterruptedException {
		Account.click();
		Waittime.waitperiod();
		Myaccount.click();
		Waittime.waitperiod();

		// Reading input data from property file
		Firstname.sendKeys(prop.getProperty("Firstname"));
		Lastname.sendKeys(prop.getProperty("Lastname"));
		Email.sendKeys(prop.getProperty("Emailaddress"));
		logger.info("Email has entered");
		Confirmemail.sendKeys(prop.getProperty("Confirmemailaddress"));
		Password.sendKeys(prop.getProperty("Password"));
		logger.info("Pasword has entered");

		Confirmpassword.sendKeys(prop.getProperty("Confirmpassword"));
		Waittime.waitperiod();
		By loadingImage = By.id("Create Account");

		WebDriverWait wait = new WebDriverWait(driver, 5000);

		wait.until(ExpectedConditions.invisibilityOfElementLocated(loadingImage));
		Create.click();
logger.info("Account is created");
	}

}
