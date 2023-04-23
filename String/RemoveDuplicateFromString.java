package com.String;

public class RemoveDuplicateFromString {

	public static void main(String[] args) {
		String s="qlcadda";
		String s1="";
		for(int i=0;i<=s.length()-1;i++){
			char ch=s.charAt(i);
			int index=s1.indexOf(ch);
			if(index==-1){
				s1=s1+ch;
			}
		}
		System.out.println("after removing duplicate   :"+s1);
	}

}
