package com.pack3.testng;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.pack6.ListnerDemo;

@Listeners(ListnerDemo.class)
public class Test3 
{
	@Test
	public void loginToFacebookTest()
	{
		System.out.println("loginToFacebookTest");
	}
	
	@Test
	public void createAccountTest()
	{
		System.out.println("createAccountTest");
	}
}
