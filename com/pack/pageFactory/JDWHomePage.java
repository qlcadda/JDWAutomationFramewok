package com.pack.pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JDWHomePage 
{
	public JDWHomePage()
	{
		PageFactory.initElements(Driver.driver, this);
	}
	
	@FindBy(id="searchKeyWords2")
	private WebElement serchTxtBox;
	
	@FindBy(xpath="//button[@id='searchButton']")
	private WebElement searchTxtBtn;
	
	
	public void enterProductIntotxtBox(String productName)
	{
		serchTxtBox.sendKeys(productName);
	}
	
	public void clickOnSerachBtn()
	{
		searchTxtBtn.click();
	}
	
	
}
