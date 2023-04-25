package SeleniumClassPrat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class JdwPracti {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asus\\eclipse-workspace\\Selenium\\Server1\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.jdwilliams.co.uk/");
		
		try {
		WebElement	popoup =driver.findElement(By.xpath("//button[text()='Accept All Cookies']"));
		popoup.click();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		driver.findElement(By.xpath("//input[@name='searchString']")).sendKeys("jeans");
		driver.findElement(By.id("searchButton")).click();
		
		

	}

}
