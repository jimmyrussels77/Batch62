package com.cogent.threads;

class MyThread106 extends Thread
{
	@Override
	public void run()
	{
		System.out.println("I am from run");
	}
			
}
public class Manager106_Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread106 mt = new MyThread106();
		mt.start();
		
		
	}

}
