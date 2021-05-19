package Utilities;

import java.util.concurrent.TimeUnit;

import Constant1.Baseclass;

public class Waittime extends Baseclass {
public static void waitperiod () {
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	
	
}


