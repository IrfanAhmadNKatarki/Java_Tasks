package Valtechspring.orm;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
//@Inheritance(strategy=InheritanceType.JOINED)
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@Table(name="Alllbooks")
@DiscriminatorColumn(name="disc")
@DiscriminatorValue("tx")
public class Book {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE) 
	private int id;
	private String name;
	private int whenPublished;
	@ManyToOne(targetEntity=Publisher.class,cascade={CascadeType.PERSIST},fetch=FetchType.EAGER)
	@JoinColumn(name="publisher_id",referencedColumnName="id")
	private Publisher publisher;
	
	@ManyToMany(targetEntity = Author.class, cascade = { CascadeType.MERGE,
            CascadeType.PERSIST }, mappedBy="book")
    @JoinTable(name="book_author",joinColumns = @JoinColumn(name="book_id",referencedColumnName="id"), inverseJoinColumns = @JoinColumn(name="author_id",referencedColumnName="id"))
	private Set<Author> author;
	

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(String name, int whenPublished) {
		super();
		this.name = name;
	
		this.whenPublished = whenPublished;
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

	public int getWhenPublished() {
		return whenPublished;
	}
	public void setWhenPublished(int whenPublished) {
		this.whenPublished = whenPublished;
	}
	
	public Publisher getPublisher() {
		return publisher;
	}
	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}
	public Set<Author> getAuthors() {
		return author;
	}
	public void setAuthors(Set<Author> authors) {
		this.author = authors;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", whenPublished=" + whenPublished + ", publisher=" + publisher
				+ ", authors=" + author + "]";
	}
	
	
	

}
