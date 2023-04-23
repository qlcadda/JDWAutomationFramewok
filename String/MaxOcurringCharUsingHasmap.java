package com.String;

import java.util.HashMap;
import java.util.Map;


public class MaxOcurringCharUsingHasmap {

	public static void main(String[] args) {
		String s="abcabbccaa";
		char[] c=s.toCharArray();
		HashMap<Character, Integer> hm=new HashMap<Character,Integer>();
		for(char ch:c){
			if(hm.containsKey(ch)){
				hm.put(ch,hm.get(ch)+1);
			}
			else{
				hm.put(ch, 1);
			}
			
		}
		System.out.println(hm);
	}

}
