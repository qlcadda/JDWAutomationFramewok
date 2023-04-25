package SeleniumClassPrat;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PrintHeader {

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.jdwilliams.co.uk/");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		try {
			driver.findElement(By.xpath("//button[text()='Accept All Cookies']")).click();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		List<WebElement> header = driver.findElements(By.xpath("//li[@class='gui-sub-nav' and text()]"));
		 String [] val =  new String [header.size()];
		 int i=0;
		 
	Iterator<WebElement> itr	= header.iterator();
		while (itr.hasNext()) {
			WebElement w1 = itr.next();
			String headerr = w1.getText();
			val[i++] = headerr;
			
		}
		for (String s : val) {
			System.out.println(s);
		}
		
		//driver.close();
	}

}
