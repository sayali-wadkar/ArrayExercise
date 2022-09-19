package com.array.practiceprg;

import java.util.Arrays;

public class AdditionOfArray {

	public static void main(String[] args) {

		addition();
	}

	private static void addition() {

		int a[] = {10,20,30,40,50};
		int b[] = {60,70,80,90,100};
		int c[] = new int[a.length];
		int j =0;
		
		for(int i=0;i<a.length;i++)
		{
			c[j] = a[i]+b[i];
			j++;
		}
		System.out.println(Arrays.toString(c));
		
	}

}
