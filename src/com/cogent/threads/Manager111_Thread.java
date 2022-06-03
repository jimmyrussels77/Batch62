package com.cogent.threads;
class Minister111 extends Thread
{
	@Override
	public void run()
	{
		try {
			Thread.sleep(1000);
			System.out.println("Minister");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class SchoolBus111 extends Thread
{
	@Override
	public void run()
	{
		try {
			Thread.sleep(1000);
			System.out.println("School Bus");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class Ambulance111 extends Thread
{
	@Override
	public void run()
	{
		try {
			Thread.sleep(1000);
			System.out.println("Ambulance");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}


public class Manager111_Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ambulance111 t1 = new Ambulance111();
		t1.setPriority(Thread.MAX_PRIORITY);
		SchoolBus111 t2 = new SchoolBus111();
		t2.setPriority(Thread.NORM_PRIORITY);
		Minister111 t3 = new Minister111();
		t3.setPriority(Thread.MIN_PRIORITY);
		
		t1.start();
		t2.start();
		t3.start();
		
		
	}

}
