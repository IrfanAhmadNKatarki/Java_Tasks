package Valtechspring.client;

import java.time.LocalDate;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import Valtechspring.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

import com.sun.jndi.cosnaming.IiopUrl.Address;

import Valtechspring.orm.Account;
import Valtechspring.orm.Addresss;
import Valtechspring.orm.Atmtx;
import Valtechspring.orm.BankAccounts;
import Valtechspring.orm.BankAccountsId;
import Valtechspring.orm.Bike;
import Valtechspring.orm.BikeDetails;
import Valtechspring.orm.ChequeTx;
import Valtechspring.orm.Customers;
import Valtechspring.orm.TellexTx;
import Valtechspring.orm.Tx;
import Valtechspring.orm.dao.CustomerDAO;
import Valtechspring.orm.dao.CustomerDAOimpl;

public class Hibernateclient {

	public static void main(String[] args) {
//		SessionFactory sf = new Configuration()
		SessionFactory sf = new AnnotationConfiguration()
				.configure() 
//				.addClass(Bike.class)
				.addAnnotatedClass(Bike.class)
				.addAnnotatedClass(BankAccounts.class)
				.addAnnotatedClass(Tx.class).addAnnotatedClass(TellexTx.class)
				.addAnnotatedClass(Atmtx.class).addAnnotatedClass(ChequeTx.class)
				.addAnnotatedClass(Customers.class).addAnnotatedClass(Addresss.class)
				.addAnnotatedClass(Account.class)
				.buildSessionFactory();  // not possible to add another class now // Dont create two session factoy
	
				Session ses = sf.openSession();
				Transaction tx = ses.beginTransaction();
				
				
//				CustomerDAO customerDAO = new CustomerDAOimpl();
//				for(Customers c : customerDAO.getAllCustomers(ses)){
//					System.out.println(c);
//				}
				
//				for(Customers c : customerDAO.getByAccountBalanceGreaterThan(ses, 0)){
//					System.out.println(c);
//				}
//				
				
				
				
//				Customers c = new Customers("Irfan",new Date(21,5,5),1);
//				Customers c9 = new Customers("Ahmad",new Date(22,5,5),1);
//				Customers c8 = new Customers("Rolex",new Date(23,6,5),1);
//				
//				Valtechspring.orm.Addresss a = new Valtechspring.orm.Addresss("California", "USA","Earth",11111);
//
//				ses.save(c);
//				ses.save(c8);
//				ses.save(c9);
//				
//				ses.save(a);
//				c.setAddress(a);
				
//				Customers c1 = (Customers) ses.load(Customers.class, 1);
				
//				Account ac = new Account(10000,"SBA");
//				Account ac1 = new Account(5000000,"SBA");
//				Account ac5 = new Account(10008,"CBA");
//				Account ac6 = new Account(5400000,"LBA");
//				
//				
//				Account ac2 = (Account) ses.load(Account.class, 30);
//				Account ac3 = (Account) ses.load(Account.class, 30);
				
//				c.addAccount(ac);
//				c.addAccount(ac3);
//				c.addAccount(ac2);

//				c.addAccount(ac5);
//				c.addAccount(ac6);

//				c1.addAccount(ac3);
//				c1.addAccount(ac1);
//				ses.save(ac);
//				ses.save(ac1);
//				
//				List<Tx> txs = ses.createQuery("SELECT tx from Tx tx").list();
//				for (Tx t : txs) {
//					//TErnary operator boolCond ? true : false
//					t.setAccount(t.getId() % 2 == 0 ? ac:ac1);
//				}
//				
				
				
//				
//				ses.save(c);
//				ses.save(a);
//				a.setCustomers(c);
//				c.setAddress(a);
//					
//		ses.save(new Tx(1000));
//		ses.save(new ChequeTx(2000,123456,false,2));
//		ses.save(new TellexTx(2500,"Teller1","California"));
//		ses.save(new Atmtx(3000,123,"USA"));
//		
//		List<Tx> txs = ses.createQuery("Select t from Tx t").list();
//		for (Tx t : txs) {
//			System.out.println(t);
//		}
		
//		BankAccounts ba = new BankAccounts();
//		BankAccounts ba = (BankAccounts) ses.load(BankAccounts.class, new BankAccountsId(1,"SBA"));
//		System.out.println(ba);
		
		
		
		
//		ba.setAccountNo(1);
//		ba.setAccountType("SBA");
//		ba.setActive(true);
//		ba.setBalance(100000000);
//		ba.setOpeningDate(new Date());
//		ses.save(ba);
		
//		Bike bike = new Bike(1, "Lambhorgini", "Hurracane", "sapphire_black", 2022, 15000000, new BikeDetails(230000,true,1));
//		Car car = new Car("Audi", "Hurracane", "sapphire_black", 2022, 15000000);

//		Car car = new Car(2, "BMW", "Porsche", "sapphire_blue", 2022, 16000000);
//        ses.save(bike);
//		ses.saveOrUpdate(car);
//		Bike cars = (Bike) ses.load(Bike.class,1);
//		System.out.println("Car Loaded" +cars.getClass().getName());
//		System.out.println("Car Saved");
//		car.getMake();
//		car.setPrice(17000000);
//		ses.update(car);
		tx.commit(); // We can call roll back also depending upon the situation
		ses.close();
		sf.close();
	}
}
