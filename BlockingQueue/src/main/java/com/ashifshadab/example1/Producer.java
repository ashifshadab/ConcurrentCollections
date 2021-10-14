package com.ashifshadab.example1;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {

	private final BlockingQueue<Integer> queue;

	public Producer(BlockingQueue<Integer> queue) {
		super();
		this.queue = queue;
	}

	@Override
	public void run() {

		try {
			process();
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}

	}

	private void process() throws InterruptedException {

		// Put 20 ints into Queue
		for (int i = 0; i < 20; i++) {
			System.out.println("[Producer] Put : " + i);
			queue.put(i);
			System.out.println("[Producer] Queue remainingCapacity : " + queue.remainingCapacity());
			Thread.sleep(100);
		}

	}

}
