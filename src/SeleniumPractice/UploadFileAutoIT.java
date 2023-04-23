package SeleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFileAutoIT 
{

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\alkab\\eclipse-workspace\\Selenium\\Server1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("C:\\Users\\alkab\\OneDrive\\Desktop\\Upload1C.html");
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		
		Thread.sleep(5000);
		
		WebElement uploadFile = driver.findElement(By.xpath("//label[text()='Select a file:']"));
		uploadFile.click();
		
		Thread.sleep(5000);
		
		Runtime.getRuntime().exec("C:\\UploadFile\\Upload.exe");
		
		
	}

}
