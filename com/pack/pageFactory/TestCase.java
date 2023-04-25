package com.pack.pageFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestCase 
{
	@Test
	public void test01()
	{
		WebDriver driver = Driver.getDriver("chrome");
		driver.get("https://www.jdwilliams.co.uk/");
		driver.manage().window().maximize();
		
		try {
			driver.findElement(By.xpath("//button[text()='Accept All Cookies']")).click();
		} catch (Exception e) {
			System.out.println("popup available");
		}
		
		JDWHomePage homePag = new JDWHomePage();
		
		homePag.enterProductIntotxtBox("Jeans");
		homePag.clickOnSerachBtn();
		
	}

}
