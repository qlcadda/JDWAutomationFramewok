package com.String;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
public class AB {
	static WebDriver driver = null;
 @Test
 public void StandBy(){
		WebElement ParticularStandbyBike= driver.findElement(By.xpath("standby Bike Xpath"));
	ParticularStandbyBike.click();
	System.out.println("Standby bike is collected");
 }
 public  void Speedometer(){
	WebElement checkingdistance= driver.findElement(By.xpath("Speedometer xpath"));
	String TotaldistanceCovered=checkingdistance.getText();
	System.out.println(TotaldistanceCovered);
 }
}
