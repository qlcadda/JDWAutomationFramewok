package Pack1;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class FramePractice {
public static void main(String[] args) throws Exception
{
	System.setProperty("webdriver.chrome.driver", "C:\\\\Automation tools\\\\chromedriver_win32\\\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://ui.vision/demo/webtest/frames/");
	driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
	//Switch to frame
WebElement  frame1=driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
	driver.switchTo().frame(frame1);
	WebElement txtf1=driver.findElement(By.xpath("//input[@name='mytext1']"));
	txtf1.sendKeys("in first frame");
	//switch back to main window
	driver.switchTo().defaultContent();
	WebElement frame2=driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
	driver.switchTo().frame(frame2);
	WebElement txtfr2=driver.findElement(By.xpath("//input[@name='mytext2']"));
	txtfr2.sendKeys("in frame2");
	driver.switchTo().defaultContent();
	//frame inside frame
	//WebElement txt=driver.findElement(By.xpath("//div[@dir='auto']"));
WebElement frame3=driver.findElement(By.xpath(" //frame[@src='frame_3.html']"));
driver.switchTo().frame(frame3);
WebElement txt=driver.findElement(By.xpath("//p[text()='iframe inside frame:']"));
System.out.println(txt.getText()); //capture the text in parent class 
//After parent frame directly enter to child frame don't need default content
WebElement frame4 = driver.findElement(By.tagName("iframe"));
driver.switchTo().frame(frame4);
String val = driver.findElement(By.xpath("//div[text()='Form Filling Demo Page']")).getText();
System.out.println(val);
}
}
