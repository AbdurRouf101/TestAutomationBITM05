package com.MyPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoClass {

	public static void main(String[] args) throws InterruptedException {

		// Browser config
		// WebDriver = Interface
		// driver = reference variable
		
			
		System.setProperty("webdriver.chrome.driver", "F:\\Training\\Tools\\chromedriver.exe");
		
		// Open Real Browser
		WebDriver driver=new ChromeDriver();
		
		// Selenium wait 
		Thread.sleep(5000);
		
		
		// Close Browser
		driver.close();
		
		
		
			
			

	}

}
