package com.ead.threads;

public class ThreadApplication {
//Implementação mais indicada.
	public static void main(String[] args) {
		
//		TesteThread thread = new TesteThread();
//		thread.start();
		
		TesteThread02 thread2 = new TesteThread02();
		Thread t = new Thread(thread2);
		t.start();

		try {
			for (int i = 0; i < 20; i++) {
				System.out.print(".");
				Thread.sleep(200);
			}
		} catch (Exception e) {
			
		}
	}
}
