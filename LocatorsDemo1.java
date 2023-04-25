import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo1 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asus\\eclipse-workspace\\Selenium\\server\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.jdwilliams.co.uk/");
		driver.manage().window().maximize();
		
		try {
			driver.findElement(By.xpath("//button[text()='Accept All Cookies']")).click();
		} catch (Exception e) {
			System.out.println("popup found");
		}
		
//		driver.findElement(By.name("searchString")).sendKeys("jeans");
//		driver.findElement(By.id("searchButton")).click();
//		driver.findElement(By.partialLinkText("Darkwash Straight")).click();
//		driver.findElement(By.linkText("Darkwash Straight Fit Stretch Jeans")).click();
		
		Thread.sleep(2000);
		List<WebElement> slider= driver.findElements(By.xpath("//a[contains(@class,'hero__overlay-link hero__overlay-link')]"));
		 slider.size();
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("total links:"+links.size()); 
	}
	

}
