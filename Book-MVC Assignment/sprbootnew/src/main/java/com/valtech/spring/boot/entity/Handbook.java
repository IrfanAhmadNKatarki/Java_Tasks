package com.example.demo.boot.entity;


	import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

	@Entity
	@DiscriminatorValue("Hbook")
	public class Handbook extends Book{
		
		private int isbn;
		private float price;
		private int editions;
		public Handbook() {
			super();
		}
		public Handbook(String name, int whenPublishing, int isbn, float price, int editions) {
			super(name, whenPublishing);
			this.isbn = isbn;
			this.price = price;
			this.editions = editions;
		}
		
		public Handbook(int isbn, float price, int editions) {
			super();
			this.isbn = isbn;
			this.price = price;
			this.editions = editions;
		}
		public int getIsbn() {
			return isbn;
		}
		public void setIsbn(int isbn) {
			this.isbn = isbn;
		}
		public float getPrice() {
			return price;
		}
		public void setPrice(float price) {
			this.price = price;
		}
		public int getEditions() {
			return editions;
		}
		public void setEditions(int editions) {
			this.editions = editions;
		}
		@Override
		public String toString() {
			return "Handbook [isbn=" + isbn + ", price=" + price + ", editions=" + editions + ", getId()=" + getId()
					+ ", getName()=" + getName() + ", getWhenPublishing()=" + getWhenPublishing() + "]";
		}
		
	

}
