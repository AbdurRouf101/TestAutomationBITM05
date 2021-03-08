package com.MyPractice;





import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetSize {

	public static void main(String[] args)  throws Exception {
		
		System.setProperty("webdriver.gecko.driver", "F:\\Training\\Tools\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver(); 
		driver.get("https://www.google.com"); 
		int height = driver.manage().window().getSize().height; 
		int width =driver.manage().window().getSize().width; 
		int height1 = driver.manage().window().getSize().getHeight(); 
		int width2 = driver.manage().window().getSize().getWidth(); 
		System.out.println("The height of the window by height variable : "+height); 
		System.out.println("The height of the window by width variable : "+height1); 
		System.out.println("by methods"); 
		System.out.println("The height of the window by getHeight() variable : "+width); 
		System.out.println("The height of the window by getWidth() variable : "+width2); 
		}
		

	}


