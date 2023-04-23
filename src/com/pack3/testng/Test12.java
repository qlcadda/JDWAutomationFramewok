package com.pack3.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Test12 
{
	public WebDriver driver;
	@BeforeTest
	public void openBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Automation_batch\\Java_program\\Selenium_QLC_2301\\Library\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@BeforeMethod
	public void passUrlBrowser()
	{
		driver.get("https://www.facebook.com/");
	}
	
	@Test(dataProvider="provider")
	public void loginToApp(String un, String pw)
	{
		driver.findElement(By.id("email")).sendKeys(un);
		driver.findElement(By.id("pass")).sendKeys(pw);
	}
	
	@AfterMethod
	public void logOut()
	{
		System.out.println("Loged Out from Facebook");
	}
	
	@DataProvider(name="provider")
	public Object[][] getData()
	{
		Object[][] o1 = new Object[3][2];
		
		o1[0][0] = "pritam";
		o1[0][1] = "pk@12";
		
		o1[1][0] = "vikas";
		o1[1][1] = "vk09";
		
		o1[2][0] = "Abhi";
		o1[2][1] = "ab02";
		
		return o1;
	}
}
