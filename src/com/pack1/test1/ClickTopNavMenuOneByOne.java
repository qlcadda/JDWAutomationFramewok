package com.pack1.test1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickTopNavMenuOneByOne {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "D:\\Automation_batch\\Java_program\\Selenium_QLC_2301\\Library\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.jdwilliams.co.uk/");
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
		
		driver.findElement(By.cssSelector("#topNav_Womens")).click();
		Thread.sleep(6000);
		
		List<WebElement> allWomesCloth = driver.findElements(By.cssSelector("div[class='pwb-nav']>a"));
		
		for(WebElement w: allWomesCloth)
		{
			String val = w.getText();
			System.out.println(val);
		}
	}

}
