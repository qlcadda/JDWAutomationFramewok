package com.pack1.test1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

// How to select value from Multi select Drop-down
public class SelectValueFromMultiSelDD 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Automation_batch\\Java_program\\Selenium_QLC_2301\\Library\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/shalinik/Desktop/multoselectDD.html");
		
		WebElement empDDWebElm = driver.findElement(By.xpath("//select[@id='Emp']"));
		
		Select sel = new Select(empDDWebElm);
		
		// Verify whether the Drop-down is multi select or single select
		boolean b = sel.isMultiple();
		if(b)
		{
			sel.selectByVisibleText("Prakash");
			sel.selectByVisibleText("Pavan");
			sel.selectByIndex(5);
		}
		
		// Capture all selected Value from Drop down
		List<WebElement> allSelOption = sel.getAllSelectedOptions();
		
		for(WebElement w: allSelOption)
		{
			String val = w.getText();
			System.out.println(val);
		}
		
		WebElement firstSelVal = sel.getFirstSelectedOption();
		System.out.println(firstSelVal.getText());
		
		sel.deselectByVisibleText("Pavan");
		
		sel.deselectByIndex(1);
		
		sel.deselectAll();
	}

}
