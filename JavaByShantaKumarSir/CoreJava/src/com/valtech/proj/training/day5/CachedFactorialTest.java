package com.valtech.proj.training.day5;

/*
@@Author: Irfan Ahmad


*/

import static org.junit.Assert.*;

import org.junit.Test;

public class CachedFactorialTest {

	@Test
	public void test() {
		CachedFactorial cf=new CachedFactorial();
		assertEquals(120, cf.factorial(5));
		assertEquals(720, cf.factorial(6));
	}

}
