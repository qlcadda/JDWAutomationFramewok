package com.pack2.actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test2 {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Automation_batch\\Java_program\\Selenium_QLC_2301\\Library\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000);
		
		Actions act = new Actions(driver);
		act.sendKeys("pritam@gmail.com").perform();
		
		WebElement pw = driver.findElement(By.xpath("//input[@id='pass']"));
		
		act.sendKeys(pw, "Abcd@123456").perform();
		
		// Performing keyboard operation
		act.sendKeys(Keys.ENTER).perform();
	}

}
