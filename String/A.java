package com.String;

public class A {
	public static void main(String[] args) {
		String s1="abab abcd bab";
		String s2="ab";
		int index=0;
		int count=0;
		//for(int i=0;i<s1.length();i++){
		while(s1.indexOf(s2)!=-1){
			index=s1.indexOf(s2);
			s1=s1.substring(index+1);
			count++;
		}
		System.out.println("count of ab is :- "+count);
		
	}

}
