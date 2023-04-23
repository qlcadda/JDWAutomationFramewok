package SeleniumPractice;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SortDropDownListByAlphabet
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
		Thread.sleep(2000);
		
		WebElement email1 = driver.findElement(By.xpath("//input[contains(@name,'reg_email_conf')]"));
		email1.sendKeys("begroosenina@gmail.com");
		
		
		WebElement newPassword = driver.findElement(By.xpath("//input[@data-type='password']"));
		newPassword.sendKeys("Welcome@1234567");
		
		WebElement date = driver.findElement(By.id("day"));
		Select sel = new Select(date);
		sel.selectByVisibleText("21");
		
		WebElement month = driver.findElement(By.id("month"));
		Select sel1 = new Select(month);
		List<WebElement> allmonth = sel1.getOptions();
		int len= allmonth.size();
		String[] s1 = new String[len];
		int i=0;
		
		
		for (WebElement w : allmonth) 
		{
			String val = w.getText();
			s1[i] = val;
		     i++;
		}
		
		String[] sortedArr = sortArray(s1);
		for (String s : sortedArr)
		{
			System.out.println(s);
		}
	}

	static String[] sortArray(String[] arr) 
	{
		
		for (int i = 0; i <=arr.length-1; i++) 
		{
			for (int j = 0; j <=arr.length-1; j++)
			{
				int a = arr[j].compareTo(arr[i]);
				if (a>0)
				{
					String temp = arr[i];
					arr[i]= arr[j];
					arr[j] = temp ;
					
				}
			}
		}
		
		return arr;
	}
}

		
	


