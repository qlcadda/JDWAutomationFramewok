package Guru99Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class SeleniumEcommProject {
	
	static boolean checkSort(String[] s1)
	{
		int len = s1.length;
		boolean flag=true;
		for(int i=0; i<=len-1; i++)
		{
			for(int j=i+1; j<=len-1; j++)
			{
				int n = s1[i].compareTo(s1[j]);
				if(n>0)
				{
					flag = false;
				}
			}
		}
		
		return flag;
	}

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("http://live.techpanda.org/index.php/");
		
		String actualtitle =driver.getTitle();
		System.out.println(actualtitle);
		
		String expectedtitle ="Home page";
		
		if (actualtitle.equalsIgnoreCase(expectedtitle)) {
			System.out.println("Title Matched");
			
		} else {
			System.out.println("Title Not Matched");
		}		
		driver.findElement(By.xpath("//a[text()='Mobile']")).click();
		String title1 =driver.getTitle();
		System.out.println(title1);
		if (title1.equals("Mobile")) {
			System.out.println("mobile page title verifid");
		} else {
			System.out.println("mobile page title not verifid");
			
		}
		WebElement dropdown =driver.findElement(By.xpath("(//select[@title='Sort By'])[1]"));
		Select sel= new Select(dropdown);
		sel.selectByVisibleText("Name");
		
		List<WebElement> lst = driver.findElements(By.xpath("//h2[@class='product-name']/a"));
		
		String[] proName = new String[lst.size()];
		
		for(int i=0; i<lst.size(); i++)
		{
			WebElement w1 = lst.get(i);
			String val = w1.getText();
			System.out.println(val);
			proName[i] = val;
		
		}
		boolean b1 = checkSort(proName);
		if(b1)
		{
			System.out.println("Th Product is diplay in Sorted Order");
		}
		else
		{
			System.out.println("Th Product is not diplay in Sorted Order");
		}
		
		}

}


