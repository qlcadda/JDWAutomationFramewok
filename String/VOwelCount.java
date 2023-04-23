package com.String;

import java.util.Scanner;

public class VOwelCount {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		String s=scn.next();
		System.out.print(countVowel(s));
	}
	static int countVowel(String s){
		char[] v={'a','e','i','o','u','A','I','E','O','U'};
		int len=v.length;
		int length=s.length();
		int count=0;
		for(int i=0;i<length;i++){
			char ch1=s.charAt(i);
			for(int j=0;j<len;j++){
				char ch2=v[j];
				if(ch1==ch2){
					count++;
				}
			}
			
		}
		return count;
	}

}
