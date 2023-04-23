package com.pack3.testng;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class ScreenshotTest 
{
	public WebDriver driver;
	@Test
	public void captureScreenShotTest() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Automation_batch\\Java_program\\Selenium_QLC_2301\\Library\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.jdwilliams.co.uk/");
		Thread.sleep(3000);
		
		try{
			WebElement cookieWebElemBtn = driver.findElement(By.xpath("//button[text()='Accept All Cookies']"));
			cookieWebElemBtn.click();
			Thread.sleep(3000);}
		catch(Exception e){}
		
		driver.findElement(By.id("searchKeyWords2")).sendKeys("Jeans");
		driver.findElement(By.id("searchButton")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@title='Home']")));
		
		Assert.assertTrue(false);
		
		WebElement plpPdt = driver.findElement(By.xpath("(//img[@class='js-plp-image'])[1]"));
		plpPdt.click();
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[text()='Add To Bag']")));
	}
	
	@AfterMethod
	public void afterMethodTest(ITestResult res) throws Exception
	{
		String status = getStatus(res);
		if(status.equals("PASS"))
		{
			ITestNGMethod itm = res.getMethod();
			String testName = itm.getMethodName();
			
			captureScreenShot(testName+"_Pass");
		}
		else if(status.equals("FAIL"))
		{
			String testName = res.getMethod().getMethodName();
			captureScreenShot(testName+"_Fail");
		}
		else
		{
			String testName = res.getMethod().getMethodName();
			captureScreenShot(testName+"_Skip");
		}
	}
	
	public String getStatus(ITestResult res)
	{
		int status = res.getStatus();
		switch(status)
		{
			case 1:
				return "PASS";
			case 2:
				return "FAIL";
			case 3:
				return "SKIP";
		}
		return "Not Completed";
	}
	
	public void captureScreenShot(String screeShotName) throws Exception
	{
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		File source = ts.getScreenshotAs(OutputType.FILE);
		
		File destination = new File("D:\\Automation_batch\\Java_program\\Selenium_QLC_2301\\ScreenShot\\"+screeShotName+".jpg");
		
		// FileUtils.copyFile(source, destination);
		
		// OR 
		
		FileHandler.copy(source, destination);
		
	}
	
}
