package com.java.array;

public class Sumofdiagnoal {
	public static void main(String[] args) {

		int i, sum = 0;

		int[][] a = { { 15, 25, 35 }, { 45, 55, 65 }, { 75, 85, 95 } };

		for (i = 0; i < a.length; i++) {
			sum = sum + a[i][i];
		}
		System.out.println("\nThe Sum of the Diagonal Items = " + sum);

	}

}
