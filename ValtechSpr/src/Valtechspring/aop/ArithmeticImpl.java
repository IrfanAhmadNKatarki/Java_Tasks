package Valtechspring.aop;

public class ArithmeticImpl implements Arithmetic {

	
	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub

		return a+b;
		
	}
	
	@Override
	public int sub(int a, int b) {
		// TODO Auto-generated method stub

		return a-b;
		
	}	
	@Override
	public int mul(int a, int b) {
		// TODO Auto-generated method stub

		return a*b;
		
	}
	@Override
	public int div(int a, int b) {
		// TODO Auto-generated method stub

		return a/b;
		
	}

	@Override
	public int add(int... a) {
		// TODO Auto-generated method stub
		int result = 0;
		for(int i : a){
			result+=i;
		}
		
		return result;
	}

	@Override
	public int mul(int... a) {
		// TODO Auto-generated method stub
		
		int result = 1;
		for(int i : a){
			
			result*=i;
		}
		
		return result;
	}
}
