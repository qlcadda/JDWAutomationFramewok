package com.pack3.testng;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SampleTest 
{	
	@Test
	public void searchProductTest()
	{
		System.out.println("searchProductTest");
	}
	
	@Test
	public void addProductToBagTest()
	{
		System.out.println("addProductToBagTest");
	}
	
	@Test
	public void writeReviewTest()
	{
		System.out.println("writeReviewTest");
	}
}
