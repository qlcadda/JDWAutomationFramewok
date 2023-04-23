package com.pack2.actionsclass;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test1 {

	public static void main(String[] args) throws InterruptedException
	{
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
		
		WebElement newInLnkWebElem = driver.findElement(By.xpath("//a[@id='topNav_NewIn']"));
		
		// Create an Object of Actions class and pass the Browser instance to Actions class constructor.
		Actions act = new Actions(driver);
		
		
		act.moveToElement(newInLnkWebElem).perform();
		
		Thread.sleep(4000);
		
		List<WebElement> lst = driver.findElements(By.xpath("//a[@id='topNav_NewIn']/following-sibling::div[@class='gui-sub-nav-content']/div/div/ul/li/a"));
		
		
		Iterator<WebElement> itr = lst.iterator();
		while(itr.hasNext())
		{
			WebElement w1 = itr.next();
			System.out.println(w1.getText());
		}
		
		
		
		
	}

}
