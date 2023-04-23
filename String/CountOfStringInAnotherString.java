package com.String;

public class CountOfStringInAnotherString {

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
		System.out.println("count of "+s2+" is : "+count);
	}

}
//1) s1="abab abcd bab" inside while -index of ab=0 ,count =1, index=0+1=1, before first position remove- s1="bab abcd bab"
//2) s1="bab abcd bab" inside while -index of ab=1 ,count =2, index=1+1=2, before first position remove-s1="b abcd bab"
//2) s1="b abcd bab" inside while -index of ab=2 ,count =3, index=2+1=3, before first position remove-s1="bcd bab"
//2) s1="bcd bab" inside while -index of ab=5 ,count =4, index=5+1=6, before first position remove-s1=""
//index=-1, so it will not allow inside while loop.
//we are using substring method to remove one character from ab either a or b than we can make a diffrence betwween ab or another ch/aracter in each iteration.
