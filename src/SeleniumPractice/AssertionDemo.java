package SeleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionDemo
{
    @Test
  public void searchProductTest()
  {
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\alkab\\eclipse-workspace\\Selenium\\Server1\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://www.jdwilliams.com");
	 
	 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 
	
	 try 
	 {
		 WebElement cookies =  driver.findElement(By.xpath("//button[text()='Accept All Cookies']"));
		 cookies.click();
		 
		 Thread.sleep(5000);
	 }
	 catch (Exception e) 
	 {
		e.printStackTrace();
	 }
	 
	 String expectedVal = "NEW IN";
	 WebElement newinwebElm = driver.findElement(By.id("topNav_NewIn"));
	 String actualval = newinwebElm.getText();
	 SoftAssert sa = new SoftAssert();
	 sa.assertEquals(actualval, expectedVal, "We are not in Home page");
	 
	 WebElement searchTxtBox = driver.findElement(By.id("searchKeyWords2"));
	 searchTxtBox.sendKeys("Jeans");
	 
	 WebElement searchBtn = driver.findElement(By.id("searchButton"));
	 searchBtn.click();
	 
	 WebDriverWait wait = new WebDriverWait(driver, 30);
	 wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@title='Home']")));
	 
	 String actualTitle = driver.getTitle();
	 sa.assertTrue(actualTitle.contains("Jeanskljks"), "We are not in pplp page");
	 
	 System.out.println("continue");
	 sa.assertAll();
	 
  }
}
