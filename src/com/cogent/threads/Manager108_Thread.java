package com.cogent.threads;

class Thread1081 extends Thread
{
	@Override
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
	}
}

class Thread1082 extends Thread
{
	@Override
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
	}
}
public class Manager108_Thread {

	public static void main(String[] args)
	{
		Thread1081 t1 = new Thread1081();
		Thread1082 t2 = new Thread1082();
		t1.setName("Kisa");
//		System.out.println(t1.getId() + " : " + t1.getName());
//		System.out.println(t2.getId() + " : " + t2.getName());
		
		t1.run();
		t2.run();
		
//		System.out.println(Thread.currentThread().getId());
		System.out.println(Thread.currentThread().getName());
	}
}
