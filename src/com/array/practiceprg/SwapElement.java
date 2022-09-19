package com.array.practiceprg;

import java.util.Arrays;
import java.util.Scanner;

public class SwapElement {

	public static void main(String[] args) {

		swap();
	}

	public static void swap() {
		
		int a[]= {10,20,30,40,50};
		System.out.println(Arrays.toString(a));
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two index which is swap ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		if(num1>0 && num1<a.length && num2>0 && num2<a.length) {
		int s =0;
		
		s = a[num1];
		a[num1] = a[num2];
		a[num2] = s;
		
		System.out.println(Arrays.toString(a));
		}
		else
			System.out.println("Index is not present");
	}
}


