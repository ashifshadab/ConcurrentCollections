package com.ashifshadab.example2;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class BlockingQueueDemo {

	public static void main(String[] args) {

		BlockingQueue<Integer> queue = new LinkedBlockingQueue<>(10);
		
		Integer conditionInteger= -1;


		new Thread(new Producer(queue, conditionInteger)).start();
        new Thread(new Producer(queue, conditionInteger)).start();

        new Thread(new Consumer(queue, conditionInteger)).start();
        new Thread(new Consumer(queue, conditionInteger)).start();

	}

}
