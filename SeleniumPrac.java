import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumPrac {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asus\\eclipse-workspace\\Selenium\\Server\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.jdwilliams.co.uk/");
		driver.manage().window().maximize();

	}

}
