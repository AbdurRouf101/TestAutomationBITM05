package com.MyPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFirefox {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "F:\\Training\\Tools\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.peoplentech.com.bd");
		
		
		driver.manage().window().minimize();
		
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		// driver.manage().window().fullscreen();
		
		
		Thread.sleep(5000);
		
		driver.quit();
		
	}

}
