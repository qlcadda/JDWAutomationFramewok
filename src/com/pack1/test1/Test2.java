package com.pack1.test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Automation_batch\\Java_program\\Selenium_QLC_2301\\Library\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.jdwilliams.co.uk/shop/signin/display.action");
		
		try
		{
			WebElement cookieWebElemBtn = driver.findElement(By.xpath("//button[text()='Accept All Cookies']"));
			cookieWebElemBtn.click();
			Thread.sleep(3000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		// Verification
		
		WebElement w1 = driver.findElement(By.xpath("//h1[text()='Sign in']"));
		// Capture the Visible Text
		String actualSignInText = w1.getText();
		if(actualSignInText.equals("Sign in"))
		{
			System.out.println("We are in Sign In Page");
		}
		else
		{
			System.out.println("We are not in Sign In Page");
		}
		
		WebElement unTxtFldWebElem = driver.findElement(By.id("username"));
		unTxtFldWebElem.sendKeys("abcd@gmail.com");
		
		WebElement pwTxtWebElm = driver.findElement(By.id("password"));
		pwTxtWebElm.sendKeys("Abcd@123");
		
		WebElement chkBox1 = driver.findElement(By.id("rememberMe"));
		boolean b1 = chkBox1.isSelected();
		System.out.println(b1);
		
		chkBox1.click();
		boolean b2 = chkBox1.isSelected();
		System.out.println(b2);
		
		WebElement signInBtnWebElem = driver.findElement(By.xpath("//button[@id='signInButton']"));
		signInBtnWebElem.click();
		
		WebElement errorTxtWebElm = driver.findElement(By.xpath("//p[@class='alert__text_error']"));
		String errorText = errorTxtWebElm.getText();
		
		if(errorText.contains("incorrect"))
		{
			System.out.println("Error message is displaying on Page");
		}
		else
		{
			System.out.println("Error is not displaying");
		}
	
	}

}
