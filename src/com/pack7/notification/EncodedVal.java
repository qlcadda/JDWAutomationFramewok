package com.pack7.notification;

import org.apache.commons.codec.binary.Base64;

public class EncodedVal
{
	public static String getPassword()
	{
		String password = "Abcd@123";
		
		byte[] b = password.getBytes();
		
		byte[] b1 = Base64.encodeBase64(b);
		
		String pw = new String(b1);
		
		return pw;	
	}
	
	public static void decodePassword()
	{
		String encodePassword = "QWJjZEAxMjM=";
		
		byte[] b1 = Base64.decodeBase64(encodePassword);
		
		// Convert byte[] to String value
		String encodedPassword = new String(b1);
		
		System.out.println(encodedPassword);
	}
	
}
