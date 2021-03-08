package com.MyBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoClass {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
	
		// Browser config
		// WebDriver = Interface
		// driver = reference variable
		
		
		// Chrome Browser
		System.setProperty("webdriver.chrome.driver", "F:\\Training\\Tools\\chromedriver.exe");		
		// Open Real Browser 
		driver=new ChromeDriver();
		
		
		// Firefox Browser
		System.setProperty("webdriver.gecko.driver", "F:\\Training\\Tools\\geckodriver.exe");
		// Open Real Browser
		driver=new FirefoxDriver();
		
		// driver.get("http://www.google.com");
		
		// Selenium wait
		Thread.sleep(5000);
		
		driver.close();
		//driver.quit();
		

	}

}
