package com.array.practiceprg;

import java.util.Arrays;
import java.util.Scanner;

public class HighestElement {

	public static void main(String[] args) {

		highest();
	}

	private static void highest() {

		Scanner sc = new Scanner(System.in);

		int[] a = {110,99,56,77,83,90};
		int count;
		System.out.println("Enter Which Highest Number you want ==> ");
		int index = sc.nextInt();
		if (index >= 0 && index < a.length) {

			for (int i = 0; i < a.length; i++) {
				for (int j = i+1; j < a.length; j++) {
					if (a[i] > a[j]) {
						count = a[i];
						a[i] = a[j];
						a[j] = count;
					}
				}
			}
			System.out.println(Arrays.toString(a));
			System.out.println(index + " Highest Element is ==> " + a[a.length-index]);
		} else
			System.out.println(index + " Index not Present in Array");
	}
}


