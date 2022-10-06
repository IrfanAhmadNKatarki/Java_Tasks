package com.valtech.proj.training.day5;

/*
@@Author: Irfan Ahmad


*/


import static org.junit.Assert.*;

import org.junit.Test;

public class phoneNumTest {

	@Test
	public void numbertest() {
		 phoneNum p =new phoneNum();
			long number=9999999965L;
			
			assertEquals(80,p.seqNum(number));
			assertEquals(true,p.checkNum(9876543210L));
			assertEquals(100,p.seqNum(9876543210L));
			assertEquals(70,p.seqNum(9999995394L));
			assertEquals(64,p.seqNum(6363707229L));
			assertEquals(18,p.seqNum(7676378569L));
			assertEquals(false,p.checkNum(12457896L));
			assertEquals(false,p.checkNum(123456789L));	
			assertEquals(100,p.seqNum(9999999999L));
			assertEquals(false,p.checkNum(1234567890L));
				
				
	}

}
