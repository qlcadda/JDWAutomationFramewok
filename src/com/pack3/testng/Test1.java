package com.pack3.testng;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class Test1
{
	@DataProvider(name="provider")
	public static Object[][] getData(Method m)
	{
		Object[][] o1 = null;
		
		String testCaseName = m.getName();
		
		if(testCaseName.equals("loginToApp"))
		{
			o1 = new Object[5][2];
			
			o1[0][0] = "pritam";
			o1[0][1] = "pk@12";
			
			o1[1][0] = "vikas";
			o1[1][1] = "vk09";
			
			o1[2][0] = "Abhi";
			o1[2][1] = "ab02";
			
			o1[3][0] = "AB";
			o1[3][1] = "01";
			
			o1[4][0] = "DB";
			o1[4][1] = "02";
			
		}
		if(testCaseName.equals("createFolder"))
		{
			o1 = new Object[3][1];
			
			o1[0][0] = "SampleFolder";
			
			o1[1][0] = "pkFolder";
			
			o1[2][0] = "skFolder";
		}
		return o1;
	}
}
