package com.example.demo.boot.entity;


	import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

	@Entity
	public class Publisher {
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private int id;
		private String name;
		private String address;
		private long phone;
//		@OneToMany(targetEntity=Book.class,cascade={CascadeType.MERGE, CascadeType.PERSIST},mappedBy="publisher")
//		@JoinTable(name="publisher_book",joinColumns=@JoinColumn(name="publisher_id",referencedColumnName="id"),inverseJoinColumns=@JoinColumn(name="Book_id",referencedColumnName="id"))
//		private Set<Book> book;
//		
		public Publisher() {
			super();
		}
		

		

		public String getAddress() {
			return address;
		}


		public void setAddress(String address) {
			this.address = address;
		}


		public long getPhone() {
			return phone;
		}


		public void setPhone(long phone) {
			this.phone = phone;
		}


		public Publisher(String name, String address, long phone) {
			super();
			this.name = name;
			this.address = address;
			this.phone = phone;
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


		
//		public Set<Book> getBook() {
//			return book;
//		}
//
//		public void setBook(Set<Book> book) {
//			this.book = book;
//		}
//
//		@Override
//		public String toString() {
//			return "Publisher [id=" + id + ", name=" + name + ", address=" + address + ", phone=" + phone + ", book=" + book
//					+ "]";
//		}
//
//




	

}
