package com.pack2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test5 {
	
	@Test
	public void run4() 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asus\\eclipse-workspace\\Selenium\\server\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.jdwilliams.co.uk/");
		
	}
	

}
