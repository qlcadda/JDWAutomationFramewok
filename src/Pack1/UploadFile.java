package Pack1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFile {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Automation tools\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/jprak/OneDrive/Documents/Test.html");
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		Thread.sleep(5000);
		WebElement uplFile=driver.findElement(By.xpath("//label[text()='Select a file:']"));
		uplFile.click();
		Thread.sleep(5000);
		Runtime.getRuntime().exec("C:\\uploadFile\\upload.exe");
	}

}
