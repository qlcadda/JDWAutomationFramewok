package com.String;
public class ReverseTheSentence {

	public static void main(String[] args) {
		String s="My Name Is Suraj";
		String[] s1=s.split(" ");
		String rev=" ";
		for(int i=s1.length-1;i>=0;i--){
			rev=rev + s1[i]+" ";
	}
		System.out.println(rev);
	}

}
