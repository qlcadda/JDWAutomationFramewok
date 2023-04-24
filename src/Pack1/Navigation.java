package Pack1;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Navigation {
	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","C:\\Automation tools\\chromedriver_win32\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://www.jdwilliams.co.uk/");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			try {
				WebElement cookie=driver.findElement(By.id("onetrust-accept-btn-handler"));
				cookie.click();
			Thread.sleep(3000);
			}
		catch (Exception e)
			{
			e.printStackTrace();
			}		
			ArrayList<String> al=new ArrayList<String>();
			List<WebElement> allweb=driver.findElements(By.xpath(" //ul[@class='gui-nav-list']/li/a"));
			for(WebElement w:allweb) {
				String url=w.getAttribute("href");
				al.add(url);
				
			}
			for(String s:al) {
				driver.navigate().to(s);
				try {
				boolean flag=driver.findElement(By.xpath("//span[text()='Footwear Style']")).isDisplayed();
				if(flag) {
					driver.findElement(By.xpath("(//img[@class='js-plp-image'])[1]")).click();
					break;
				}
				}catch(Exception e) {
				}
			}
	}

}
