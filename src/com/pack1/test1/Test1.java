package com.pack1.test1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 1. Open Empty Browser
 2. Pass JDW Url
 3. Enter the Product name in search text box
 4. click on Search button
 5. Select the product from PLP page
 */

public class Test1 
{
	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Automation_batch\\Java_program\\Selenium_QLC_2301\\Library\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.jdwilliams.co.uk/");
		
		try
		{
			WebElement cookieWebElemBtn = driver.findElement(By.xpath("//button[text()='Accept All Cookies']"));
			cookieWebElemBtn.click();
			Thread.sleep(3000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		// Method-2
		List<WebElement> actLstWebElm = driver.findElements(By.xpath("//div[contains(@class,'gui-my-account')]"));
		int len = actLstWebElm.size();
		System.out.println(len);
		if(len>=1)
		{
			System.out.println("We are in home page");
		}
		else
		{
			System.out.println("We are not in home page");
		}
	
		
		
		
		
		
		
		
		
		
		
	}
}
