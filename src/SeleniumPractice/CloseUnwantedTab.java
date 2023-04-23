package SeleniumPractice;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CloseUnwantedTab 
{

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\alkab\\eclipse-workspace\\Selenium\\Server1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.irctctourism.com");
		
		//implicitly wait
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
		
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='Bus Tickets']")));
		
		WebElement busticket = driver.findElement(By.xpath("//span[text()='Bus Tickets']"));
		
		Thread.sleep(2000);
		
		String mainWinId = driver.getWindowHandle();
		
		Set<String> allWinId = driver.getWindowHandles();
		
		String expectedTitle = "Bus Reservation";
		
		for (String winId : allWinId) 
		{
			driver.switchTo().window(winId);
			String actualTitle = driver.getTitle();
			if (actualTitle.equals(expectedTitle))
			{
			WebElement buspage = driver.findElement(By.xpath("//h2[text()='Trending Package']"));
			System.out.println(buspage.getText());
			driver.close();
			}
		}
		}

	}


