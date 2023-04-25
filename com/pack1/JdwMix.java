package com.pack1;

import org.dataloader.Try;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JdwMix {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asus\\eclipse-workspace\\Selenium\\server\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.jdwilliams.co.uk/");
	
		
		try {
			driver.findElement(By.xpath("//button[text()='Accept All Cookies']")).click();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		WebElement topnavwebelm =driver.findElement(By.name("topNav_Christmas"));
		System.out.println(topnavwebelm.getText());
		
		String attvalue=topnavwebelm.getAttribute("name");
		System.out.println(attvalue);
		
		WebElement searchBtnWebElm=driver.findElement(By.xpath("//button[@title='Search']"));
		boolean b1=searchBtnWebElm.isEnabled();
		System.out.println(b1);
		
		WebElement accountWebElm=driver.findElement(By.xpath("//span[@class='gui-dropdown-toggle']"));
		accountWebElm.click();
		
	WebElement siginBtn=driver.findElement(By.xpath("//div[text()='Sign In']"));
	siginBtn.click();
	
	WebElement checkedBtn=driver.findElement(By.id("rememberMe"));
	boolean b2=checkedBtn.isSelected();
	
	if (b2) {
		System.out.println("selected");
	} else {
		System.out.println("Not Selected");
	}
	Thread.sleep(3000);
	
	WebElement idBtn=driver.findElement(By.name("username"));
	idBtn.sendKeys("xyz@1234");
	
	idBtn.clear();
	String colour=idBtn.getCssValue("color");
	System.out.println(colour);
	
	String letter=idBtn.getCssValue("letter-spacing");
	System.out.println(letter);

	}
	

}
