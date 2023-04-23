package com.pack4.HAM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class Test2 
{
	@Test
	public void launchJdw()
	{
		System.setProperty("webdriver.ie.driver", "D:\\Automation_batch\\Java_program\\Selenium_QLC_2301\\Library\\ie.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("https://www.jdwilliams.co.uk/");
	}
}
