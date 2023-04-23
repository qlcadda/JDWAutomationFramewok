package com.String;

public class CovertLowerToUpperViceversa {

	public static void main(String[] args) {
		String s="QlcADDa ";
		String s2="";
		for(int i=0;i<s.length();i++){
			char ch=s.charAt(i);
			int val=ch;
			if(val>=65 && val<=90){
				val=val+32;
				char ch1=(char)val;
				s2=s2+ch1;
			}
			else if(val>=97 && val<=122){
				val=val-32;
				char ch2=(char)val;
				s2=s2+ch2;
				
			}
		}
		System.out.println(s2);
	}

}
