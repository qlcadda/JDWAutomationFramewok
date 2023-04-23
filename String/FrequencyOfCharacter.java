package com.String;

public class FrequencyOfCharacter {

	public static void main(String[] args) {
		String s="qlcadda";
		int count=0;
		for(int i=0;i<s.length();i++){
			count=0;
			char ch1=s.charAt(i);
			for(int j=0;j<s.length();j++){
			char ch2=s.charAt(j);
			if(ch1==ch2 && j<i){
				break;
			}
			if(ch1==ch2){
				count++;
			}
			if(j==s.length()-1){
				System.out.println(ch1+" = "+count);
			}
			}
		}
	}

}
