package com.valtech.proj.training.day5;
import java.util.*;

/*
@@Author: Irfan Ahmad


*/

public class CachedFactorial {
	static List<Long> fact=new ArrayList<>();
	public static long factorial(int n) {
	if(fact.size()>=n ){
		System.out.println("system running on cache..");
		return fact.get(n-1);
	}
	if(n==1) {
		fact.add(1L);
		return 1;
	}
	long fact1=factorial(n-1);
	long factn=n*fact1;
	fact.add(factn);
	return factn;
	
	}
}
