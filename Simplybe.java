import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Simplybe {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asus\\eclipse-workspace\\Selenium\\server\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.simplybe.co.uk/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		
		try {
			driver.findElement(By.xpath("//button[text()='Accept All Cookies']")).click();
			
		} catch (Exception e) {
			System.out.println("cookies popup is not showing");	
		}
		
		driver.findElement(By.xpath("//button[@class='Button Button_tertiary SplitHeader__searchButton']")).click();
		Thread.sleep(4000);
		WebElement search =driver.findElement(By.id("search-input"));
		search.sendKeys("jeans");
		search.sendKeys(Keys.ENTER);
		
		driver.findElement(By.id("yy930")).click();
		WebElement slect=driver.findElement(By.xpath("//button[@class='Button Button_option ProductDetails_sizeSelector__cNMRF']"));
		slect.click();
		driver.findElement(By.xpath("//span[@class='Cell_text__ceeJN' and text()='10R']")).click();
		driver.findElement(By.xpath("//button[@aria-label='add to bag']")).click();
		Thread.sleep(3000);
			driver.findElement(By.id("GoToBagPDP")).click();
			WebElement verify=driver.findElement(By.xpath("//a[text()='Delivery & Returns policy']"));
			boolean b1=verify.isDisplayed();
			
			if(b1) 
			{
				System.out.println("product is submitted");
			
			}
			else 
			{
				System.out.println("product is not submitted");
			}
		
	}

}
