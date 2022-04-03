package com.anudip.concurrent;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {
	private BlockingQueue<Message> queue;
	
	public Producer(BlockingQueue<Message> queue) {
		this.queue = queue;
	}
	
	@Override
	public void run() {
		// produce messages
		
		for(int i=1; i<=10; i++) {
			Message msg = new Message(" " + i);
			try {
				Thread.sleep(5000);
				queue.put(msg);
				
				System.out.println("Produced: " + msg.getMessage());
			}
			catch(InterruptedException ex) {
				ex.printStackTrace();
			}
		}
		
		Message msg = new Message("exit");
		
		try {
			queue.put(msg);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
