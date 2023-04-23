package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\alkab\\eclipse-workspace\\Selenium\\Server1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		
		try 
		{
			WebElement loginCookies = driver.findElement(By.xpath("//button[text()='✕']"));
			loginCookies.click();
			Thread.sleep(3000);
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
		WebElement login = driver.findElement(By.xpath("//a[text()='Login']"));
	Boolean b1 = login.isDisplayed();
	if (b1)
	{
		System.out.println("We are at home page");	
	} 
	else
	{
		System.out.println("We are not at home page");
	}
	

	}
}
