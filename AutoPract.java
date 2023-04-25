import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutoPract {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asus\\eclipse-workspace\\Selenium\\server\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		
//		Actions actions= new Actions(driver);
//		WebElement click=driver.findElement(By.xpath("//button[text()='Copy Text']"));
//		actions.doubleClick(click).perform();
		
		WebElement from= driver.findElement(By.id("draggable"));
		WebElement to= driver.findElement(By.id("droppable"));
		
		Actions actions= new Actions(driver);
		actions.dragAndDrop(from, to).build().perform();
	}

}
