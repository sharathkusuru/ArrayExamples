package com.java.array;

public class Smallestandlargestnumber {
	public static void main(String[] args) {
		int[] num = { 67, 99, 54, 78, 34, 23 };
		int smallest = num[0];
		int largest = num[0];
		for (int i = 1; i < num.length; i++) {
			if (num[i] > largest)
				largest = num[i];
			else if (num[i] < smallest)
				smallest = num[i];
		}
		System.out.println("laregst number is :" + largest);
		System.out.println("smallest number is :" + smallest);
	}

}
