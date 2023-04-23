package com.String;
public class RemoveVowelFromString {
	public static void main(String[] args) {
		String s="deveLOPeR";
		char[] ch=s.toCharArray();
		int len=ch.length;
		char[] v={'A','E','I','O','U','a','e','i','o','u'};
		for(int i=0;i<len;i++){
			char c=ch[i];
			for(int j=0;j<v.length;j++){
				char v1=v[j];
				if(c==v1){
					System.out.println(v1);
				}
			}
		}
	}
}