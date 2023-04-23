package SeleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DateFromDynamicCalander 
{
	
	public static WebDriver driver;
	
  public static void main(String[] args) throws Exception
	{
	  
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\alkab\\eclipse-workspace\\Selenium\\Server1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Thread.sleep(3000);
		
		
		WebElement datePicker = driver.findElement(By.xpath("//input[@id='datepicker']"));
		datePicker.click();
		
		Thread.sleep(3000);	
		ddmmyy("2022","June","20");
	  
	}
  
  public static void ddmmyy(String year, String month, String date) throws Exception
  {
	  for (int i = 1; i <=12; i++)
	  {
		  try
		  {
			WebElement datePi = driver.findElement(By.xpath("//span[text()='"+year+"']//following::span[text()='"+month+"']//following::span[text()='"+date+"']"));
				
					datePi.click();
					break;
		  } 
		  catch (Exception e)
		  {
			WebElement nxt = driver.findElement(By.xpath("//span[text()='Next']"));
			nxt.click();
			Thread.sleep(3000);
		  }
		
	  }
  }
  
  
}

