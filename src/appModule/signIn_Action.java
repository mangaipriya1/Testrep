package appModule;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageObjects.HomePage;
import pageObjects.LogIn_Page;
import pageObjects.PlaceOrder_Page;
import utility.ExcelUtils;
import utility.Log;

public class signIn_Action {
public static WebDriver driver;
	public static void Execute(WebDriver driver) throws Exception{
		/*HomePage.lnk_admin(driver).click();
		LogIn_Page.txtbx_UserName(driver).sendKeys(txtUsername);
		LogIn_Page.txtbx_Password(driver).sendKeys(txtPassword);
		LogIn_Page.btn_LogIn(driver).click();*/
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		String sUserName = ExcelUtils.getCellData(1, 1);
		Log.info("Username picked from excel"+sUserName);
		String sPassword = ExcelUtils.getCellData(1, 2);
		Log.info("Password picked from excel"+sPassword);
		//String sUserName1 = ExcelUtils.getCellData(2, 1);
		//Log.info("Username picked from excel"+sUserName1);
		//String sPassword2 = ExcelUtils.getCellData(2, 2);
		//Log.info("Password picked from excel"+sPassword2);
		HomePage.lnk_admin(driver).click();
		Log.info("Administator link has been clicked");
		LogIn_Page.txtbx_UserName(driver).sendKeys(sUserName);
		Log.info("Username entered in the Username text box");
		LogIn_Page.txtbx_Password(driver).sendKeys(sPassword);
		Log.info("Password entered in the Password text box");
		LogIn_Page.btn_LogIn(driver).click();
		Log.info("Click action performed on Submit button");
		
	}
	
	
}
