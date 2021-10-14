package com.ashifshadab.synchronizationWrappers.example3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task {

	List<String> dataList;

	public Task(List<String> dataList) {
		super();
		this.dataList = dataList;
	}

	List<String> normalList = new ArrayList<>();

	List<String> synchornizedList = Collections.synchronizedList(new ArrayList<>());
	
	private void sleep() {
		
		try {
			Thread.currentThread().sleep(2000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		
	}

	public void addLowerCaseString() {

		addLowerCasetToNormalList();

		addLowerCasetToSynList();

	}

	private void addLowerCasetToSynList() {
		
		System.out.println("\n" + Thread.currentThread().getName() + " is adding Lower Case String at sync list: ");
		
		sleep();
		
		dataList.stream().forEach(e -> {
			String lowerCaseString = e.toLowerCase();
			synchornizedList.add(lowerCaseString);
		});
	}

	

	private void addLowerCasetToNormalList() {
		
		System.out.println("\n" + Thread.currentThread().getName() + " is adding Lower Case String at Normal list: ");
		
		sleep();
		
		dataList.stream().forEach(e -> {
			String lowerCaseString = e.toLowerCase();
			normalList.add(lowerCaseString);
		});
	}

	public void addUpperCaseString() {

		addUpperCaseNormalList();

		addUpperCaseSynList();

	}

	private void addUpperCaseSynList() {
		
		System.out.println("\n" + Thread.currentThread().getName() + " is adding Upper Case String at Sync List: ");
		
		sleep();
		
		dataList.stream().forEach(e -> {
			String upperCaseString = e.toUpperCase();
			synchornizedList.add(upperCaseString);
		});
	}

	private void addUpperCaseNormalList() {
		
		System.out.println("\n" + Thread.currentThread().getName() + " is adding Upper Case String at normal List: ");
		
		sleep();
		
		dataList.stream().forEach(e -> {
			String upperCaseString = e.toUpperCase();
			normalList.add(upperCaseString);
		});
	}

	public void removeString() {

		System.out.println("\n" + Thread.currentThread().getName() + " is removeString string : ");
		
		sleep();
		
		int normalListSize = normalList.size();

		if (normalListSize > 3) {
			normalList.remove(normalListSize - 1);
		}

		int synchornizedListSize = synchornizedList.size();

		if (synchornizedListSize > 3) {
			normalList.remove(synchornizedListSize - 1);
		}

	}

	

	public void print() {
		
		sleep();

		System.out.println("\n" + Thread.currentThread().getName() + " is Printing from normal list: ");
		
		normalList.stream().forEach(e -> System.out.println("Element of normalList:: " + e));

		System.out.println("\n" + Thread.currentThread().getName() + " is Printing sync list: ");
		
		synchornizedList.stream().forEach(e -> System.out.println("Element of synchronized list:: " + e));
	}
}
