package com.pack1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class jdwilliams {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asus\\eclipse-workspace\\Selenium\\server\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.jdwilliams.co.uk/");
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		try {
			WebElement popupElm=driver.findElement(By.xpath("//button[text()='Accept All Cookies']"));
			popupElm.click();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		WebElement jdwlogo=driver.findElement(By.xpath("//img[@alt='JD Williams']"));
		boolean b1=jdwlogo.isDisplayed();
		
		if (b1) {
			System.out.println("We are in Home page");
		} else {
			System.out.println("we are not in Home page");
		}
		
		List<WebElement> lst3 =driver.findElements(By.xpath("//img[@alt='JD Williams']"));
		if (lst3.size()>=1) {
			System.out.println("we are in home page");
		} else {
			System.out.println("We are not in home page");
		}
		
		WebElement searchbox=driver.findElement(By.name("searchString"));
		searchbox.sendKeys("jeans");
		
		 WebElement searchbtn =driver.findElement(By.xpath("//button[@id='searchButton']"));
		 searchbtn.click();
		 
		WebElement searchText=driver.findElement(By.xpath("//span[text()='Search Results']"));
		String val=searchText.getText();
		
		if (val.equals("Search Results")) {
			System.out.println("We are in PLP page");
		} else {
			System.out.println("We are not in PLP page");
		}
		
		driver.findElement(By.xpath("(//img[@class='js-plp-image'])[5]")).click();
		
		Thread.sleep(4000);
		
		
		 

	}

}
