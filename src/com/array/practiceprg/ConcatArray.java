package com.array.practiceprg;

import java.util.Arrays;

public class ConcatArray {

	public static void main(String[] args) {

		Concat();
	}

	private static void Concat() {

		int a[] = {10,20,30,40,50};
		int b[] = {60,70,80,90,100};
		int c[] = new int[a.length + b.length];
		int j = 0;
		for(int i=0;i<a.length;i++)
		{
			c[j] = a[i];
			j++;
		}
		for(int i=0;i<b.length;i++)
		{
			c[j] = b[i];
			j++;
		}
		System.out.println(Arrays.toString(c));
	}

}
