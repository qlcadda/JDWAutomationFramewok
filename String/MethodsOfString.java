package com.String;

public class MethodsOfString {
	public static void cases(){
		String s1="DEveloPER";
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		String s2="deveLOPeR";
		boolean flag=s1.equalsIgnoreCase(s2);
		System.out.println(flag);
		String s3="kumark";
		//contains method check given character or substring is present in the string  or not.
		boolean b=s3.contains("k");
		System.out.println(b);
		System.out.println(s3.contains("uma"));
		System.out.println(s3.contains("mark"));
		
		//substring method is used to fetch the substring from given index.
		String sbs=s3.substring(1);
		System.out.println(sbs);
		String sbs1=s3.substring(1,3);
		System.out.println(sbs1);
		System.out.println(s3.isEmpty());
		String s4="";
		System.out.println(s4.isEmpty());
		String s5="stringclass";
		//replace method is use to replace the character from another character
		String replace=s5.replace("s","k");
		System.out.println(replace);
		
	} 


	public static void main(String[] args) {
		cases();
	}

}
