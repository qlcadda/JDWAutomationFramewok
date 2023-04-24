package Pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test4 {
public static void main(String[] args)throws Exception
{
	System.setProperty("webdriver.chrome.driver","C:\\Automation tools\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	Thread.sleep(3000);
	WebElement btnWebelm=driver.findElement(By.xpath("//a[text()='Create new account']"));
	btnWebelm.click();
	Thread.sleep(3000);
	driver.findElement(By.name("firstname")).sendKeys("Pritam");
	driver.findElement(By.name("lastname")).sendKeys("Kumar");
	driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']")).sendKeys("1235674");
	driver.findElement(By.id("password_step_input")).sendKeys("abcd@134");
	WebElement dayDDWebElm=driver.findElement(By.id("day"));
Select sel=new Select(dayDDWebElm);
sel.selectByVisibleText("31");
WebElement monthDDWebElm=driver.findElement(By.xpath("//select[@id='month']"));
Select monthDD=new Select(monthDDWebElm);
monthDD.selectByVisibleText("Oct");
WebElement yearDDWebElm=driver.findElement(By.id("year"));
Select yearDD=new Select( yearDDWebElm);
yearDD.selectByValue("2014");
}
}