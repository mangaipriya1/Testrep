package appModule;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import utility.Log;

public class Home_Action {
	//public static WebDriver driver;
	

	public static void Txt_home(WebDriver driver) {
		try{
			
			String WelcomeMessage = driver.findElement(By.cssSelector(".welcome span")).getText();
			System.out.println(WelcomeMessage);
			String[] parts = WelcomeMessage.split(" ");
			String part1 = parts[0];
			String part2 = parts[1];
			System.out.println(part1);
			System.out.println(part2);
			//String part3 = parts[2];
			String actual = part1+part2;
			String expected = "AdministratorAdministrator";
			Assert.assertEquals(actual, expected);
			Log.info("@@@@@@Username verified@@@@@@");
			}catch(Exception e){
				e.printStackTrace();
			}
		
	}
}