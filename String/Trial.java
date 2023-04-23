package com.String;

public class Trial {
	public static void main(String[] args) {
	String s1="abab abcd bab";
	String s2="ab";
	int index=0;
	int count=0;
	while((s1.indexOf(s2)!=-1)){
		index=s1.indexOf(s2);
		count++;
		s1=s1.substring(index+1);
	}
	System.out.println(count);
	}}
