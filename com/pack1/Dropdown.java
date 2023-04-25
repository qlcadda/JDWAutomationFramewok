package com.pack1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asus\\eclipse-workspace\\Selenium\\server\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Asus/Desktop/dropdown.html");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		WebElement s=driver.findElement(By.xpath(" //select[@name='test']"));
		Select sel=new Select(s);
		boolean flag=sel.isMultiple();
		if(flag) {
			WebElement bear=driver.findElement(By.xpath(" (//select[@name='test']//following::option)[4]"));
			bear.click();
			driver.findElement(By.xpath(" (//select[@name='test']//following::option)[3]")).click();
			driver.findElement(By.xpath(" (//select[@name='test']//following::option)[2]")).click();
			
			
		}
	}

}
