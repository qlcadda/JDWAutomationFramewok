package SeleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlertPopup
{

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\alkab\\eclipse-workspace\\Selenium\\Server1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement custId = driver.findElement(By.xpath("//input[@name='cusid']"));
		custId.sendKeys("Alka123");
		
		WebElement submitkey = driver.findElement(By.xpath("//input[@value='Submit']"));
		submitkey.click();
		
		Thread.sleep(5000);
		
		try 
		{
		   Alert al1 = driver.switchTo().alert();
		   String val = al1.getText();
		   System.out.println(val);
		   
		   al1.accept();
		   Thread.sleep(5000);
		   
		   String ExpectedStmt = "Customer Successfully Delete!";
		   Alert alt = driver.switchTo().alert();
		   
		   String actualstmt = alt.getText();
		   
		   if (ExpectedStmt.equals(actualstmt))
		   {
			System.out.println("Customer Successfully Delete!");
		   }
		   else
		   {
			   System.out.println("Customer Successfully Not Delete!");
		   }
		   Thread.sleep(2000);
		   alt.accept();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		
		

	}

}
