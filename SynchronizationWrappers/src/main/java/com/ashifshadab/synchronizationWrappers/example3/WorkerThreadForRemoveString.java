package com.ashifshadab.synchronizationWrappers.example3;

public class WorkerThreadForRemoveString implements Runnable {

	Task task;

	public WorkerThreadForRemoveString(Task task) {
		super();
		this.task = task;
	}

	@Override
	public void run() {

		System.out.println("\n"+Thread.currentThread().getName()+" Got chance, going to Remove String");
		task.removeString();

	}

}
