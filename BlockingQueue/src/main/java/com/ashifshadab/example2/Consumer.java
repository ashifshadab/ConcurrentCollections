package com.ashifshadab.example2;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {

	private final BlockingQueue<Integer> queue;
	private final Integer conditionInteger;

	public Consumer(BlockingQueue<Integer> queue, Integer conditionInteger) {
		super();
		this.queue = queue;
		this.conditionInteger = conditionInteger;
	}

	@Override
	public void run() {

		try {
			while (true) {
				Integer take = queue.take();
				process(take);

				// if this is a poison pill, break, exit
				if (take == conditionInteger) {
					break;
				}

			}
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
	}

	private void process(Integer take) throws InterruptedException {
		System.out.println("[Consumer] Take : " + take);
		Thread.sleep(500);
	}

}
