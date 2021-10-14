package com.ashifshadab.synchronizationWrappers.example2;

import java.util.List;

public class WorkerThread implements Runnable {

	List<String> syncCollection;

	List<String> uppercasedCollection;

	public WorkerThread(List<String> syncCollection, List<String> uppercasedCollection) {
		super();
		this.syncCollection = syncCollection;
		this.uppercasedCollection = uppercasedCollection;
	}

	@Override
	public void run() {

		System.out.println(Thread.currentThread().getName());
		synchronized (syncCollection) {
	        syncCollection.forEach((e) -> {
	            uppercasedCollection.add(e.toUpperCase());
	        });
	    }
		
		uppercasedCollection.stream().forEach(System.out::println);
		
	}

}
