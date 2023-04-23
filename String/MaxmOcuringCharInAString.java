package com.String;

public class MaxmOcuringCharInAString {

	public static void main(String[] args) {
		String s="thiss is suraj";
		int[] a=new int[127];
		for(int i=0;i<s.length();i++){
			a[s.charAt(i)]=a[s.charAt(i)]+1;
		}
		int max=-1;
		char c=' ';
		for(int j=0;j<s.length();j++){
		if(max<a[s.charAt(j)]){
			max=a[s.charAt(j)];
			c=s.charAt(j);
		}
	}
		System.out.println("maximum repeated  :"+c);
	}
}
