package com.ashifshadab.synchronizationWrappers.example4;

import java.util.ArrayList;
import java.util.Iterator;

public class SynchronizationWrappersDemo extends Thread {

	static ArrayList arrayList = new ArrayList();

	public static void main(String[] args) throws InterruptedException {

		arrayList.add("A");
		arrayList.add("B");
		arrayList.add("c");
		
		// We create a child thread that is
        // going to modify ArrayList l.
		SynchronizationWrappersDemo synchronizationWrappersDemo = new SynchronizationWrappersDemo();
		synchronizationWrappersDemo.start();
		
		Iterator itr = arrayList.iterator();
        while (itr.hasNext()) {
            String s = (String)itr.next();
            System.out.println(s);
            Thread.sleep(6000);
        }
        System.out.println(arrayList);
	}

	public void run() {
	
		extracted(2000);

		// Child thread trying to add new element in the Collection object
		arrayList.add("D");
	}

	private void extracted(long millis) {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			System.out.println("Child Thread" + " going to add element");
		}
	}

	

}
