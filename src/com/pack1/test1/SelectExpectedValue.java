package com.pack1.test1;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectExpectedValue {

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Automation_batch\\Java_program\\Selenium_QLC_2301\\Library\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(5000);
		WebElement btnWebElm = driver.findElement(By.xpath("//a[text()='Create new account']"));
		btnWebElm.click();
		Thread.sleep(8000);
		driver.findElement(By.name("firstname")).sendKeys("Pritam");
		
		driver.findElement(By.name("lastname")).sendKeys("Kumar");
		
		
		String expectedValue = "Jun";
		
		// WebElement for Month DD
		WebElement monthDDWebElm = driver.findElement(By.name("birthday_month"));
		
		Select sel = new Select(monthDDWebElm);
		
		List<WebElement> ddLstWebElm = sel.getOptions();
		
		// Method -1
		int len = ddLstWebElm.size();
		
		for(int i=0; i<=len-1; i++)
		{
			WebElement w = ddLstWebElm.get(i);
			String actualValue = w.getText();
			if(actualValue.equals(expectedValue))
			{
				sel.selectByVisibleText(expectedValue);
				break;
			}
		}
		
		// Method - 2
		for(WebElement w : ddLstWebElm)
		{
			String actualValue = w.getText();
			if(actualValue.equals(expectedValue))
			{
				sel.selectByVisibleText(expectedValue);
				break;
			}
		}
		
		// Method - 3
		Iterator<WebElement> itr = ddLstWebElm.iterator();
		while(itr.hasNext())
		{
			WebElement w = itr.next();
			String actualValue = w.getText();
			if(actualValue.equals(expectedValue))
			{
				sel.selectByVisibleText(expectedValue);
				break;
			}
		}
		
	}

}
