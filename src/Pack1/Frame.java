package Pack1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {
	static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Automation tools\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		  driver.get("https://ui.vision/demo/webtest/frames/");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
//		  WebElement frame1=driver.findElement(By.xpath(" //frame[@src='frame_1.html']"));
//		  driver.switchTo().frame(frame1);
//		 WebElement text1= driver.findElement(By.xpath(" //input[@name='mytext1']"));
//		 text1.sendKeys("text1");
//		 driver.switchTo().defaultContent();
//		 WebElement frame2=driver.findElement(By.xpath(" //frame[@src='frame_2.html']"));
//		 driver.switchTo().frame(frame2);
//		 WebElement text2=driver.findElement(By.xpath(" //input[@name='mytext2']"));
//		 text2.sendKeys("text2");
		  frame();
	}
	public static void frame() {
		
		for(int i=1;i<=4;i++) {
			driver.findElement(By.xpath(" //frame[@src='frame_"+i+".html']"));
			 driver.findElement(By.xpath(" //input[@name='mytext"+i+"]")).sendKeys("text");
			 driver.switchTo().defaultContent();
		}
	}

}
