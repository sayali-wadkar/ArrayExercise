package com.array.practiceprg;

import java.util.Arrays;
import java.util.Scanner;

public class DessendingArray {

	public static void main(String[] args) {

		dessending();
	}

	private static void dessending() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter index which is lowest element :");
		int num = sc.nextInt();
		int a[] = {24,45,34,30,10};
		int s;
		if(num >0 && num<a.length) {
		for(int i =0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					s=a[i];
					a[i]=a[j];
					a[j]=s;
				}
			}
		}
		System.out.println(Arrays.toString(a));
		System.out.println(num +" of lowest element : "+a[a.length-num]);	
	}else
		System.out.println("value is not present");
}
}