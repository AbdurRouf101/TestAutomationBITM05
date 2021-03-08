package com.MyPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverCloseQuitDifference {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "F:\\Training\\Tools\\chromedriver.exe");
		
		// Open Real Browser
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.gmail.com");
		
		// driver.get("https://google.com");
		
		// driver.get("https://www.google.com/intl/bn/gmail/about/#");
		
		
		driver.findElement(By.xpath("//*[@id=\"initialView\"]/footer/ul/li[1]/a")).click();
		
		
		
		
		// Selenium wait 
		Thread.sleep(5000);
		
		
		// Close Browser
		//driver.quit();
		
		// devdvqa.com   for code
		
	}

}
