package practice;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class Practice2 {
@BeforeGroups(groups= {"smokeTest"})//testing method that is used to determine if a new software build is ready for the next testing phase.
public void beforeGroupTest()
{
System.out.println("beforeGroupTest");	
}
@AfterGroups(groups= {"smokeTest"})
public void afterGroupTest()
{
	System.out.println("AfterGroupTest");
}
@Test(groups= {"smokeTest","RegressionTest"})
public void searchProductTest()
{
	System.out.println("searchProductTest");
}
@Test(groups= {"smokeTest"})
public void addProductsToBagTest()
{
	System.out.println("addProductToBagTest");
}
@Test(groups= {"RegressionTest"})
public void writeReviewTest()
{
	System.out.println("writeReviewTest");
}
}
