import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MakemyTrip {

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
		WebElement serchbox =driver.findElement(By.name("topNav_NewIn"));
		serchbox.click();
		// driver.close();
		
		driver.findElement(By.xpath("//a[@title='refine via Colour Blue']")).click();
		WebElement plpselect =driver.findElement(By.xpath("//a[@aria-label='view Anise Coralie Embroidered Sleeve Blouse']"));
	boolean plpproduct 	=plpselect.isDisplayed();
	
	if (plpproduct) {
		System.out.println("we are in plp page");
	}
	}

}
