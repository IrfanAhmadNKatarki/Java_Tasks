package Valtechspring.orm;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("hardbook")
public class HardBook extends Book {

	
	private String isbn;
	private int price;
	private int publishedYear;
	private float edition;
	
	public HardBook( String name,  int whenPublished, String isbn2, int price2,
			int publishedYear, float edition) {
		super( name, whenPublished);
		
		this.publishedYear = publishedYear;
		this.edition = edition;
	}
	
	




	public HardBook() {
		super();
		// TODO Auto-generated constructor stub
	}






	public HardBook(String name, int whenPublished) {
		super(name, whenPublished);
		// TODO Auto-generated constructor stub
	}






	public HardBook(String isbn, int price, int publishedYear, float edition) {
		super();
		this.isbn = isbn;
		this.price = price;
		this.publishedYear = publishedYear;
		this.edition = edition;
	}






	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getPublishedYear() {
		return publishedYear;
	}

	public void setPublishedYear(int publishedYear) {
		this.publishedYear = publishedYear;
	}

	public float getEdition() {
		return edition;
	}

	public void setEdition(float edition) {
		this.edition = edition;
	}

	
	
	
 
	
	

}
