package com.pack2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToolQa {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asus\\eclipse-workspace\\Selenium\\Server\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("firstName")).sendKeys("Raj");
		driver.findElement(By.id("userEmail")).sendKeys("abhi@776");
		WebElement clik=driver.findElement(By.xpath("//input[@name='gender']"));
		
		Actions act= new Actions(driver);
		act.click(clik).perform();
		WebElement Elemnt=driver.findElement(By.xpath("//div[@class='header-text']"));
		act.click(Elemnt).perform();
		Thread.sleep(3000);
		
		WebElement btn=driver.findElement(By.xpath("(//span[@class='text'])[5]"));
		act.click(btn).perform();
		
		//Thread.sleep(3000);
		//WebElement doble=driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
	//	act.doubleClick(doble).perform();

	}

}
