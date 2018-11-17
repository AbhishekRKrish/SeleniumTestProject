package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import utility.ConfigReader;

public class TestBase {
	ConfigReader config;
	
	@BeforeSuite
	public void initialize() throws IOException {
		config = new ConfigReader();
		System.setProperty("webdriver.chrome.driver", config.getchromePath());
		System.out.println("--------Setup is ready------");
	}
	
	@Test
	public void start() {
		
		System.out.println("start");
	}

}
