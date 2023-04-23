package com.pack3.testng;

import org.testng.annotations.Test;

public class SimplyBe 
{
	@Test
	public void verifyWishListTest()
	{
		System.out.println("verifyWishListTest");
	}
	
	@Test(groups={"smokeTest"})
	public void verifyCustomerTest()
	{
		System.out.println("verifyCustomerTest");
	}
}
