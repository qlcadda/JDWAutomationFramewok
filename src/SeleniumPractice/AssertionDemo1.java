package SeleniumPractice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionDemo1
{
  @Test
  public <AssertionDemoTest> void Test()
  {
	  String[] expectedval = {"Java", "Selenium"};
	  String[] actualval = {"Java", "Selenium"};
	  
	  Assert.assertEquals(expectedval, actualval, "Both input are not equal");
	 // Assert.assertNotEquals(expectedval, actualval,"Both input are equal");
	  
	  String expectedTitle = "JD Williams";
	  String actualTitle = "JD Williams";
	  
	  Assert.assertSame(actualTitle, expectedTitle, "actualTitle and expectedTitle is not equal");
	  
	  System.out.println("stop");
	  
	  String s1 = null;
	  Assert.assertNull(s1, "The object value is not null");
	  
	  String s2 = "Pritam";
	  Assert.assertNull(s2, "The object value is not null");
	  
	  System.out.println("STOP");
	  
	  
	  
	  
  }
  
  
}
