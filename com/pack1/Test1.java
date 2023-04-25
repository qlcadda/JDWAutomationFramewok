package com.pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test1 {
	
	@BeforeTest
	public void dBconnection() 
	{
		System.out.println("DB connection is open");
	}
	@AfterTest
	public void closedBconnection() 
	{
		System.out.println("DB connection is closed");
	}
	@BeforeMethod
	public void login() 
	{
		System.out.println("login into application");
	}
	@Test(groups= {"smoke test"})
	public void fun1() 
	{
		System.out.println("fun1 is strt executing");
	}
	@Test
	public void fun2() 
	{
		System.out.println("fun2 is strt executing");
	}
	@AfterMethod
	public void logout() 
	{
		System.out.println("logout into application");
	}

}
