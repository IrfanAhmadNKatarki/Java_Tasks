package Valtechspring.client;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import Valtechspring.orm.Address_Book;
import Valtechspring.orm.Article;
import Valtechspring.orm.Author;
import Valtechspring.orm.Blog;
import Valtechspring.orm.Book;
import Valtechspring.orm.HardBook;
import Valtechspring.orm.Publisher;

public class HibernateClient2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sf = new AnnotationConfiguration()
				.configure() 
				.addAnnotatedClass(Author.class).addAnnotatedClass(Book.class)
				.addAnnotatedClass(Address_Book.class).addAnnotatedClass(Publisher.class)
				.addAnnotatedClass(Blog.class).addAnnotatedClass(HardBook.class)
				.addAnnotatedClass(Article.class)
				.buildSessionFactory();  // not possible to add another class now // Dont create two session factoy
	
				Session ses = sf.openSession();
				Transaction tx = ses.beginTransaction();
				
				
			Valtechspring.orm.Book b1 = new Valtechspring.orm.Book("Irfan", 1);
			ses.save(b1);
			
			   Article a=new Article("www.google.com");
		        HardBook h=new HardBook(null, 23,500,2);
		        Blog bl=new Blog("www.java.com",4);
		        Address_Book ad=new Address_Book("banglore","karnataka",null, 572106);
		        Author au=new Author("irfan",9876534212L);
		        HardBook hb = new HardBook("Irfan",20);
				
				
				ses.save(a);
				ses.save(h);
				ses.save(b1);
				ses.save(ad);
				ses.save(au);
				
				tx.commit(); // We can call roll back also depending upon the situation
				ses.close();
				sf.close();
				
				
		
		

	}

}
