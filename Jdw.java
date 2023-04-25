import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Jdw {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asus\\eclipse-workspace\\Selenium\\server\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.jdwilliams.co.uk/");
		driver.manage().window().maximize();
		
		try {
			driver.findElement(By.xpath("//button[text()='Accept All Cookies']")).click();
		} catch (Exception e) {
			System.out.println("popup available");
		}
		
		WebElement searchbar= driver.findElement(By.name("searchString"));
		searchbar.sendKeys("jeans");
		WebElement searchbtn =driver.findElement(By.id("searchButton"));
		searchbtn.click();
		WebElement plphomebtn =driver.findElement(By.xpath("//a[@title='Home'] "));
		boolean b1=plphomebtn.isDisplayed();
		
		if(b1) 
		{
			System.out.println("we are in plp page");
		}
		else 
		{
			System.out.println("we are not in plp page");
		}
		
		WebElement plpproduct=driver.findElement(By.xpath("(//a[@class='js-product-title-anchor'])[2]"));
		plpproduct.click();
		
		WebElement pdpproduct=driver.findElement(By.id("WAR"));
		
		boolean b2=pdpproduct.isDisplayed();
		if(b2) 
		{
			System.out.println("we are in pdp page");
		}
		else 
		{
			System.out.println("we are not in pdp page");
		}
		
		
	}

}
