package com.pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumPractice {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asus\\eclipse-workspace\\Selenium\\Server\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.jdwilliams.co.uk/");
		try {
			driver.findElement(By.xpath("//button[text()='Accept All Cookies']")).click();
		} catch (Exception e) {
			System.out.println("popup show");
		}
		
		driver.findElement(By.name("searchString")).sendKeys("jeans");
		driver.findElement(By.id("searchButton")).click();
		
		WebElement w1=driver.findElement(By.xpath("(//select[@class='js-facet-option-selection js-sort'])[1]"));
		Select dropdown= new Select(w1);
		dropdown.selectByVisibleText("Lowest Price");

	}

}
