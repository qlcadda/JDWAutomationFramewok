import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class RahulSheetyProgram {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asus\\eclipse-workspace\\Selenium\\Server\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		driver.findElement(By.xpath("//a[text()='Flight Booking']")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='autosuggest']")).sendKeys("ind");
		
		Thread.sleep(3000);
		List<WebElement> options1 = driver.findElements(By.xpath("//li[@class='ui-menu-item']/a"));
		
		for(WebElement option: options1) 
		{
			if(option.getText().equalsIgnoreCase("india")) {
				option.click();
				break;
			}
		}

	}

}
