package com.pack1.test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test
{
	public static void main(String[] args) 
	{
		// Set the property for Browser Driver
		System.setProperty("webdriver.chrome.driver", "D:\\Automation_batch\\Java_program\\Selenium_QLC_2301\\Library\\chromedriver.exe");
		
		// Open Empty Browser
		WebDriver driver = new ChromeDriver();
		
		// Passing the URl to Empty Browser
		driver.get("https://www.jdwilliams.co.uk/");
		
		// Identify the Web Element Or Component
		WebElement serachTxtBoxWebElem = driver.findElement(By.id("searchKeyWords2"));
	
		// Perform the action on the WebElement
		serachTxtBoxWebElem.sendKeys("Jeans");
		
		// Close The browser
		//driver.close();
	}
}
