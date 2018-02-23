package automationFramework;

import java.util.concurrent.TimeUnit;

import org.apache.commons.collections4.functors.CatchAndRethrowClosure;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.w3c.dom.DOMConfiguration;

import pageObjects.HomePage;
import pageObjects.PlaceOrder_Page;
import appModule.Home_Action;
import appModule.PlaceOrder_Action;
import appModule.signIn_Action;
import utility.Constant;
import utility.ExcelUtils;
import utility.Log;

public class Apache_POI_TC {
	
public static WebDriver driver = null;

@BeforeMethod
public static void init() throws Exception{
	Log.startTestCase("Selenium_Test_001");
		
	ExcelUtils.setExcelFile(Constant.Path_TestData+Constant.File_TestData,"Sheet1");
	Log.info("Excel sheet opened");
	System.setProperty("webdriver.chrome.driver", "D://Mangai//chromedriver_win32//chromedriver.exe");
	driver = new ChromeDriver();
	Log.info("Driver Intiated");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);		 
	driver.get(Constant.URL);
	Log.info("Appliaction Launched");
	
	}

public void waitForElement(long seconds,By locator){
	WebDriverWait wait =new WebDriverWait(driver, seconds);
	wait.until(ExpectedConditions.elementToBeClickable(locator));
}

@Test

	public static void main() throws Exception {
		//DOMConfigurator.configure("log4j.xml");
		 
	try{
     signIn_Action.Execute(driver);
     Home_Action.Txt_home(driver);
    // PlaceOrder_Page.lnk_PlaceOrder(driver);
     PlaceOrder_Action.Execute(driver);
    // System.out.println("Logout successfully");
     //HomePage.lnk_LogOut(driver);
    
     ExcelUtils.setCellData("Pass", 1, 3);
     //driver.close();
    // signIn_Action.Execute(driver);
   //  ExcelUtils.setCellData("Fail", 2, 3);
     Log.endTestCase("Test end");
     
	}catch(Exception e){
		e.printStackTrace();
	}
	}

}
