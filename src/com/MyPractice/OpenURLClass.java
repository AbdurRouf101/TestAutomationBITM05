package com.MyPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenURLClass {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Training\\Tools\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.peoplentech.com.bd");
		
		
		driver.manage().window().minimize();
		
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		driver.close();
		
		

	}

}
