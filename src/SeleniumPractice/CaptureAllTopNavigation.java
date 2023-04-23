package SeleniumPractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureAllTopNavigation 
{

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\alkab\\eclipse-workspace\\Selenium\\Server1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.jdwilliams.co.uk");
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		try
		{
		  driver.findElement(By.xpath("//button[text()='Accept All Cookies']")).click();
		  Thread.sleep(5000);
		  
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		List<WebElement> topNavigation = driver.findElements(By.xpath("//a[contains(@id,'topNav_')]"));
		String[] urlVal = new String[topNavigation.size()];
		int i = 0;
		
		for (WebElement w : topNavigation)
		{
			String url = w.getAttribute("href");
			urlVal[i++] = url;
		}
		
		for (String url : urlVal)
		{
			driver.navigate().to(url);
		}
		
		driver.navigate().to("https://www.jdwilliams.co.uk");
		
		
		 driver.findElement(By.xpath("//a[@id='topNav_Womens']")).click();
		 
		 
		 
		
		
	
		
		
		
		
		
	}

}
