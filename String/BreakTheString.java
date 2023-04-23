package com.String;

public class BreakTheString {

	public static void main(String[] args) {
		String s="My Name Is Suraj";
		String[] part=s.split(" ");
		for(int i=0;i<part.length;i++){
			System.out.println(part[i]);
		}
	}

}
