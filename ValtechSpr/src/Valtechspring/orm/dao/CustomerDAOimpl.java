package Valtechspring.orm.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import Valtechspring.orm.Customers;

public class CustomerDAOimpl implements CustomerDAO {

	
	@Override
	public List<Customers> getByTxAmountGreaterThan(Session session, float amount){
		
		Query q = session.createQuery("SELECT Distinct from Customers c JOIN c.accounts a JOIN a.txs t where t.amount > ?");
		q.setFloat(0, amount);
		return q.list();
	}
		
	@Override
	public List<Customers> getByAccountBalanceGreaterThan(Session session, double balance){
		
		Query q = session.createQuery("SELECT Distinct c FROM Customers c join c.accounts a where a.balance > ?");
		q.setDouble(0, balance);
		return q.list();
		
	}
		
	@Override
	public List<Customers> getByState(Session session, String state){
		
		
		Query q =  session.createQuery("SELECT c from Customers c where c.addresss.state= ?");
		q.setString(1, state);
		return q.list();
		
	}
	
	@Override
	public List<Customers> getAllCustomers(Session session){
		
		
		return session.createQuery("SELECT c from Customers c").list();
	}
	
	

	@Override
	public Customers getCustomer(Session session, int id){
		
		
		return (Customers) session.get(Customers.class, id);
	}

	@Override
	public double getCombinedBalance(Session session, int cid) {
		Query q = session.createQuery("SELECT sum(a.balance) FROM Customer c JOIN c.accounts a where c.id=?");
		q.setInteger(0, cid);
		return (Double)(q.list().size()==0?0:q.list().get(0));
		
	}

	@Override
	public List<Customers> getByAccountType(Session session, String type) {
		
		Query q=session.getNamedQuery("customerByAccountType");
        q.setString(0, type);
        return q.list();
        
	}
	
	
}
