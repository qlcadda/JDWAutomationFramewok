package SeleniumClassPrat;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class JdwSignin {

	public static void main(String[] args) throws Exception {
		
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
		driver.findElement(By.xpath("//span[@class='gui-dropdown-toggle']")).click();
		driver.findElement(By.xpath("//div[text()='Sign In']")).click();
		
		WebElement w1 =driver.findElement(By.xpath("//h1[text()='Sign in']"));
		String actualStringText =w1.getText();
		if (actualStringText.equals("Sign in")) 
		{
			System.out.println("we are in sign in page");
				
		}
		else {
			System.out.println("we are not in sign in page");
		}
		driver.findElement(By.id("username")).sendKeys("Raj@7765");
		driver.findElement(By.name("password")).sendKeys("qwerty12345");
		WebElement chekbox = driver.findElement(By.xpath("//input[@id='rememberMe']"));
		boolean b1	= chekbox.isSelected();
		System.out.println(b1);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(4000);
		
		driver.close();
		
		
	}

}
