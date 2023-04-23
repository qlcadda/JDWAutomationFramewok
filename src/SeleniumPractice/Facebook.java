package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\alkab\\eclipse-workspace\\Selenium\\Server1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.id("email")).sendKeys("alkabharti21@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("21Alka@1991");
		
		WebElement login = driver.findElement(By.xpath("//button[@name='login']"));
		login.click();
	}

}
