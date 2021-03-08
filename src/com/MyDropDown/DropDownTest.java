package com.MyDropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.Base.BaseClass;



public class DropDownTest extends BaseClass {

	public static void main(String[] args)   {
		launchChrome();
		baseURL();
		selectDropDownOption();
		
		// my code to see the drop down item. Need to include "throws InterruptedException" in main method
		// Thread.sleep(3000);
		
		closeBrowser();
	}
	
	public static void baseURL() {
		driver.get("https://the-internet.herokuapp.com/dropdown");
	}

	/*
	 * Methods
	 *  1. selectByValue()
        2. selectByVisibleText()
        3. selectByIndex()
	 */

	public static void selectDropDownOption() {
		WebElement dropDown=driver.findElement(By.xpath("//*[@id=\"dropdown\"]")); 

		Select dropDownOpt=new Select(dropDown);

		//  Method 1 selectByValue() 
		//	dropDownOpt.selectByValue("1");
		
		//	Method 2 selectByVisibleText()
		//	dropDownOpt.selectByVisibleText("Option 2");

		//	Method 3 selectByIndex()
		dropDownOpt.selectByIndex(1);
		
	}

}
