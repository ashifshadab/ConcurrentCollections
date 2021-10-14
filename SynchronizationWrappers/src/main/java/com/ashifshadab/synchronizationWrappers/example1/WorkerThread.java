package com.ashifshadab.synchronizationWrappers.example1;

import java.util.Arrays;
import java.util.Collection;

public class WorkerThread implements Runnable {
	
	Collection<Integer> syncCollection;
	
	

	public WorkerThread(Collection<Integer> syncCollection) {
		super();
		this.syncCollection = syncCollection;
	}



	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		syncCollection.addAll(Arrays.asList(1, 2, 3, 4, 5, 6));
	}

}
