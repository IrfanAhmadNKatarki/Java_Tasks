package com.valtech.spring.boot.entity;


	import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

	@Entity
	public class Author {
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private int id;
		private String name;
		private long phone;
//		@ManyToMany(targetEntity=Book.class,cascade={CascadeType.MERGE,CascadeType.PERSIST})
//		@JoinColumn(name="author_id",referencedColumnName="id")
//		private Set<Book> book;
//		@OneToOne(targetEntity=Addresss.class,cascade={CascadeType.MERGE,CascadeType.PERSIST},mappedBy="author")
//		private Addresss address;
		
		public Author() {
			super();
		}
		public Author(String name, long phone) {
			super();
			this.name = name;
			this.phone = phone;
			
		}
		
//		public Set<Book> getBook() {
//			return book;
//		}
//		public void setBook(Set<Book> book) {
//			this.book = book;
//		}
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
		public long getPhone() {
			return phone;
		}
		public void setPhone(long phone) {
			this.phone = phone;
		}
//		public Addresss getAddress() {
//			return address;
//		}
//		public void setAddress(Addresss address) {
//			this.address = address;
//		}
//		@Override
//		public String toString() {
//			return "Author [id=" + id + ", name=" + name + ", phone=" + phone + ", address=" + address + ", book=" + book
//					+ "]";
//		}
//		
	

}
