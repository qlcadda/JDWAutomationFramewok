package Pack1;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WinHandle {
public static void main(String[] args)throws Exception
{
	System.setProperty("webdriver.chrome.driver", "C:\\Automation tools\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.irctctourism.com/");
	driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
	WebDriverWait wait=new WebDriverWait(driver,60);
	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='Bus Tickets']")));
	WebElement busTkt=driver.findElement(By.xpath("//span[text()='Bus Tickets']"));
	busTkt.click();
	Thread.sleep(4000);
	//capture main window id
	String mainWinId=driver.getWindowHandle();//captures the main window Id where control is presently active.
	//capture all window id
   Set<String> allWinIds=driver.getWindowHandles();
   	for(String winId : allWinIds)
   	{
   		if(! (mainWinId.equals(winId)))
   				{
   					//switch to unwanted window
   					driver.switchTo().window(winId);
   					driver.close();			
   				}
   	}	
   	driver.switchTo().window(mainWinId);
   		WebElement flightElm=driver.findElement(By.xpath("//span[text()='Flights']"));
   		flightElm.click();
}
}
