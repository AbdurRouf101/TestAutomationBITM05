package com.MyPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "F:\\Training\\Tools\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver(); 
		driver.get("https://abc.com"); 
		
		
		driver.findElement(By.xpath("html/body/div[1]/div/div[1]/main/nav/div[1]/div/div[1]/div[4]/a/div/span")).click();
		
		// using xpath
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/main/footer/section[1]/div[3]/div[1]/a")).click();
		
		// using cssSelector
		// driver.findElement(By.cssSelector("div.footer__group:nth-child(3) > div:nth-child(2) > a:nth-child(1)")).click();
						
		// driver.findElement(By.cssSelector("div.footer__group:nth-child(3) > div:nth-child(3) > a:nth-child(1)")).click();
		
		Thread.sleep(5000); 
		
		
		
		
		Thread.sleep(10000);
		
		// if we use driver.close() below, it only closes the last opened tab only
		// But if we use driver.quit(), it closes both/all the tabs/browsers
		
		driver.quit();
		
		
		
		
		
		
		
		

	}

}
