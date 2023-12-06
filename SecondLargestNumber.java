package JavaBasics;

import java.util.Arrays;
import java.util.Scanner;

public class SecondLargestNumber {
	 public static void main(String[] args)
	  {
		 int t,size;
		 int arr[]= {100,200,400,40};
		 size=arr.length;
		 for(int i=0;i<size;i++) {
			 for (int j=i+1;j<size;j++) {
				 if(arr[i]>arr[j]) {
					 t=arr[i];
					 arr[i]=arr[j];
					 arr[j]=t;
					 
				 }
			 }
		 }
		 System.out.println("Second largest number: "+arr[size-2]);
	  }
	    }
		

