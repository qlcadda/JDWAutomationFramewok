package com.String;

public class REverseWordInPlaceFromString {

	public static void main(String[] args) {
		String s="i love java";
		String[] s1=s.split(" ");
		String rev="";
		for(int i=0;i<s1.length;i++){
			String s3=s1[i];
			for(int j=s3.length()-1;j>=0;j--){
				char ch=s3.charAt(j);
				rev=rev+ch;
			}
			rev=rev+" ";
		}
		System.out.println(rev);
	}
}
