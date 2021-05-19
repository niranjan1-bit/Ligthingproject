package Pages;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Constant1.Baseclass;
import Utilities.Waittime;
/****************************************************************************
 * '* NAME : Verifytitle '* APPLICATION NAME : ylighting '* CREATED BY :
 * Niranjan Avula '* CREATED DATE : 17-05-2021 '* PARAMETERS : NA '
 ***************************************************************************/

public class Verifytitle extends Baseclass {
	
	// Constructor
	public Verifytitle() {
		
		PageFactory.initElements(driver, this);
	}
		
		public void titlechecking() {
			Waittime.waitperiod();
		String actual = driver.getTitle();
		//Reporter.log(actual);
		System.out.println(actual);
		
		String expected= prop.getProperty("Actualtitel");
		//Reporter.log(expected);
		

		Assert.assertEquals(actual, expected,"Title matched");
		}

	}