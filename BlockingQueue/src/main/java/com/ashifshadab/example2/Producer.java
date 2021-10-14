package com.ashifshadab.example2;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {

	private final BlockingQueue<Integer> queue;
	private final Integer conditionInteger;

	public Producer(BlockingQueue<Integer> queue, Integer conditionInteger) {
		super();
		this.queue = queue;
		this.conditionInteger = conditionInteger;
	}

	@Override
	public void run() {

		try {
			process();
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		} finally {
			while (true) {
				try {
					queue.put(conditionInteger);
					break;
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}

	}

	private void process() throws InterruptedException {

		// Put 20 elements into Queue
		for (int i = 0; i < 20; i++) {
			System.out.println("[Producer] Put : " + i);
			queue.put(i);
			System.out.println("[Producer] Queue remainingCapacity : " + queue.remainingCapacity());
			Thread.sleep(100);
		}

	}
	
	//https://javapapers.com/java/java-concurrent-collections/
	//http://tutorials.jenkov.com/java-util-concurrent/blockingqueue.html
	//https://mkyong.com/java/java-blockingqueue-examples/
	//https://docs.oracle.com/en/java/javase/16/docs/api/java.base/java/util/concurrent/BlockingQueue.html

}
