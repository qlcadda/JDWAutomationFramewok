package com.pack3.testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionDemo 
{
	@Test
	public void searchProductTest() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Automation_batch\\Java_program\\Selenium_QLC_2301\\Library\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.jdwilliams.co.uk/");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		Thread.sleep(3000);
		
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
		
		String excpectedVal = "NEW";
		
		WebElement newInWEbElm = driver.findElement(By.xpath("//a[@id='topNav_NewIn']"));
		String actualVal = newInWEbElm.getText();
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(actualVal, excpectedVal, "We are not in Home Page");
		
		WebElement searchTxtBoxWebElm = driver.findElement(By.id("searchKeyWords2"));
		searchTxtBoxWebElm.sendKeys("jeans");
		
		
		WebElement serachBtnWebELm = driver.findElement(By.id("searchButton"));
		serachBtnWebELm.click();
		
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@title='Home']")));
		
		String actualTitle = driver.getTitle();
		
		sa.assertTrue(actualTitle.contains("jelnkljks"), "We are not in PLP page");
		

		System.out.println("Continue");
		
		sa.assertAll();
		
		
	}
}
