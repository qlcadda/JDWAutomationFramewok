package practice;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNgPractice {
@BeforeMethod
public void searchApp()
{
	System.out.println("Searching in App");
}
@AfterTest
public void stopSearching()
{
	System.out.println("Stopped Searching");
}
@Test
public void exitApp()
{
	System.out.println("Exited from App");
}
}
