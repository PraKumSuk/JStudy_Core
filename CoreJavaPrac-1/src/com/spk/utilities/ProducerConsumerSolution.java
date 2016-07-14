package com.spk.utilities;

import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProducerConsumerSolution {

	public static void main(String args[]) {
		
		Vector sharedQueue = new Vector();
		int size = 4;
		
		Thread prodThread = new Thread(new Producer(sharedQueue, size), "ProducerThread");
		Thread consThread = new Thread(new Consumer(sharedQueue, size), "ConsumerThread");		
				
		prodThread.start();
		consThread.start();
	}
}


class Producer implements Runnable{
	
	private final Vector producerSharedQueue;
	private final int producerSize;

	public Producer(Vector producerSharedQueue, int producerSize) {
		this.producerSharedQueue = producerSharedQueue;
		this.producerSize = producerSize;
	}

	@Override
	/**Method to Produce Number of Messages
	 */
	public void run() {
		for (int i = 0; i < 7; i++) {
			System.out.println("Produced: " + i);
			try {
				produce(i);
			} catch (InterruptedException ex) {
				Logger.getLogger(Producer.class.getName()).log(Level.SEVERE, null, ex);
			}
		}
	}

	/**Method to produce actual Message
	 */
	private void produce(int i) throws InterruptedException {
		//wait if queue is full i.e. if the production size is reached
		while (producerSharedQueue.size() == producerSize) {
			synchronized (producerSharedQueue) {
				System.out.println("Queue is full " + Thread.currentThread().getName()+ " is waiting , size: " + producerSharedQueue.size());
				producerSharedQueue.wait();
			}
		}

		//producing element and notify consumers
		synchronized (producerSharedQueue) {
			producerSharedQueue.add(i);
			producerSharedQueue.notifyAll();
		}
	}
}


class Consumer implements Runnable {

	private final Vector consumerSharedQueue;
	private final int consumerSize;

	public Consumer(Vector consumerSharedQueue, int consumerSize) {
		this.consumerSharedQueue = consumerSharedQueue;
		this.consumerSize = consumerSize;
	}

	@Override
	public void run() {
		while (true) {
			try {
				System.out.println("Consumed: " + consume());
				Thread.sleep(50);
			} catch (InterruptedException ex) {
				Logger.getLogger(Consumer.class.getName()).log(Level.SEVERE, null, ex);
			}
		}
	}

	private int consume() throws InterruptedException {
		//wait if queue is empty
		while (consumerSharedQueue.isEmpty()) {
			synchronized (consumerSharedQueue) {
				System.out.println("Queue is empty " + Thread.currentThread().getName()	+ " is waiting , size: " + consumerSharedQueue.size());
				consumerSharedQueue.wait();
			}
		}

		//Otherwise consume element and notify waiting producer
		synchronized (consumerSharedQueue) {
			consumerSharedQueue.notifyAll();
			return (Integer) consumerSharedQueue.remove(0);
		}
	}
}

