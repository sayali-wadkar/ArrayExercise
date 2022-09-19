package com.array.practiceprg;

import java.util.Arrays;

public class AssendingOrder {

	public static void main(String[] args) {

		assending();
		
		}

	private static void assending() {

		int a[] = {40,20,60,70,10};
		int b[] = new int [a.length];
		int c;
		System.out.println("before sorting array "+"\n" +Arrays.toString(a));
		for(int i=0;i<a.length;i++)
		{
			for(int j=i;j<a.length;j++)
			{
				if(a[i]>a[j]) {
					c = a[i];
					a[i] = a[j];
					a[j] =c;
				}
			}
		}
		System.out.println("After sorting array "+"\n"+Arrays.toString(a));
	}

}
