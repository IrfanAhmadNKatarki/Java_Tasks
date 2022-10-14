package Valtechspring.orm;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity   // U can use it wherever u want
//@Table(name="myCars")
public class Bike {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE) // For Oracle user sequence
	private int id;
	private String make;
	private String model;
	private String color;
	private int yearManufactured;
	private float price;
	@Version
	private int version;
	@Embedded
	private BikeDetails bikeDetails;
	
	


	public BikeDetails getBikeDetails() {
		return bikeDetails;
	}


	public void setBikeDetails(BikeDetails bikeDetails) {
		this.bikeDetails = bikeDetails;
	}


	public Bike() {
		super();
	}
	
	
	public Bike(int id, String make, String model, String color, int yearManufactured, float price, BikeDetails bikedetails) {
		super();
		this.id = id;
		this.make = make;
		this.model = model;
		this.color = color;
		this.yearManufactured = yearManufactured;
		this.price = price;
		this.bikeDetails = bikedetails;
	}


	public Bike(String make, String model, String color, int yearManufactured, float price, BikeDetails bikedetails) {
		super();
		this.make = make;
		this.model = model;
		this.color = color;
		this.yearManufactured = yearManufactured;
		this.price = price;
		this.bikeDetails = bikedetails;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getYearManufactured() {
		return yearManufactured;
	}
	public void setYearManufactured(int yearManufactured) {
		this.yearManufactured = yearManufactured;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getVersion() {
		return version;
	}


	public void setVersion(int version) {
		this.version = version;
	}
	
}
