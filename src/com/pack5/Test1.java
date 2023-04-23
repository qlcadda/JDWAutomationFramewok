package com.pack5;

class ThreadDemo1 implements Runnable
{
	public  void run()
	{
		 try
		 {
			 System.out.println("Thread "+Thread.currentThread().getId()+" is running");
		 }
		 catch(Exception e)
		 {
			 System.out.println("Exception is caught");
		 }
	}
}

public class Test1 
{
	public static void main(String[] args) 
	{
		for(int i=1; i<=10; i++)
		{
			System.out.println(i);
			ThreadDemo1 obj = new ThreadDemo1();
			Thread t = new Thread(obj);
			t.start();
		}
	}
}