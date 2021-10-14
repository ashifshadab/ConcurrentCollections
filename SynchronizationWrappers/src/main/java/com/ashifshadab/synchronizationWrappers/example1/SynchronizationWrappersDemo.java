package com.ashifshadab.synchronizationWrappers.example1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/** synchronizedCollection() Method**/
public class SynchronizationWrappersDemo {

	public static void main(String[] args) throws InterruptedException {

		Collection<Integer> syncCollection = Collections.synchronizedCollection(new ArrayList<>());
		
		
		Thread firstThread = new Thread(new WorkerThread(syncCollection));
		
		Thread secondThread = new Thread(new WorkerThread(syncCollection));
		
		firstThread.start();
		
		secondThread.start();
		
		firstThread.join();
		secondThread.join();
		
		System.out.println(syncCollection.size());

	}

}
