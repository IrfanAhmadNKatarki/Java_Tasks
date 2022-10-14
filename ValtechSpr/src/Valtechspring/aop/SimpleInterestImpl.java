package Valtechspring.aop;

public class SimpleInterestImpl implements SimpleInterest {

	private Arithmetic arithmetic;


	public void setArithmetic(Arithmetic arithmetic) {
		this.arithmetic = arithmetic;
	}


	public SimpleInterestImpl(){}
	
	
	public SimpleInterestImpl(Arithmetic arithmetic) {
		super();
		this.arithmetic = arithmetic;
	}


	@Override
	public int computeSimpleInterest(int principal, int time, int rateOfInterest){
		
		
		return arithmetic.div(arithmetic.mul(principal, time, rateOfInterest), 100);
	}
	
	
}
