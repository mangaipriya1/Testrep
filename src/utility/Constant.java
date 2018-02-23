 package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Constant {

	public static final String URL ="http://smsautomation.sgssys.info/";
	public static final String Username = "Administrator";
	public static final String Password ="sales";
	public static final String Path_TestData= "C://Users//mangaipriya//Desktop//";
	public static final String File_TestData="excel.xlsx";
	
	public static final int Col_TestCaseName = 0;	
	 
	public static final int Col_UserName =1 ;

	public static final int Col_Password = 2;

	public static final int Col_Browser = 3;
	
public static WebDriver driver;

public static WebElement getWhenVisible(WebElement webElement, int timeout) {
 
WebElement element = null;
 
WebDriverWait wait = new WebDriverWait(driver, timeout);
 
element = wait.until(ExpectedConditions.elementToBeClickable(webElement));
 
return element;
 
}


}
