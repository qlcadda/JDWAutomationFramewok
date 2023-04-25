package com.pack.pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver
{
	public static WebDriver driver;
	
	public static WebDriver getDriver(String browserName)
	{
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asus\\eclipse-workspace\\Selenium\\server\\chromedriver.exe");
			driver= new ChromeDriver();
		}
		return driver;
	}
}
