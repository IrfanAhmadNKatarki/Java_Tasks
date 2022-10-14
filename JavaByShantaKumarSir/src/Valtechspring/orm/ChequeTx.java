package Valtechspring.orm;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("ctx")
public class ChequeTx extends Tx {

	private int chequeNo;
	private boolean outstation;
	private float collectionCharges;
	public ChequeTx() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ChequeTx(float amount, int chequeNo, boolean b, float collectionCharges) {
		super(amount);
		this.chequeNo = chequeNo;
		this.outstation = outstation;
		this.collectionCharges = collectionCharges;
	}
	public int getChequeNo() {
		return chequeNo;
	}
	public void setChequeNo(int chequeNo) {
		this.chequeNo = chequeNo;
	}
	public boolean getOutstation() {
		return outstation;
	}
	public void setOutstation(boolean outstation) {
		this.outstation = outstation;
	}
	public float getCollectionCharges() {
		return collectionCharges;
	}
	public void setCollectionCharges(float collectionCharges) {
		this.collectionCharges = collectionCharges;
	}
	
	
	
	
}
