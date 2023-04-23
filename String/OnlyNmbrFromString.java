package com.String;

public class OnlyNmbrFromString {

	public static void main(String[] args) {
		String s="123qlc456adda";
		for(int i=0;i<s.length();i++){
			char ch=s.charAt(i);
			int val=ch;
			if(val>=48 && val<=57){
				char ch1=(char)val;
				System.out.println(ch1);
			}
			
		}
	}
}
