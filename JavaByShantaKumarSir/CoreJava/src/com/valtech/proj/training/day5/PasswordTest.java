package com.valtech.proj.training.day5;
/*
@@Author: Irfan Ahmad


*/



import static org.junit.Assert.*;

import org.junit.Test;

public class PasswordTest {
	

	@Test
	public void lowertest() {
	PasswordGenerator lwr=new PasswordGenerator();
	assertEquals(true, lwr.lower("abcdefgh"));
	
	}
	@Test
	public void uppertest() {
	PasswordGenerator upr=new PasswordGenerator();
	assertEquals(true, upr.upper("ABCDEFGH"));
	
	}
	@Test
	public void digittest() {
	PasswordGenerator dig=new PasswordGenerator();
	assertEquals(true, dig.digit("12345"));
	
	}
	@Test
	public void specialcharacterTest() {
		PasswordGenerator spc=new PasswordGenerator();
		assertEquals(true, spc.specialCharacter("!@#$%&*"));
	}
	
	

}
