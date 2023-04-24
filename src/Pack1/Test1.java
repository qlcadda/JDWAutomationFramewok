package Pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Automation tools\\chromedriver_win32\\chromedriver.exe");
		
	WebDriver driver	=new ChromeDriver();
	driver.get("https://www.jdwilliams.co.uk/");
	WebElement searchTextBoxWebElem=driver.findElement(By.id("searchKeyWords2"));
	//action on web element
	 searchTextBoxWebElem.sendKeys("T-shirts");
	}	
}
