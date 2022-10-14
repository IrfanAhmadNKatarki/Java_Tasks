package Valtechspring.orm;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@DiscriminatorValue("atx")
public class Atmtx extends Tx {

	private int atm;
	private String location;
	public Atmtx() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Atmtx(float amount, int atm, String location) {
		super(amount);
		this.atm = atm;
		this.location = location;
	}
	public int getAtm() {
		return atm;
	}
	public void setAtm(int atm) {
		this.atm = atm;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "Atmtx [atm=" + atm + ", location=" + location + ", getAtm()=" + getAtm() + ", getLocation()="
				+ getLocation() + ", getId()=" + getId() + ", getAmount()=" + getAmount() + "]";
	}
	
	
	
	
	
}
