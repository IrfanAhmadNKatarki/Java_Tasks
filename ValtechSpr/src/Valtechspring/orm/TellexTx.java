package Valtechspring.orm;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("ttx")
public class TellexTx extends Tx {

	
	private String teller;
	private String branch;
	public TellexTx() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public TellexTx(float amount, String teller, String branch) {
		super(amount);
		this.teller = teller;
		this.branch = branch;
	}

	public String getTeller() {
		return teller;
	}

	public void setTeller(String teller) {
		this.teller = teller;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	@Override
	public String toString() {
		return "TellexTx [teller=" + teller + ", branch=" + branch + ", getTeller()=" + getTeller() + ", getBranch()="
				+ getBranch() + ", getId()=" + getId() + ", getAmount()=" + getAmount() + "]";
	}
	
	

	
	
	
	
	
}