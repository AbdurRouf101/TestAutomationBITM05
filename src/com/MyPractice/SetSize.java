package com.MyPractice;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SetSize {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "F:\\Training\\Tools\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver(); 
		driver.get("https://selenium.dev"); 
		
		// below line sets the size of the browser 
		driver.manage().window().setSize(new Dimension(400, 200));
		
		
		Thread.sleep(2000);
		
		driver.quit();
		

	}

}
