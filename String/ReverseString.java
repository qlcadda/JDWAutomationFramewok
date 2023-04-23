package com.String;

public class ReverseString {

	public static void main(String[] args) {
		String s="qlcadda";
		String s1="";
		for(int i=s.length()-1;i>=0;i--){
			char ch=s.charAt(i);
			s1=s1+ch;
		}
		System.out.println("Reverse  :"+s1);
	}
}
