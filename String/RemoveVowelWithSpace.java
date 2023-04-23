package com.String;

public class RemoveVowelWithSpace {

	public static void main(String[] args)
	{
		String s="my name is suraj";
		char[] vowel={'a','e','i','o','u','A','E','I','O','U'};
		int vowelLength=vowel.length;
		for(int i=0;i<vowelLength;i++)
		{
			char ch1 = vowel[i];
			if(s.contains(ch1+""))
			{
				s = s.replace(ch1,' ');
			}
		}
		System.out.println(s);
	}

}
