package com.java.array;

public class Transposematrix {
	public static void main(String[] args) {
		int num[][] = { { 1, 3, 4 }, { 2, 4, 3 }, { 3, 4, 5 } };
		int transpose[][] = new int[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				transpose[i][j] = num[j][i];
			}
		}
		System.out.println("after transponse matrix :");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println(transpose[i][j]);
			}
			System.out.println();

		}
	}

}
