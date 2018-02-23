package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.Log;

public class LogIn_Page {
	 private static WebElement element = null;
	 
	    public static WebElement txtbx_UserName(WebDriver driver){	 
	         element = driver.findElement(By.id("UserName"));	
	         Log.info("Username element is found");
	         return element;	 
	         }
	 
	     public static WebElement txtbx_Password(WebDriver driver){	 
	         element = driver.findElement(By.id("Password"));	
	         Log.info("Password element is found");
	         return element;	 
	         }
	 
	     public static WebElement btn_LogIn(WebDriver driver){	 
	         element = driver.findElement(By.id("btnLogin"));
	         Log.info("Login element is found");
	         return element;	 
	         }
}
