package pageObjects;

import java.util.concurrent.TimeUnit;

import org.apache.bcel.generic.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utility.Constant;
import utility.Log;

public class PlaceOrder_Page {
	
	private static WebElement element = null;
	

	public static WebElement lnk_Orderentry(WebDriver driver){	 
		element = driver.findElement(By.xpath(".//*[@id='liOrderEntry']/a"));	
		Log.info("Order entry element is found");
		return element;	 
	}

	public static WebElement lnk_PlaceOrder(WebDriver driver){	 
		element = driver.findElement(By.xpath(".//*[@id='liSearchCustomer']/a"));	
		Log.info("Place Order element is found");
		return element;	 

	}

	public static WebElement btn_AddNew(WebDriver driver){	 
		element = driver.findElement(By.id("imgAddNew"));	
		Log.info("Add New element is found");
		return element;	 
	}

	public static WebElement  txt_Sold_To_ID(WebDriver driver){
		element = driver.findElement(By.xpath(".//*[@id='CustomerNumber']"));
		Log.info("Sold to id element is found");
		return element;

	}

	public static WebElement  txt_Sold_To_Name(WebDriver driver){
		element = driver.findElement(By.xpath(".//*[@id='CustomerName']"));
		Log.info("Sold to name element is found");
		return element;

	}

	public static WebElement  dwn_sales_Person_Name(WebDriver driver){
		element = driver.findElement(By.xpath(".//*[@id='ddlSalesPerson']"));
		org.openqa.selenium.support.ui.Select oselect = new org.openqa.selenium.support.ui.Select(element);
		oselect.selectByIndex(2);	
		Log.info("Sales person element is found");
		return element;		
	}

	public static WebElement  btn_Update(WebDriver driver){
		element = driver.findElement(By.xpath(".//*[@id='btnUpdate']"));
		Log.info("Update element is found");
		return element;

	}

	public static WebElement  Alert(WebDriver driver) {
		try{
			//WebDriverWait wait = new WebDriverWait(driver, 30);
			//wait.until(ExpectedConditions.alertIsPresent());			
			//org.openqa.selenium.Alert alert = driver.switchTo().alert();
			Thread.sleep(2000);
			//alert.accept();;
			element = driver.findElement(By.xpath(".//*[@id='message']/div/div[3]/span"));
			return element;			
		}catch(Exception e){
			e.printStackTrace();
		}
		return element;
	}

	public static WebElement  btn_Continue_Order(WebDriver driver) throws InterruptedException{
		element = driver.findElement(By.cssSelector("#btnContinue"));
		Thread.sleep(3000);
		Log.info("continue button clicked");
		return element;

	}


	public static WebElement dwn_Service_Type(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.cssSelector("#ddlServicesType"));
		Thread.sleep(1000);
		org.openqa.selenium.support.ui.Select oselect = new org.openqa.selenium.support.ui.Select(element);
		oselect.selectByValue("1");
		Log.info("Service type chosen");
		return element;	 
	}

	public static WebElement dwn_Service(WebDriver driver) throws InterruptedException{	 
		element = driver.findElement(By.cssSelector("#ddlServices"));
		Thread.sleep(1000);
		org.openqa.selenium.support.ui.Select oselect = new org.openqa.selenium.support.ui.Select(element);
		oselect.selectByValue("1");
		Log.info("Service chosen");
		return element;	 
	}

	public static WebElement dwn_Drop_Off_Location(WebDriver driver) throws InterruptedException{	 
		element = driver.findElement(By.cssSelector("#ddlLocation"));
		Thread.sleep(1000);
		org.openqa.selenium.support.ui.Select oselect = new org.openqa.selenium.support.ui.Select(element);
		oselect.selectByValue("1");
		Log.info("Add location chosen");
		return element;	 
	}

	public static WebElement  btn_Add_Detail(WebDriver driver){
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		element = driver.findElement(By.cssSelector("#btnAddDetails"));
		Log.info("Add detail button clicked");
		return element;
	}

	public static WebElement  txt_Rug_Size(WebDriver driver){
		driver.findElement(By.cssSelector("#txtRugSize1")).sendKeys("2");;
		driver.findElement(By.cssSelector("#txtRugSize2")).sendKeys("3");
		driver.findElement(By.cssSelector("#txtRugSize3")).sendKeys("4");
		driver.findElement(By.cssSelector("#txtRugSize4")).sendKeys("5");
		Log.info("rug size values passed");
		return element;
	}

	/*public static WebElement txt_Bar_Code(WebDriver driver) {
		element = driver.findElement(By.cssSelector("#txtBarCode"));
		Log.info("barcode element found");
		return element;
	}*/

	public static WebElement  btn_Save_Goback(WebDriver driver) throws InterruptedException{
		Thread.sleep(1000);
		element = driver.findElement(By.id("btnSaveDetailsGoBack"));
		Log.info("Save and go back button clicked");
		return element;

	}

	/*WebDriverWait wait = new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.alertIsPresent());
			System.out.println("hello");

			Thread.sleep(2000);
			((JavascriptExecutor) driver).executeScript("arguments[0].click()", element);

			org.openqa.selenium.Alert simpleAlert = driver.switchTo().alert();
			//Alert simpleAlert = driver.switchTo().alert();
			String alertText = simpleAlert.getText();
			System.out.println("Alert text is " + alertText);
			simpleAlert.accept();*/


	public static WebElement alert(WebDriver driver) throws InterruptedException{
		Thread.sleep(1000);
			element = driver.findElement(By.cssSelector(".dialog-btn-confirm"));
			
		Log.info("confirm button element found");
		return element;
	}


	public static WebElement btn_Submit(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.cssSelector("#btnPlaceOrder"));
		Log.info("place order element found");
		return element;
	}
	
	public static WebElement btn_PayNow(WebDriver driver) throws InterruptedException{
		Thread.sleep(1000);
		element = driver.findElement(By.cssSelector("#btnPayNow"));
		Log.info("Paynow button found");
		return element;
		
	}
	
	public static WebElement txt_Cash_Amount(WebDriver driver) throws InterruptedException{
		Thread.sleep(2000);
		element = driver.findElement(By.cssSelector("#CashAmount"));
		Log.info("cash amount button found");
		return element;
		
	}
	
	/*public static WebElement btn_Accept_cash(WebDriver driver) throws InterruptedException{
		//Thread.sleep(2000);
		//WebElement element = driver.findElement(By.id("btnSubmit"));
		//Log.info("javascript");
		//((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		Thread.sleep(3000);
     //element = driver.findElement(By.id("btnSubmit"));
		element = driver.findElement(By.id("btnAccept"));
		Log.info("Accept cash button found");
		Thread.sleep(2000);
		//element = driver.findElement(By.id("btnSubmit"));
		return element;
	
	}*/
	
	


	public static WebElement btn_Accept_cash(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
	     //element = driver.findElement(By.id("btnSubmit"));
			element = driver.findElement(By.id("btnAccept"));
			Log.info("Accept cash button found");
			Thread.sleep(2000);
			//element = driver.findElement(By.id("btnSubmit"));
			return element;
	
	}
	
	public static WebElement btn_Submit_cash(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
	     element = driver.findElement(By.id("btnSubmit"));
			
			Log.info("Submit cash button found");
			Thread.sleep(2000);
			//element = driver.findElement(By.id("btnSubmit"));
			
			return element;
	
	}
	
public static WebElement btn_Print(WebDriver driver){
	element = driver.findElement(By.className("dialog-btn-confirm"));
		
		return element;
	}
	

	//*[@id="Paymentmessage"]/div/div[3]/span
}


