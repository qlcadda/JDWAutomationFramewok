package com.pack3.testng;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class JDWTest 
{
	
	@Test(groups={"smokeTest"})
	public void m1()
	{
		System.out.println("m1 of JDWTest");
	}
	
	@Test
	public void m2()
	{
		System.out.println("m2 of JDWTest");
	}
	
	
}
