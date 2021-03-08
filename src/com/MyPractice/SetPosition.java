package com.MyPractice;

import org.openqa.selenium.Dimension; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SetPosition {

	public static void main(String[] args) throws Exception {
		
		
		System.setProperty("webdriver.gecko.driver", "F:\\Training\\Tools\\geckodriver.exe");
		
		
		WebDriver driver=new FirefoxDriver(); 
		driver.get("https://selenium.dev/downloads"); 
		
		Dimension size = driver.manage().window().getSize();
		
		int height = size.height; 
		int width =size.width; 
		int height1 = size.getHeight(); 
		int width2 = size.getWidth(); 
		
		System.out.println("The height of the window by height variable : "+ height);		
		System.out.println("The height of the window by height1 variable : "+ height1); 
		System.out.println("by methods"); 
		System.out.println("The width of the window by getWidth() variable : "+ width); 
		System.out.println("The width of the window by getWidth() variable : "+ width2); 
	
		
		

	}

}
