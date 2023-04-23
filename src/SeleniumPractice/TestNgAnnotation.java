package SeleniumPractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNgAnnotation {
	
	
	
	@BeforeClass
	public void openBrowser()
	{
		System.out.println("Open Empty Browser");
	}

	@BeforeMethod	
	public void loginToApp()
	{
	 System.out.println("Login to facebook");	
	}
	
	@Test
	public void Search()
	{
		System.out.println("Search Name");
		
	}
	@Test
	public void openChat()
	{
		System.out.println("Start Chatting");
		
	}
	@Test
	public void frndReqst()
	{
		System.out.println("Cheeck Friend Request");
		
	}
	@AfterMethod
	public void logout()
	{
		System.out.println("Logout from Facebook");
	}
	@AfterClass
	public void closeBrowser()
	{
		System.out.println("close the browser");
	}
	

	


}
