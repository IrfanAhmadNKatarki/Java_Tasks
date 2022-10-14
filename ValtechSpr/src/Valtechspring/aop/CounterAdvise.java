package Valtechspring.aop;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.jdbc.core.metadata.GenericTableMetaDataProvider;

public class CounterAdvise implements MethodBeforeAdvice {

	private Map<String, Integer> counters = new HashMap<>();
	
	
	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		// TODO Auto-generated method stub
		
	String name = method.getName();	
	if(counters.containsKey(name)){
		
		counters.put(name, counters.get(name)+1);
		
	}
	else{
		
		counters.put(name,1);
	}
		System.out.println(counters);
		
	}

	
	
}
