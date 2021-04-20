package com.company.jbAndroidDevPhase2;

public class Learning_Threading {

	public static void main(String[] args) {
		// One thread is created as follows.
		Thread thread = new Thread(new Runnable() {
				@Override
				public void run() {
					for(Integer i=1 ; i<=10 ; i++) {
						System.out.println("Printing i = " + i + " from a different thread");
						try {
							Thread.sleep(600);							
						}
						catch(InterruptedException e) {
							e.printStackTrace();
						}
					}
				}
			}
		);
		
		thread.start(); // Starting the above thread.
		
		// Threading from main thread is done as follows. 
		for(Integer i=1 ; i<=10 ; i++) {
			System.out.println("Printing i = " + i + " from the main thread");
			try {
				Thread.sleep(700);							
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}		
	}

}
