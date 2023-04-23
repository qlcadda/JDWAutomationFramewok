package SeleniumPractice;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupingTestNg
{
	@BeforeGroups(groups= {"smokeTest"})
	public void beforeGroupTest()
	{
		System.out.println("beforeGroupTest");
	}
	 @Test(groups= {"smokeTest"})
	 public void searchProduct()
	 {
		 System.out.println("searchProduct");
	 }
	  @Test(groups={"smokeTest","RegressionTest"})
	  public void addProductToBag()
	  {
		  System.out.println("addProductToBag");
	  }
	  @Test(groups={"RegressionTest"})
	  public void openPayment()
	  {
		  System.out.println("openPayment");
		  
	  }
	  @Test
	  public void writeReview()
	  {
		  System.out.println("writeReview");
		  
	  }
	  @AfterGroups(groups= {"RegressionTest"})
		public void afterGroupTest()
		{
			System.out.println("afterGroupTest");
		}
}
