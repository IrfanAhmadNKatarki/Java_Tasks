package com.valtech.proj.training.day5;
import java.util.*;


/*
@@Author: Irfan Ahmad


*/

public class factorial {
	

	public static long factorial( long n) {
		
		if (n==0||n == 1) {
			return 1;
		}
		else { 
			return n*factorial(n-1);
		
		}
	}
	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		long n=sc.nextLong();

		System.out.println(factorial(n));
	}
//
//	public static void main(String[] args) {
//		System.out.println("Enter the number");
//		Scanner sc=new Scanner(System.in);
//		long n=sc.nextLong();
//		long fact=1;
//		for(long i=1;i<=n;i++) {
//			fact=fact*i;
//		}
//		System.out.println(fact);
//		
//	}

}
