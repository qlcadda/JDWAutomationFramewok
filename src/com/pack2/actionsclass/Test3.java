package com.pack2.actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Test3 {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Automation_batch\\Java_program\\Selenium_QLC_2301\\Library\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		Thread.sleep(3000);
		
		WebElement sourceWebElm = driver.findElement(By.xpath("//a[contains(text(),'BANK')]"));
		
		WebElement destWebElm = driver.findElement(By.xpath("((//h3[contains(text(),'Account')])[1]//following::li)[1]"));

		Actions act = new Actions(driver);
		
		
		Action act1 = act.clickAndHold(sourceWebElm).moveToElement(destWebElm).release(destWebElm).build();
		act1.perform();
		
		
	}

}
