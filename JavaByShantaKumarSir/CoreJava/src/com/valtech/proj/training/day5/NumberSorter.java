package com.valtech.proj.training.day5;

/*
@@Author: Irfan Ahmad


*/


import java.util.Comparator;

public class NumberSorter implements Comparator<Integer>{
	
	private boolean isOdd(int a) {
		return Math.abs(a)%2==1;
	}

	@Override
	public int compare(Integer i1, Integer i2) {
		boolean b1=isOdd(i1);
		boolean b2=isOdd(i2);
		
		if(b1&&b2) {
			if(i1<i2) return -1;
			if(i1==i2) return 0;
			return +1;
	
		}
		
		if(!b1&&!b2) {
			return i2-i1;
		}
		if(b1) {
			return -1;
		}
		return +1;
	//	return i1.compareTo(i2);
	}


}
