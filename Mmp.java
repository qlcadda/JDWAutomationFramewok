import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mmp {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asus\\eclipse-workspace\\Selenium\\server\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  
		  driver.get("https://www.makemytrip.com/");
		  Thread.sleep(3000);
		 try {
			 WebElement close= driver.findElement(By.id("webklipper-publisher-widget-container-notification-frame"));
			 driver.switchTo().frame(close);
			 driver.findElement(By.cssSelector("a.close")).click();
			 driver.switchTo().defaultContent();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//span[contains(text(),'DEPARTURE')]")).click();
		  Thread.sleep(5000);
		  
		  String flag = "False";
		 

		  while(flag=="False") {
		   
		   if(driver.findElements(By.xpath("//div[@class='DayPicker-Day'][contains(@aria-label,'Nov 8 2022')]")).size()>0) {
		    
		   driver.findElement(By.xpath("//div[@class='DayPicker-Day'][contains(@aria-label,'Nov 15 2022')]")).click(); 
		   flag="True";
		   Thread.sleep(5000);
		   }
		   
		   else {
		    Thread.sleep(5000);
		    driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
		   }
		      
		  }
		  
		  
		  System.out.println("Test case is passed");
		  driver.close();
		  
		    
		 

		
	}

}
