package com.array.practiceprg;

import java.util.Arrays;

public class RemoveDuplicateEle {

	public static void main(String[] args) {

		duplicate();
	}

	private static void duplicate() {

		    int a[] = {1,2,3,4,5,5,1};
		    int c=0;
		    
		    for(int i=0;i<a.length;i++)
		    {
		    	for(int j=i+1;j<a.length;j++)
		    	{
		    		if(a[i]>a[j]) {
		    		 c=a[i];
		    		a[i]=a[j];
		    		a[j]=c;
		    		}
		    	}
		    }
		    System.out.println("sorted array :" +"\n"+Arrays.toString(a));
		    System.out.println("After removed duplicte elements : ");
		    int j = 0;
		    for (int i = 0; i < a.length - 1; i++) {
		        if (a[i] != a[i + 1]) {
		            a[j] = a[i];
		            j++;
		        }
		    }
		    a[j] = a[a.length - 1];
		    for (int i = 0; i <= j; i++) {
		        System.out.println(a[i]);
		    }
//		    System.out.println("duplicte elements :");

		
		
	}

}
