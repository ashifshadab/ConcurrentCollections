package com.ashifshadab.synchronizationWrappers.example3;

public class WorkerThreadForPrintString implements Runnable {

	Task task;

	public WorkerThreadForPrintString(Task task) {
		super();
		this.task = task;
	}

	@Override
	public void run() {

		System.out.println("\n"+Thread.currentThread().getName()+" Got chance, going to Print String");
		task.print();

	}

}
