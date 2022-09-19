package com.array.practiceprg;

public class AverageArray {

	public static void main(String[] args) {

		average();
	}

	public static void average() {

		int a[] = { 10, 20, 30, 40, 50 };
		int sum = 0;
		double avg;
		for (int i = 0; i < a.length; i++)
			sum = sum + a[i];
		avg = sum / a.length;

		System.out.println("Average of Given Array is => "+avg);

	}
}