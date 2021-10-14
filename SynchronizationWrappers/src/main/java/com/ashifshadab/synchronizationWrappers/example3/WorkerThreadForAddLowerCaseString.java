package com.ashifshadab.synchronizationWrappers.example3;

public class WorkerThreadForAddLowerCaseString implements Runnable {

	Task task;

	public WorkerThreadForAddLowerCaseString(Task task) {
		super();
		this.task = task;
	}

	@Override
	public void run() {

		System.out.println("\n"+Thread.currentThread().getName()+" Got chance, going to add Lower Case String");
		task.addLowerCaseString();

	}

}
