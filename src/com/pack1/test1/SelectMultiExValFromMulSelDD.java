package com.pack1.test1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

// How to select multiple expected value from multi select drop down
public class SelectMultiExValFromMulSelDD 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Automation_batch\\Java_program\\Selenium_QLC_2301\\Library\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/shalinik/Desktop/multoselectDD.html");
		
		String[] expectedVal= {"Kiran", "Amit", "Sai"};
		
		WebElement empDDWebElm = driver.findElement(By.xpath("//select[@id='Emp']"));
		
		Select sel = new Select(empDDWebElm);
		boolean b = sel.isMultiple();
		if(b)
		{
			List<WebElement> allOptionWebELm = sel.getOptions();
			for(String s : expectedVal)
			{
				for(WebElement w: allOptionWebELm)
				{
					String actualValue = w.getText();
					if(s.equals(actualValue))
					{
						sel.selectByVisibleText(s);
						break;
					}
				}
			}
		}
		// Verify whether expected value is selected or not
		
		List<WebElement> lst = sel.getAllSelectedOptions();
		
		for(WebElement w : lst)
		{
			String actVal = w.getText();
			for(String s : expectedVal)
			{
				if(actVal.equals(s))
				{
					System.out.println("YES : "+s);
				}
			}
		}
	}
}
