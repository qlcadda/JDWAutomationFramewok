package Pack1;        // /*1. Open Empty Browser 2. Pass JDW Url 3. Click on New IN link 4. Select Blue clour 5. Select the product from PLP page*/                                           
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;                         

public class Test2 {
public static void main(String[] args) throws Exception
{
	System.setProperty("webdriver.chrome.driver","C:\\Automation tools\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.jdwilliams.co.uk/");
try
	{
		WebElement cookie=driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']"));
		cookie.click();
		Thread.sleep(3000);
	}
catch(Exception e)
{
	e.printStackTrace();
}
	WebElement newIn=driver.findElement(By.xpath("//a[@id='topNav_NewIn']"));
	newIn.click();
	WebElement blue=driver.findElement(By.xpath("//span[text()='Blue']"));
	blue.click();
	Thread.sleep(3000);
	WebElement fstpic=driver.findElement(By.xpath("(//img[@class='js-plp-image'])[1]"));
	fstpic.click();
}
}
