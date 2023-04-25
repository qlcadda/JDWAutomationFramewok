import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RahulSheetyPractice {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asus\\eclipse-workspace\\Selenium\\Server\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		
	//	(//div[text()='Currency']/../../div)[1]   xpath of currency
		
		driver.findElement(By.xpath("//div[@data-testid='home-page-travellers']")).click();
		System.out.println( driver.findElement(By.xpath("//div[@data-testid='home-page-travellers']")).getText());
		
		int i=1;
		while(i<5) 
		{
			driver.findElement(By.xpath("//div[@data-testid='Adult-testID-plus-one-cta']")).click();
			i++;
		}
		driver.findElement(By.xpath("//div[@data-testid='home-page-travellers-done-cta']")).click();
		System.out.println( driver.findElement(By.xpath("//div[@data-testid='home-page-travellers']")).getText());
		
		driver.findElement(By.xpath("//div[text()='From']")).click();
		driver.findElement(By.xpath("//div[text()='Bengaluru']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='Gorakhpur']")).click();
	}

}
