package Valtechspring.orm.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import Valtechspring.orm.Customers;

public interface CustomerDAO {

	
	double getCombinedBalance(Session session, int cid);
	
	List<Customers> getByState(Session session, String state);

	List<Customers> getAllCustomers(Session session);

	Customers getCustomer(Session session, int id);

	List<Customers> getByAccountBalanceGreaterThan(Session session, double balance);

	List<Customers> getByTxAmountGreaterThan(Session session, float amount);
	
	List<Customers> getByAccountType(Session session, String type );

}