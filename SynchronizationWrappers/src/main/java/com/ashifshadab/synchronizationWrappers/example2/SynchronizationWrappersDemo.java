package com.ashifshadab.synchronizationWrappers.example2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SynchronizationWrappersDemo {

	public static void main(String[] args) {

		List<String> syncCollection = Collections.synchronizedList(Arrays.asList("a", "b", "c"));
		List<String> uppercasedCollection = new ArrayList<>();
		
		Thread firstThread =new Thread(new WorkerThread(syncCollection, uppercasedCollection));
		
		Thread secondThread =new Thread(new WorkerThread(syncCollection, uppercasedCollection));
		
		firstThread.start();
		
		secondThread.start();

	}

}
