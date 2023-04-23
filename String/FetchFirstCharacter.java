package com.String;

public class FetchFirstCharacter {

	public static void main(String[] args) {
		String s="My : Name : Is : Suraj";
		String[] s1=s.split(" : ");
		for(int i=0;i<s1.length;i++){
			String part=s1[i];
				char ch=part.charAt(0);
				System.out.println(ch);
				
			}
			
	}

}
