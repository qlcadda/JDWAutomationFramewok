package com.pack1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test2 {
	
	@BeforeClass
	public void openbrowser() 
	{
		System.out.println("open empty browser browser popup");
	}
	@BeforeMethod
	public void lointoHAM() 
	{
		System.out.println("login to HAM");
	}
	@Test
	public void m3() 
	{
		System.out.println("fun3 of test2 class");
	}
	@Test(groups= {"smoke test"})
	public void fun4() 
	{
		System.out.println("fun4 test2 class");
	}
	@AfterMethod
	public void logouttoHAM() 
	{
		System.out.println("log out from HAM");
	}
	@AfterClass
	public void close() 
	{
		System.out.println("close the browser");
	}
	
}
