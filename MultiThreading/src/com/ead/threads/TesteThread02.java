package com.ead.threads;

public class TesteThread02 implements Runnable {
	
	@Override
	public void run() {

		try {
			for (int i = 0; i < 20; i++) {
				System.out.print("y");
				Thread.sleep(200);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
	
//	Pode existir um método sobrecarregado.
//	public void run(String texto) {
//		
//	}

}
