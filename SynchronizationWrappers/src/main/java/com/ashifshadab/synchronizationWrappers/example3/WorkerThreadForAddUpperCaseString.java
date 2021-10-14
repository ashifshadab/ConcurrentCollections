package com.ashifshadab.synchronizationWrappers.example3;

public class WorkerThreadForAddUpperCaseString implements Runnable {

	Task task;

	public WorkerThreadForAddUpperCaseString(Task task) {
		super();
		this.task = task;
	}

	@Override
	public void run() {

		System.out.println("\n"+Thread.currentThread().getName()+" Got chance, going to add Upper Case String");
		task.addUpperCaseString();

	}

}
