package com.pack1.test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown1 {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Automation_batch\\Java_program\\Selenium_QLC_2301\\Library\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(5000);
		WebElement btnWebElm = driver.findElement(By.xpath("//a[text()='Create new account']"));
		btnWebElm.click();
		Thread.sleep(2000);
		driver.findElement(By.name("firstname")).sendKeys("Pritam");
		
		driver.findElement(By.name("lastname")).sendKeys("Kumar");
		
		driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']")).sendKeys("8210000678");
		
		WebElement pw = driver.findElement(By.xpath("//input[@aria-label='New password']"));
		pw.sendKeys("Abcd@123");
		
		
		WebElement dayDDWebElm = driver.findElement(By.id("day"));
		
		/* Create a Object of Select class and pass Drop-down webElement as argument in 
		Select class constructor while creating an Object
		*/
		
		Select sel = new Select(dayDDWebElm);
		sel.selectByVisibleText("31");
		
		WebElement monthDDWebElm = driver.findElement(By.xpath("//select[@id='month']"));
		
		// Select month
		Select monthDD = new Select(monthDDWebElm);
		monthDD.selectByVisibleText("Oct");
		
		WebElement yearDDWebElm = driver.findElement(By.id("year"));
		
		// Select Year
		Select yearDD =  new Select(yearDDWebElm);
		yearDD.selectByValue("1991");
		
		
		
	}

}
