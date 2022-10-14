package Valtechspring.orm;

import javax.persistence.Embeddable;


@Embeddable
public class BikeDetails {


	private int kms;
	private boolean validInsurance;
	private int numOfOwners;
	
	private BikeDetails bikeDetails;
	
	
	public BikeDetails getBikeDetails() {
		return bikeDetails;
	}



	public void setBikeDetails(BikeDetails bikeDetails) {
		this.bikeDetails = bikeDetails;
	}



	public BikeDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public BikeDetails(int kms, boolean validInsurance, int numOfOwners) {
		super();
		this.kms = kms;
		this.validInsurance = validInsurance;
		this.numOfOwners = numOfOwners;
	}



	public int getKms() {
		return kms;
	}
	public void setKms(int kms) {
		this.kms = kms;
	}
	public boolean isValidInsurance() {
		return validInsurance;
	}
	public void setValidInsurance(boolean validInsurance) {
		this.validInsurance = validInsurance;
	}
	public int getNumOfOwners() {
		return numOfOwners;
	}
	public void setNumOfOwners(int numOfOwners) {
		this.numOfOwners = numOfOwners;
	}



	@Override
	public String toString() {
		return "BikeDetails [kms=" + kms + ", validInsurance=" + validInsurance + ", numOfOwners=" + numOfOwners
				+ ", bikeDetails=" + bikeDetails + ", getBikeDetails()=" + getBikeDetails() + ", getKms()=" + getKms()
				+ ", isValidInsurance()=" + isValidInsurance() + ", getNumOfOwners()=" + getNumOfOwners() + "]";
	}
	
	
	
	
	
	
}
