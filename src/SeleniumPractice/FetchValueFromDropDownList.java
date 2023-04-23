package SeleniumPractice;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchValueFromDropDownList 
{

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\alkab\\eclipse-workspace\\Selenium\\Server1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		WebElement newAccount = driver.findElement(By.xpath("//a[text()='Create new account']"));
		newAccount.click();
		Thread.sleep(3000);
		
		WebElement firstName = driver.findElement(By.cssSelector("[aria-label='First name']"));
		firstName.sendKeys("Nina");
		
		WebElement lastName = driver.findElement(By.cssSelector("[aria-label='Surname']"));
		lastName.sendKeys("Begroose");
		
		WebElement email = driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']"));
		email.sendKeys("begroosenina@gmail.com");
		Thread.sleep(3000);
		
		WebElement email1 = driver.findElement(By.xpath("//input[contains(@name,'reg_email_conf')]"));
		email1.sendKeys("begroosenina@gmail.com");
		
		WebElement newPassword = driver.findElement(By.xpath("//input[@data-type='password']"));
		newPassword.sendKeys("Welcome@1234567");
		
	
		
		
		
		
		
		
		
		
		
	}

}
