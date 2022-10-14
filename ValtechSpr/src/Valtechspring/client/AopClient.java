package Valtechspring.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Valtechspring.aop.Arithmetic;
import Valtechspring.aop.SimpleInterest;
import Valtechspring.aop.SimpleInterestImpl;

public class AopClient {
	public static void main(String[] args) {
		ApplicationContext appCtx = new ClassPathXmlApplicationContext("aop.xml");
		SimpleInterest si = (SimpleInterest) appCtx.getBean("si");
		System.out.println(si.computeSimpleInterest(2000, 3, 1));
		Arithmetic arithmetic = (Arithmetic) appCtx.getBean("arithmetic");
		System.out.println("Arithmetic class "+arithmetic.getClass().getName());
		arithmetic.add(2,3);
		arithmetic.add(5,9);
		arithmetic.sub(5,3);
		arithmetic.mul(3,20);
		System.out.println("-2 + 3 = " +arithmetic.add(-2,-3)); 
		System.out.println("-2 -2 = " +arithmetic.sub(-2,-3));
		arithmetic.div(3, 0);
		
	}
}
