/**
 * 
 */
package com.qa.test;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import com.qa.utility.dataFileReader;
import io.github.bonigarcia.wdm.WebDriverManager;


/**
 * @author Shamsur.Masum
 *
 */
public class testBase {
	
	public static WebDriver driver;
	public static dataFileReader DataReader;
	String appURL= "http://computer-database.herokuapp.com/computers";
	
	@BeforeSuite 
	public void testSetUp() {
		
   	    DataReader= new dataFileReader();
   	    
   		if (DataReader.getBrowserSelected().contains("chrome")){
   			WebDriverManager.chromedriver().setup();
   			driver = new ChromeDriver();
   		}
   		else if (DataReader.getBrowserSelected().contains("firefox")){
   			WebDriverManager.firefoxdriver().setup();
   			driver = new FirefoxDriver();
   	    }
   		else{
   			WebDriverManager.iedriver().setup();
   			driver = new InternetExplorerDriver();
   		}

	}
	
	
	 @BeforeTest
	 public void urlLoad() {               //launches the browser and load URL 
		driver.get(DataReader.getAppUrl());
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String title= driver.getTitle();
		System.out.println("page title- "+title);
		Assert.assertEquals(driver.getTitle(), title);
     }
	 
	 @AfterSuite                  //Test cleanup
	 public void TeardownTest()
	    {
	       driver.quit();
	    }
	 

}
