package com.pack1;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Revising {

	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Asus\\Desktop\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.jdwilliams.co.uk/");
		
		try {
			driver.findElement(By.xpath("//button[text()='Accept All Cookies']")).click();
		} catch (Exception e) {
			System.out.println("popup is displayd");
		}
		//driver.findElement(By.xpath("//span[@class='gui-dropdown-toggle']")).click();
		//driver.findElement(By.xpath("//div[text()='Register']")).click();
		
		//driver.findElement(By.name("searchString")).sendKeys("jeans",Keys.ENTER);
		
		//driver.findElement(By.xpath("//select[contains(@class,'js-facet-option-selection js-sort')][1]")).click();
		WebElement footwear=driver.findElement(By.name("topNav_Footwear"));
		Actions act= new Actions(driver);
		act.moveToElement(footwear).perform();
		

	}

}
