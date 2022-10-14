package Valtechspring.orm;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
@Entity

public class Author {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int id;
	private String name;
	private long phoneNumber;

	
	@OneToOne(targetEntity = Address_Book.class, cascade = { CascadeType.MERGE,
			CascadeType.PERSIST }, mappedBy = "author")
	private Address_Book address_book;
	
    @ManyToMany(targetEntity=Book.class,cascade={CascadeType.MERGE,CascadeType.PERSIST})
    @JoinColumn(name="author_id",referencedColumnName="id")
    private Set<Book> book;
	
    
	
	public Author(String name, long phoneNumber) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
		
	}
	public Address_Book getAddress_book() {
		return address_book;
	}
	public void setAddress_book(Address_Book address_book) {
		this.address_book = address_book;
	}
	public Set<Book> getBook() {
		return book;
	}
	public void setBook(Set<Book> book) {
		this.book = book;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
	@Override
	public String toString() {
		return "Author [id=" + id + ", name=" + name + ", phoneNumber=" + phoneNumber + ", address_book=" + address_book
				+ ", book=" + book + "]";
	}
	
}
