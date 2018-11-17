package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginTest {
	
	
	WebDriver driver;
		
		public LoginTest(WebDriver driver) {
			// TODO Auto-generated constructor stub
			this.driver=driver;
			PageFactory.initElements(driver, this);
		
		}
		
		
	 @FindBy(xpath="//span[contains(text(),'Hello. Sign in')]")
	 WebElement signinhover;
	 
	 @FindBy(xpath="//*[@id='nav-flyout-ya-signin']/a/span")
	 WebElement signinClick;
		
	  @FindBy(id="ap_email")
	  WebElement email; 
	  
	  @FindBy(id="continue")
	  WebElement continueclick; 
	  
	  @FindBy(id="ap_password")
	  WebElement password; 
	
	  @FindBy(id="signInSubmit")
	  WebElement login; 
	
	  
	  
	  public WebElement signinhover() {
		  return signinhover;
	  }
	  
	  public WebElement signinClick() {
		  return signinClick;
	  }
	  
	  public WebElement emailSearch()
	    {
	    	return email;
	    }
	  
	  public WebElement continueClick()
	    {
	    	return continueclick;
	    }
	  
	  
	  public WebElement passwordEnter()
	    {
	    	return password;
	    }
	  
	  public WebElement submitLogin()
	    {
	    	return login;
	    }
	  
	  
	  
}
	


