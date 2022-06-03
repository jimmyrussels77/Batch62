package com.cogent.threads;

class Thread110 extends Thread
{
	@Override
	public void run()
	{
		for (int i = 0; i <1000; i++) {
			System.out.println(i);
			try {
				Thread.sleep(5);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class Manager110_Threead {
	public static void main(String[] args)
	{
		Thread110 t1 = new Thread110();
		t1.start();
	}

}
