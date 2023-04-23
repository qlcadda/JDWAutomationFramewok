package SeleniumPractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SampleTest 
{
 @BeforeClass
 public void openBrowser()
 {
	 System.out.println("Open Browser");
 }
 
 //BeforeMethod,@Aftermethod,class, all  these are other supporting annotation
 
 @BeforeMethod
 public void loginToApp()
 {
	 System.out.println("loginToApp");
 }
  @Test
 public void searchProduct()
 {
	 System.out.println("searchProduct");
 }
  @Test(groups={"smokeTest"})
  public void demoTest1()
  {
	  System.out.println("demoTest1");
  }
  @Test(groups={"smokeTest"})
  public void demoTest2()
  {
	  System.out.println("demoTest2");
  }
  
  @AfterMethod
  public void logoutToApp()
  {
	  System.out.println("logoutToApp");
  }
  @AfterClass
  public void closeBrowser()
  {
	  System.out.println("closeBrowser");
  }
  @BeforeSuite
  public void createDBconneection()
  {
	  System.out.println("createDBconnection");
  }
  @AfterSuite
  public void closeDBconneection()
  {
	  System.out.println("closeDBconneection");
  }
  
}
