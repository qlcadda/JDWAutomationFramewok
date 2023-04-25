package com.pack2;

public class ReverseString {

	public static void main(String[] args) {
		
		String s1 = "My Name Is Paply";
		String[] s2 = s1.split(" ");
		String s4 = "";
		for (int i = 0; i<= s2.length-1 ; i++) 
		{
			String s3 = s2[i] ;
			s4=s4+s3.charAt(0);
		}
		System.out.println(s4);

	}

}
