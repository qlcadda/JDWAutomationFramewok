package SeleniumPractice;






import org.apache.commons.codec.binary.Base64;
import org.testng.annotations.Test;


public class Encoding 
{
	@Test
	public void m1()
	{
		encodePassword();
			
	}

	private void encodePassword() 
	{
		String password = "Alka@#123456";
		
		byte[] b = password.getBytes();
		
	    byte[] b1	= Base64.encodeBase64(b);
	    
	    String pw = new String(b1);
	    
	    System.out.println(pw);
	    
	    
		
	}
	

}
