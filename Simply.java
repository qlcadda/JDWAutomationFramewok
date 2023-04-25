import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Simply {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asus\\eclipse-workspace\\Selenium\\server\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.simplybe.co.uk/");
		driver.manage().window().maximize();
		
		try {
			driver.findElement(By.xpath("//button[text()='Accept All Cookies']")).click();
		} catch (Exception e) {
			System.out.println("pop up visible");
		}
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//button[contains(@class,'Button_tertiary ')])[2]")).click();

	}

}
