package com.pack3.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionDemoTest
{
	@Test
	public void test()
	{
		String[] expectedVal = {"Java", "Selenium"};
		
		String[] actualVal = {"Java", "Selenium"};
		
		Assert.assertEquals(actualVal, expectedVal, "Both input is not equal");
		
		//Assert.assertNotEquals(actualVal, expectedVal, "Both input is equal");
		
		String expectedTitle = "JD williams";
		String actualTitle = "JD williams";
		
		Assert.assertSame(actualTitle, expectedTitle, "Actual and expected title is not equal");
		
		
		
		AssertionDemoTest a1 = new AssertionDemoTest(); 
		AssertionDemoTest a2 = new AssertionDemoTest();
		
		//Assert.assertSame(a2, a1, "Both reference is refering to different object");
		
		String s1 = null;
		Assert.assertNull(s1, "The Object Value is not Null");
		
		String s2 = "Pritam";
		Assert.assertNull(s2, "The Object Value is not Null");
		
		System.out.println("STOP");
	}
}
