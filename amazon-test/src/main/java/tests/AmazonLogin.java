package tests;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utility.ConfigReader;
import utility.DataDriven;
import pages.LoginTest;

public class AmazonLogin  {
	
	ConfigReader config;
	WebDriver driver;
	LoginTest lt;
	
	
	
	@BeforeTest
	public void SetUp() {
	 config = new ConfigReader();
	 System.setProperty("webdriver.chrome.driver", config.getchromePath());
	 System.out.println("--------Setup is ready------");
			
	}

	
	@Test(priority=1)
	public void testConfig() throws IOException, InterruptedException {
		
		driver = new ChromeDriver();
		
		driver.get(config.getApplicationUrl());
        driver.manage().window().maximize();
        
        
       
        
	}
	    @Test(priority=2)
	    public void login() throws IOException {
	    	
	    	driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
	    	
	    	lt = new LoginTest(driver);
	        Actions act = new Actions(driver);
	 
	        act.moveToElement(lt.signinhover()).build().perform();
	        lt.signinClick().click();
	        
	        DataDriven d = new DataDriven();
	        ArrayList<String> data= d.dataReader("Username");  
	        lt.emailSearch().sendKeys(data.get(1));
	        
	        
	      //  System.out.println();
	        
	        lt.continueClick().click();
	        lt.passwordEnter().sendKeys(data.get(1));
	        
	        lt.submitLogin().click();
	        
	        
	        
	    }
	    
	   
	    	
	    	
	    
}
