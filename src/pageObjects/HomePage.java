package pageObjects;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utility.Log;

public class HomePage {
private static WebElement element = null;
public static WebDriver driver;

public static WebElement lnk_admin(WebDriver driver){
	element = driver.findElement(By.id("btnAdmin"));
	Log.info("Admin element is found");
	return element;
	
}




/*public static WebElement lnk_LogOut(WebDriver driver){	 
    element = driver.findElement(By.linkText("LOGOUT")); 
    Log.info("Logout element is found");
 return element;
 
    }*/
}
