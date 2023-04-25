

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Jdwi {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asus\\eclipse-workspace\\Selenium\\server\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.jdwilliams.co.uk/");
		driver.manage().window().maximize();
		
		try {
			driver.findElement(By.xpath("//button[text()='Accept All Cookies']")).click();
		} catch (Exception e) {
			System.out.println("popup available");
		}
		
		WebElement plppage=driver.findElement(By.name("topNav_Christmas"));
		String text=plppage.getText();
		System.out.println(text);
		
		String attvalue=plppage.getAttribute("name");
		System.out.println(attvalue);
		
		WebElement serachBtnWebElem = driver.findElement(By.xpath("//button[@title='Search']"));
		// isEnabled() checking whether the web element is enable or not
		boolean b1 = serachBtnWebElem.isEnabled();
		System.out.println(b1);
		
		WebElement myActWebElent = driver.findElement(By.xpath("//span[@class='gui-dropdown-toggle']"));
		myActWebElent.click();
		
		driver.findElement(By.xpath("//div[text()='Sign In']")).click();
		
		WebElement rememberMeWeBElem = driver.findElement(By.id("rememberMe"));
		rememberMeWeBElem.click();
		
		// isSelected() checking whether the checkbox is checked or not
		boolean b2 = rememberMeWeBElem.isSelected();
		if(b2)
		{
			System.out.println("Selected");
		}
		else
		{
			System.out.println("Not Selected");
		}
		
		WebElement usrWebElm = driver.findElement(By.id("username"));
		usrWebElm.sendKeys("testingisfun@gmail.com");
		
		Thread.sleep(5000);
		
		// clear() clear the text box from the browser
		usrWebElm.clear();
		
		// getCssValue() =-> it will capture the style
		String color = usrWebElm.getCssValue("color");
		System.out.println(color);
		
		// getCssValue() =-> it will capture the x-axis and y-axis
		Point p = usrWebElm.getLocation();
		int xaxis = p.x;
		int yaxis = p.y;
		
		System.out.println(xaxis+" : "+yaxis);
		
		Dimension d = usrWebElm.getSize();
		int hight = d.height;
		int width = d.width;
		System.out.println(hight+" : "+width);
		
		String tagName = usrWebElm.getTagName();
		System.out.println(tagName);
		

		
		
		
		
		
		
		
	}

}
