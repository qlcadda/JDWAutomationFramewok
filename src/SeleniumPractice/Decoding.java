package SeleniumPractice;

import java.util.Base64;

import org.testng.annotations.Test;

public class Decoding
{
    @Test
	public  void m1()
	{
	 decodePassword();  
	}

	private void decodePassword() 
	{
		String decodePassword = "QWxrYUAjMTIzNDU2";
		
		byte[] b1 = Base64.getDecoder().decode(decodePassword);
		
		String DecodedPassword = new String(b1);
		
		System.out.println(DecodedPassword);
		
		
	}

}
