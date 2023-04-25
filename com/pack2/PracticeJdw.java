package com.pack2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PracticeJdw {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asus\\eclipse-workspace\\Selenium\\Server\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.jdwilliams.co.uk/");
		driver.manage().window().maximize();
		
		try {
			driver.findElement(By.xpath("//button[text()='Accept All Cookies']")).click();
		} catch (Exception e) {
			System.out.println("popup is present");
		}
		WebElement searchbtn=driver.findElement(By.id("searchKeyWords2"));
		searchbtn.sendKeys("jeans",Keys.ENTER);
		
		WebElement w=driver.findElement(By.xpath("(//select[@id='sortBy'])[1]"));
		Select dropdown= new Select(w);
		dropdown.selectByVisibleText("Highest Price");
		
		Thread.sleep(3000);
		WebElement w1=driver.findElement(By.xpath("(//select[@id='productsPerPage'])[1]"));
		Select dropdown1= new Select(w1);
		dropdown1.selectByIndex(0);
		

	}

}
