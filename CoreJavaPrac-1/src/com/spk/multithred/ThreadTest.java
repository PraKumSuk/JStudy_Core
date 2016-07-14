package com.spk.multithred;

public class ThreadTest {
	
	public static void main(String[] args) {
		
		//ThreadA
		Thread threadA = new Thread(new Runnable(){
			public void run(){
                for(int i =0; i<1; i++){
                    System.out.println("This is thread : " + Thread.currentThread().getName());
                }
            }
		}, "Thread A");

		//ThreadB
		Thread threadB = new Thread(new Runnable(){
			public void run(){
                for(int i =0; i<2; i++){
                    System.out.println("This is thread : " + Thread.currentThread().getName());
                }
            }
		}, "Thread B");
		
		//Invoking threads i.e. run() via start()
		threadA.start();
        threadB.start();		
	}

}
