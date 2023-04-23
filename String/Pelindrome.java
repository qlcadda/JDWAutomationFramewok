package com.String;

public class Pelindrome {

	public static void main(String[] args) {
		String s="madam";
		String s1="";
		for(int i=s.length()-1; i>=0;i--){
			char ch=s.charAt(i);
			s1=s1+ch;
		}
		if(s.equals(s1)){
			System.out.println("pelindrome");
		}
		else {
			System.out.println("not pelindrome");
		}
	}

}
