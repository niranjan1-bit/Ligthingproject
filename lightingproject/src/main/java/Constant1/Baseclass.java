package Constant1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Utilities.Waittime;
import freemarker.log.Logger;

public class Baseclass {
	
	public static WebDriver driver;
    public static Properties prop;
    public static Logger logger;
    //static PopupWindow popup;
    
    public Baseclass() {
         //Reading property file
            prop = new Properties();
            FileInputStream file;
            try {
                file = new FileInputStream("C:\\Users\\NIRANJAN AVULA\\Niranjan-Workspace\\lightingproject\\src\\main\\java\\Config\\Config.propertiesfile1");
                prop.load(file);
            
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
    }
    
    public static void initialization() throws InterruptedException {
        //Launching chrome driver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\NIRANJAN AVULA\\Desktop\\New folder\\chromedriver_win32 (2)\\chromedriver.exe" );
        driver = new ChromeDriver();
    
    
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        logger = Logger.getLogger("YLighting");
        PropertyConfigurator.configure("Log4j.properties");
        
        driver.get(prop.getProperty("url"));
         Waittime.waitperiod();
         try {
             Thread.sleep(10000);
             } catch (InterruptedException e) {
            
             e.printStackTrace();
             }
             driver.findElement(By.xpath("//a[@class='ltkpopup-close']")).click();
             try {
             Thread.sleep(10000);
             } catch (InterruptedException e) {
            
             e.printStackTrace();
            
       
    }
    
}

}
        

 