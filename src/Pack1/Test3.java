package Pack1;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {
	public static void main(String[] args) throws Exception {	
		System.setProperty("webdriver.chrome.driver","C:\\Automation tools\\chromedriver_win32\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.get("https://www.jdwilliams.co.uk/");
			try {
				WebElement cookie=driver.findElement(By.id("onetrust-accept-btn-handler"));
				cookie.click();
			Thread.sleep(3000);
			}
		catch (Exception e)
			{
			e.printStackTrace();
			}		
	//verification home page
List<WebElement> actLstElm=driver.findElements(By.xpath("//div[contains(@class,'gui-my-account')]"));
int len= actLstElm.size();
System.out.println(len);
if(len>=1)
{
	System.out.println("We are in home page");
}
else {
	System.out.println("we are not in home page");
}
List<WebElement> navAll=driver.findElements(By.xpath("//li[@class='gui-sub-nav']"));
int len1=navAll.size();
System.out.println(len1);
int j=1;
for(int i=0;i<len1;i++)
{
	WebElement topNav=driver.findElement(By.xpath("(//li[@class='gui-sub-nav'])[j])"));
	topNav.click();
	j++;
}
	}

}

