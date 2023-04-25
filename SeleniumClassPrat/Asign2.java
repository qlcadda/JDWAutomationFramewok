package SeleniumClassPrat;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Asign2 {

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
		WebElement serchbox =driver.findElement(By.xpath("//input[@name='searchString']"));
	
	// Verify the web element is enable or not	
		boolean b2 =serchbox.isEnabled();
		System.out.println(" b2 will true if web element is enabled ="+ b2);
	
		// capture the CSS style
		String color	= serchbox.getCssValue("color");
		System.out.println("color =" +color);
	
		// Get the location (X- axis and Y- axis)
		Point point =serchbox.getLocation();
		int xaxis = point.x;
		int yaxis = point.y;
		
		System.out.println("X-axis = " + xaxis);
		System.out.println("Y- axis = " + yaxis);
	
		// capture the hight and width	
		Dimension d1 =serchbox.getSize();
		
		int h1 = d1.height;
		int w1 = d1.width;
		System.out.println("Hight = "+ h1);
		System.out.println("Width = "+ w1);
		
		System.out.println(serchbox.getTagName());
		
	}

}
