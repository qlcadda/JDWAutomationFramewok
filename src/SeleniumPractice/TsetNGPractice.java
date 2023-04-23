package SeleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TsetNGPractice 

	{
		@Test
		public void searchProductTest()
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\alkab\\eclipse-workspace\\Selenium\\Server1\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.jdwilliams.com");
			
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			
			try
			{
			  driver.findElement(By.xpath("//button[text()='Accept All Cookies']")).click();
			  Thread.sleep(5000);
			  
			} 
			catch (Exception e)
			{
				e.printStackTrace();
			}
			
			WebElement searchButton = driver.findElement(By.id("searchKeyWords2"));
			searchButton.sendKeys("Jeans");
			
			driver.findElement(By.id("searchButton"));
		
	}
		
		@Test
		public void test2()
		{
		 System.out.println("test2");	
		}
		
		@Test
		public void test3()
		{
			System.out.println("test3");
			
		}
		

}
