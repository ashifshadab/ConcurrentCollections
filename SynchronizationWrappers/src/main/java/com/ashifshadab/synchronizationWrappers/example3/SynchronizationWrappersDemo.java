package com.ashifshadab.synchronizationWrappers.example3;

import java.util.ArrayList;
import java.util.List;

public class SynchronizationWrappersDemo {

	public static void main(String[] args) {

		List<String> dataList = getList();

		Task task = new Task(dataList);

		new Thread(new WorkerThreadForAddLowerCaseString(task)).start();

		new Thread(new WorkerThreadForAddUpperCaseString(task)).start();

		new Thread(new WorkerThreadForRemoveString(task)).start();

		new Thread(new WorkerThreadForPrintString(task)).start();

	}

	public static List<String> getList() {

		List<String> dataList = new ArrayList<>();

		dataList.add("sUnday");
		dataList.add("Monday");
		dataList.add("TuesDay");
		dataList.add("WednessDay");
		dataList.add("Thursday");
		dataList.add("FridaY");
		dataList.add("SAturday");
		dataList.add("JanuarY");
		dataList.add("FeB");
		dataList.add("Mar");
		dataList.add("Apri");
		dataList.add("maY");
		dataList.add("jUn");
		dataList.add("Jul");
		dataList.add("Aug");

		return dataList;
	}

}
