package Valtechspring.aop;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class LogAfterAdvice implements AfterReturningAdvice {

	@Override
	public void afterReturning(Object retValue, Method method, Object[] args, Object target) throws Throwable {
		// TODO Auto-generated method stub
		
		System.out.println("Exiting "+method.getName()+ "Without Any Exceptions");
		
	}

	
	
}
