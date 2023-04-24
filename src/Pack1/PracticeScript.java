package Pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PracticeScript {
public static void main(String[] args) throws Exception
	{
	   System.setProperty("webdriver.chrome.driver","C:\\Automation tools\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.demo.guru99.com/V4/");
	   WebDriverWait wait=new WebDriverWait(driver,20);
     	String actId="mngr490864";
     	String actPw="ytehysu";
    	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@name='uid']")));
    	WebElement w1=driver.findElement(By.xpath("//input[@name='uid']"));
    	w1.sendKeys(actId);
    	WebElement w2=driver.findElement(By.xpath("//input[@name='password']"));
    	w2.sendKeys(actPw);
	   WebElement logIn=driver.findElement(By.xpath("//input[@name='btnLogin']"));
	   logIn.click();
	   String expectedVal = "Manager";
	  WebElement hm =  driver.findElement(By.xpath("//a[text()='Manager']"));
	  String actuaVal = hm.getText();
       if(actuaVal.equals(expectedVal))
       {
    	   System.out.println("We are in home page");
       }
	else
	{
		System.out.println("We are not in home page");
	}
	}
}
