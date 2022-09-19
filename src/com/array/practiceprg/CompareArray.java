package com.array.practiceprg;

import java.util.Arrays;

public class CompareArray {

	public static void main(String[] args) {

		compare();
	}

	public static void compare() {
		
		int a[]= {10,20,30,40,50};
		int b[]= {10,20,60,40,50};
		int count = 0;
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		
		if(a!=null && b!=null) {
			
			if(a.length == b.length) {
				
				for(int i=0;i<a.length;i++) {
					
					if(a[i]!=b[i]) {
						count++;
					}
				}

					if(count != 0) 
						System.out.println("both array not exact match : ");
					else
						System.out.println("both array exact match :");
						
			 }else
				System.out.println("Both of two arrays length is not equal");
			
		}else
			System.out.println("Array is null");
		
			
			
			
	}

}
