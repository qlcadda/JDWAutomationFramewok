package com.String;

public class RemoveVowelWithSpaceWithoutInbuiltMethod 
{
	public static void main(String[] args) {
		String s="my name is suraj";
		char[] ch=s.toCharArray();
		String s1="";
		int len=ch.length;
		char[] vowel={'a','e','i','o','u','A','E','I','O','U'};
		int vowelLength=vowel.length;
		for(int i=0;i<len;i++)
		{
			char ch1=ch[i];
			for(int j=0;j<vowelLength;j++)
			{
				char ch2=vowel[j];
				if(ch1==ch2)
				{
					ch[i]=' ';
				}
			}
		}
		for(int i=0; i<len; i++)
		{
			s1=s1+ch[i];
		}
		System.out.println(s1);
	}

}
