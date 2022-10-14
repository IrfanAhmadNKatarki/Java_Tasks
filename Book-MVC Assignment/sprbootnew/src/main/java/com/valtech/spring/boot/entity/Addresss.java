package com.valtech.spring.boot.entity;


	import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

	@Entity
	public class Addresss {
		@Id
		@GeneratedValue(strategy=GenerationType.SEQUENCE)
		private int id;
		private String city;
		private String state;
		private int zipcode;
		//@OneToOne(targetEntity=Author.class,cascade={CascadeType.MERGE,CascadeType.PERSIST})
//		@JoinColumn(name="aid",referencedColumnName="id")
//		private Author author;
		public Addresss() {
			super();
		}
		public Addresss(String city, String state, int zipcode) {
			super();
			this.city = city;
			this.state = state;
			this.zipcode = zipcode;
		
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public String getState() {
			return state;
		}
		public void setState(String state) {
			this.state = state;
		}
		public int getZipcode() {
			return zipcode;
		}
		public void setZipcode(int zipcode) {
			this.zipcode = zipcode;
		}
//		public Author getAuthor() {
//			return author;
//		}
//		public void setAuthor(Author author) {
//			this.author = author;
//		}
		@Override
		public String toString() {
			return "Addresss [id=" + id + ", city=" + city + ", state=" + state + ", zipcode=" + zipcode + "]";
		}
		

	

}
