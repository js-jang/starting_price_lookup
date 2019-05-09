package selenium_post_setup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

public class Demo1
{
	WebDriver driver;
	JavascriptExecutor jse;
	
	public void invokeBrowser()
	{
		try {
			//Mandatory Lines Begin
			System.setProperty("webdriver.chrome.driver", "C:\\SeleniumRelatedFiles\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			
			//bait synchronization - allows code to synchronize with browser (wait for page to load)
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);  //upper limit = 30 sec
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			//Mandatory Lines End
			
			driver.get("https://www.bell.ca/Mobility/Smartphones_and_mobile_internet_devices");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void searchItem()
	{
		
	}
	public static void main(String[] args)
	{
		Demo1 myObj = new Demo1();
		myObj.invokeBrowser();		
	}

}
