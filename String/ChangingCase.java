package com.String;

public class ChangingCase {

	public static void main(String[] args) {
		// i/p-SuRaj sHarMa
		// o/p= Suraj Sharma
		String s1 = "SuRaj sHarMa";
		String[] a = s1.split(" ");
		String s3 = "";
		int length = a.length;
		for (int i = 0; i < length; i++) 
		{
			String s2 = a[i];
			for (int j = 0; j < s2.length(); j++)
			{
				char ch = s2.charAt(j);
				int val = ch;
				if (val >= 65 && val <= 90) 
				{
					val = val + 32;
				}
				char ch1 = (char) val;
				s3 = s3 + ch1;
			}
			s3=s3+" ";
		}

		System.out.println(s3);

	}

}
