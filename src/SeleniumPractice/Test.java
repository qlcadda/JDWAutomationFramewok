package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test
{

	public static void main(String[] args)throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\alkab\\eclipse-workspace\\Selenium\\Server1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.jdwilliams.co.uk/");
		
		try
		{
			WebElement cookiesWebElemBtn = driver.findElement(By.xpath("//button[text()='Accept All Cookies']"));
			cookiesWebElemBtn.click();
			Thread.sleep(3000);
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		WebElement newin = driver.findElement(By.xpath("//a[@id='topNav_NewIn']"));
		newin.click();
		
		WebElement bluecolor = driver.findElement(By.xpath("//span[text()='Blue']"));
		bluecolor.click();
		
		WebElement plppage = driver.findElement(By.xpath("//a[@id='topNav_Sale']"));
	      Boolean b1 = plppage.isDisplayed();
	      if (b1)
	      {
	    	  System.out.println("We are in Plppage");
		  } 
	      else
	      {
	    	  System.out.println("We are in Plppage");
	      }
	      Thread.sleep(3000);
	         //Select the product
	      
	      WebElement product =driver.findElement(By.xpath("(//img[@class='js-plp-image'])[6]"));
	      product.click();
	      Thread.sleep(2000);
	      WebElement review = driver.findElement(By.xpath("//button[contains(@class,'bv_button_')]"));
		  Boolean b2 = review.isDisplayed();
		if (b2) 
		
		{
			System.out.println("We are in imageDisplay page");
		} 
		else
		{
			System.out.println("We are not in imageDisplay page ");
		}
		   // Select size of product
		  String expectedValue = "M";
		  WebElement selectsize = driver.findElement(By.xpath("//select[@aria-label='Select Size']"));
		  Select sel = new Select(selectsize);
		   sel.selectByVisibleText("M");
		    // Verify weather select size value is there or not
		    List<WebElement> sizeList = sel.getOptions();
		    // Method-1
	    for (int i=65; i>=90; i++)
	    {
		WebElement w = sizeList.get(i);
		String actualValue = w.getText();
		Thread.sleep(2000);
	        if (actualValue.equals(expectedValue)) 
	          {
	             sel.selectByVisibleText("expectedValue");
	              break;
              }
	    }
		  // add product in bag
	    WebElement addToBag = driver.findElement(By.xpath("//a[@name='addToBag-main']"));
	    addToBag.click();
	    Thread.sleep(3000);
	    
	    WebElement checkout = driver.findElement(By.xpath("//a[text()='Continue to Checkout']"));
	    checkout.click();
	    //go to just back page
	    driver.navigate().back();
	    // go to main home page for  next product
	    
	    driver.navigate().to("https://www.jdwilliams.co.uk/");
	    
	    //Select all product listing in women section
	    
	    WebElement women = driver.findElement(By.xpath("//a[@id='topNav_Womens']")); 
	    women.click();
	    
	    
	    List<WebElement> women1 = driver.findElements(By.cssSelector("div[class='pwb-nav']>a"));
	         Thread.sleep(3000);
	    
	    for (WebElement w : women1)
	    {
			String val = w.getText();
			System.out.println(val);
		}
	    
	    
}

}