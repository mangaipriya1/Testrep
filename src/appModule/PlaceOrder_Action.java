package appModule;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;

import pageObjects.PlaceOrder_Page;
import utility.Log;

public class PlaceOrder_Action {

	public static void Execute(WebDriver driver) throws InterruptedException{
		PlaceOrder_Page.lnk_Orderentry(driver).click();
		Reporter.log("Order entry has been clicked");
		PlaceOrder_Page.lnk_PlaceOrder(driver).click();
		Reporter.log("Place order has been clicked");
		Thread.sleep(3000);
		PlaceOrder_Page.btn_AddNew(driver).click();
		PlaceOrder_Page.txt_Sold_To_ID(driver).sendKeys("1");
		PlaceOrder_Page.txt_Sold_To_Name(driver).click();
		PlaceOrder_Page.dwn_sales_Person_Name(driver).click();
		PlaceOrder_Page.dwn_sales_Person_Name(driver).click();
		PlaceOrder_Page.btn_Update(driver).click();
		PlaceOrder_Page.Alert(driver).click(); 
		PlaceOrder_Page.btn_Continue_Order(driver).click();
		PlaceOrder_Page.dwn_Service_Type(driver).click();
		PlaceOrder_Page.dwn_Service(driver).click();
		PlaceOrder_Page.dwn_Drop_Off_Location(driver).click();
		PlaceOrder_Page.btn_Add_Detail(driver).click();
		PlaceOrder_Page.txt_Rug_Size(driver);
		//PlaceOrder_Page.txt_Bar_Code(driver).sendKeys("1011");
		PlaceOrder_Page.btn_Save_Goback(driver).click();
		PlaceOrder_Page.alert(driver).click();
		PlaceOrder_Page.btn_Submit(driver).click();
		PlaceOrder_Page.alert(driver).click();
		PlaceOrder_Page.btn_PayNow(driver).click();
		PlaceOrder_Page.txt_Cash_Amount(driver).sendKeys("20");
		PlaceOrder_Page.btn_Accept_cash(driver).click();
		Log.info("success");
		PlaceOrder_Page.btn_Submit_cash(driver).click();
		PlaceOrder_Page.alert(driver).click();
		PlaceOrder_Page.btn_Print(driver).click();
		Log.info("Alert ok clicked");
	}
}
