package com.java.array;

public class Identicalmatrix {
	public static void main(String[] args) {
		int A[][] = { { 7, 9, 2 }, { 3, 8, 6 }, { 1, 4, 2 } };
		int B[][] = { { 7, 9, 2 }, { 3, 8, 6 }, { 1, 4, 2 } };
		int C = 1;
		int n = 3;
		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++)
				if (A[i][j] != B[i][j])
					C = 0;
		if (C == 1)
			System.out.print("Both the matrices are identical");
		else
			System.out.print("Both the matrices are not identical");
	}

}
