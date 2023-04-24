package Pack1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG1 {
@BeforeMethod
public void logInToApp()
{
	System.out.println("login to JDW");
}
@Test
public void searchProduct() 
{
	System.out.println("Searching Products");
}
@Test
public void addProduct()
{
	System.out.println("products added");
}
@AfterClass
public void closeBrowser()
{
	System.out.println("browser closed");
}
@AfterMethod
public void logOut()
{
	System.out.println("logout from JDW");	
}
@BeforeClass
public void openBrowser()
{
	System.out.println("Open Empty Browser");
}
@BeforeSuite
public void createConnection()
{
	System.out.println("Connection created");
}
@AfterSuite
public void closeConnection()
{
	System.out.println("connection closed");
}
@BeforeTest
public void  inTest()
{
	System.out.println("Initialise all classes");
}
@AfterTest
public void closeinTest()
{
	System.out.println("close all classes");
}
@BeforeGroups
public void groupTest()
{
	System.out.println("started grouping");
}
@AfterGroups
public void groupEnd()
{
	System.out.println("ended grouping");
}
}
