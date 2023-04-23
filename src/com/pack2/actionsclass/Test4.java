package com.pack2.actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Test4 {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Automation_batch\\Java_program\\Selenium_QLC_2301\\Library\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(4000);
		
		WebElement txtWebElm = driver.findElement(By.xpath("//h2[contains(text(),'Facebook helps')]"));
		
		Actions act = new Actions(driver);
		
		act.doubleClick(txtWebElm).perform();
		
		Action act1 = act.sendKeys(Keys.chord(Keys.CONTROL, "c")).build();
		act1.perform();
		
		WebElement eamilTxtWebElm = driver.findElement(By.id("email"));
		
		act.sendKeys(eamilTxtWebElm, Keys.CONTROL, "v").build().perform();
		
		act.sendKeys("");
	
	}

}
