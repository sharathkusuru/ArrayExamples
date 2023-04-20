package com.java.array;

public class Assendingorder {
	public static void main(String[] args) {
		int[] arr = { 6, 9, 5, 7, 3, 2 };
		int temp = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("array sorted in assending order:");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + "");
		}
	}

}
