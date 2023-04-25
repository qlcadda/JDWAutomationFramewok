package com.pack1;

import org.testng.annotations.Test;

public class Test3 {
	
	@Test
	public void run1() 
	{
		System.out.println("run1 is strt executing");
	}
	@Test(groups= {"smoke test"})
	public void run2() 
	{
		System.out.println("run2 is strt executing");
	}

}
