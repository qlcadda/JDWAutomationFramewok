package com.pack4.HAM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test1 
{
	@Test
	public void launchFacebook()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Automation_batch\\Java_program\\Selenium_QLC_2301\\Library\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
}
