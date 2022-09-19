package com.array.practiceprg;

import java.util.Arrays;

public class RemoveDuplicateEle {

	public static void main(String[] args) {

		duplicate();
	}

	private static void duplicate() {

		int a[] = { 1, 2, 3, 4, 5, 5, 1 };
		int b[] = new int[a.length];
		int s = 0;
		System.out.println(Arrays.toString(a));

		for (int j = 0; j < a.length; j++) {
			int c = 0;
			for (int i = j + 1; i < a.length; i++) {
				if (a[j] == a[i])
					c++;
			}
			if (c < 1) {
				b[s] = a[j];
				s++;
			}
		}
		int k[] = new int[s];
		for (int i = 0; i < k.length; i++) {
			k[i] = b[i];
		}
		System.out.println(Arrays.toString(k));

	}
}
