package com.java.array;

public class Serchitemindex {
	public static void main(String[] args) {
		int a[] = { 25, 30, 45, 50, 60 };
		int item = 45;
		int index = -1;

		for (int i = 0; i < a.length; i++) {
			if (a[i] == item) {
				index = i;
				break;
			}
		}
		System.out.println("45 is located at " + index + " index");
	}

}
