package com.pack5;

class ThreadDemo extends Thread
{
	 public void run()
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

public class Test 
{
	public static void main(String[] args) 
	{
		for(int i=1; i<=10; i++)
		{
			System.out.println(i);
			ThreadDemo t1 = new ThreadDemo();
			t1.start();
		}
	}
}
