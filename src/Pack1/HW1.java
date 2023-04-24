package Pack1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HW1 {
public static void main(String[] args)throws Exception
{
	System.setProperty("webdriver.chrome.driver","C:\\Automation tools\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	Thread.sleep(3000);
	WebElement btn=driver.findElement(By.xpath("//a[text()='Create new account']"));
	btn.click();
	Thread.sleep(7000);
	WebElement month=driver.findElement(By.xpath("//select[@id='month']"));
	Select sel=new Select(month);
	//capture all select value from drop down
	List<WebElement> allOption=sel.getOptions();
	String[] months = new String[allOption.size()];
	int i=0;
	for(WebElement w: allOption) 
	{
	String val=w.getText();
	months[i++] = val;
		}
	 // Sort months Array
	

	 }
	
	}
	
	

