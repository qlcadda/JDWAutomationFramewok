package com.String;

public class ExtractVowel {

	public static void main(String[] args) {
		String s="deVeLopEr";
		char[] s1=s.toCharArray();
		char[] vowel={'a','e','i','o','u','A','I','E','O','U'};
		
		for(int i=0;i<s1.length;i++){
			char c1=s1[i];
			for(int j=0;j<vowel.length;j++){
				char c2=vowel[j];
				if(c1==c2){
					System.out.println(c1);
				}
			}
		}
	}

}
