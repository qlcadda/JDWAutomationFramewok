package com.pack1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JdwBase {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asus\\eclipse-workspace\\Selenium\\server\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.jdwilliams.co.uk/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		try {
			WebElement popup=driver.findElement(By.xpath("//button[text()='Accept All Cookies']"));
			popup.click();
			
		} catch (Exception e) {
			// TODO: handle exception
		}

		WebElement searchbar=driver.findElement(By.name("searchString"));
		searchbar.sendKeys("jeans");
		
		WebElement searchbtn=driver.findElement(By.xpath("//button[@id='searchButton']"));
		searchbtn.click();
		
		WebElement plpwebelm= driver.findElement(By.xpath("//a[@title='Home']"));
		boolean b1=plpwebelm.isDisplayed();
		
		if (b1) {
			System.out.println("we are in plp page");
		} else {
			System.out.println("not in plp page");

		}
		
		WebElement plpwebele=driver.findElement(By.xpath("(//img[@class='js-plp-image'])[4]"));
		plpwebele.click();
		
	WebElement review=driver.findElement(By.xpath("//button[text()='Write a review']"));
	  boolean b2= review.isDisplayed();
	  
	  if (b2) {
		System.out.println("we are in pdp page");
	} else {
		System.out.println("we are not in pdp page");
	}
	  
			
		
	}

}
