package com.String;

public class MethodOfStringBuffer {
	public static void strngBuffer(){
		StringBuffer sb=new StringBuffer();
		System.out.println(sb.capacity());
		sb.append("abcdefghijklmnop");
		System.out.println(sb.capacity());
		sb.append("q");
		System.out.println(sb.capacity());
		StringBuffer sb1=new StringBuffer("suraj");
		System.out.println(sb1.capacity());
		System.out.println(sb1.charAt(2));
	}
	public void stringBufferImportantMethod(){
		StringBuffer sb1=new StringBuffer("suraj");
		char ch=sb1.charAt(1);
		System.out.println(ch);
		sb1.setCharAt(1,'e');
		System.out.println(sb1);
		sb1.append(30);
		System.out.println(sb1);
		StringBuffer sb2=new StringBuffer("Automation");
		sb2.append('g');
		sb1.append(sb2);
		System.out.println(sb1);
		sb1.insert(5,"thirty");
		System.out.println(sb1);
		sb1.deleteCharAt(1);
		System.out.println(sb1);
		sb1.delete(4,10);
		System.out.println(sb1);
		sb1.reverse();
		System.out.println(sb1);
		
	}
	public void index(){
		StringBuilder sb3=new StringBuilder("developer");
		System.out.println(sb3.capacity());
		sb3.append('d');
		System.out.println(sb3);
		int ind=sb3.indexOf("e");
		System.out.println(ind);
		int ind1=sb3.indexOf("e",2);
		System.out.println(ind1);
		System.out.println(sb3.lastIndexOf("e"));
		System.out.println(sb3.lastIndexOf("e",5));
	}

	public static void main(String[] args) {
		strngBuffer();
		MethodOfStringBuffer sbi=new MethodOfStringBuffer();
		sbi.stringBufferImportantMethod();
		sbi.index();
		
	}

}
