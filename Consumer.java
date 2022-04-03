package com.anudip.concurrent;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {
	private BlockingQueue<Message> queue;
	
	public Consumer(BlockingQueue<Message> queue) {
		this.queue = queue;
	}
	
	@Override
	public void run() {
		try {
			Message msg;
			
			while((msg = queue.take()).getMessage() != "exit") {
				Thread.sleep(5000);
				System.out.println("Consumed: " + msg.getMessage());
			}
		}
		catch(InterruptedException ex) {
			ex.printStackTrace();
		}
	}
}
