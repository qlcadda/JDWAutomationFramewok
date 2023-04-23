package com.pack3.testng;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.pack6.ListnerDemo;

@Listeners(ListnerDemo.class)
public class Test2 
{
	@Test
	public void loginToApp()
	{
		System.out.println("loginToApp");
		Assert.assertTrue(true);
	}
	
	@Test
	public void createFolder()
	{
		System.out.println("createFolder");
		Assert.assertTrue(false);
	}
	
	@Test
	public void uploadFolder()
	{
		System.out.println("uploadFolder");
		Assert.assertTrue(false);
	}
	
	@Test
	public void uploadFile()
	{
		System.out.println("uploadFile");
		Assert.assertTrue(true);
	}
}
