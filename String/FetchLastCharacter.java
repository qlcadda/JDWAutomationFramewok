package com.String;

public class FetchLastCharacter {

	public static void main(String[] args) {
		String s="My Name Is Suraj";
		String[] s1=s.split(" ");
		for(int i=0;i<s1.length;i++){
			String s2=s1[i];
			char ch=s2.charAt(s2.length()-1);
			System.out.println(ch);
		}
	}
}
