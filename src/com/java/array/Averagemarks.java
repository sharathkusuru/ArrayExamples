package com.java.array;

public class Averagemarks {
	public static void main(String[] args) {
		int[] students = { 65, 85, 89, 79, 98, 98, 65, 76, 89, 99 };
		int sum = 0;
		for (int num : students) {
			sum += num;
		}
		int average = sum / students.length;
		System.out.println("the average of 10 studnets  :" + average);
	}
}