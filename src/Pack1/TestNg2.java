package Pack1;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNg2 {
@Test
public void BatchTest()
{
	System.out.println("Serching for merge");
}
@BeforeMethod
public void NewLink() {
System.out.println("Start searching");
}
@Test
public void logInToApp()
{
	System.out.println("logged in");
}
}
