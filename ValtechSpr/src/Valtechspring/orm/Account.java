package Valtechspring.orm;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Table;

@Entity
@javax.persistence.Table(name="I_Account")
// Master class
public class Account {

	
		@Id
		@GeneratedValue(strategy=GenerationType.SEQUENCE)
		private int id;
		private double balance;
		private String accountType;
		@OneToMany(targetEntity=Tx.class,cascade={CascadeType.MERGE,CascadeType.PERSIST},fetch=FetchType.LAZY,mappedBy="account")
		private Set<Tx> txs;
		@ManyToMany(targetEntity = Customers.class, cascade = { CascadeType.MERGE,
	            CascadeType.PERSIST })
	    @JoinTable(name=" customer_account",joinColumns = @JoinColumn(name="account_id",referencedColumnName="id"), inverseJoinColumns = @JoinColumn(name="customer_id",referencedColumnName="id"))
		private Set<Customers> customers;
		public Account() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		public Account(double balance, String accountType) {
			super();
			this.balance = balance;
			accountType = accountType;
		}
		
		
		public Set<Customers> getCustomers() {
			return customers;
		}

		public void setCustomers(Set<Customers> customers) {
			this.customers = customers;
		}

		public void setTxs(Set<Tx> txs) {
			this.txs = txs;
		}
		
		public Set<Tx> getTxs() {
			return txs;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public double getBalance() {
			return balance;
		}

		public void setBalance(double balance) {
			this.balance = balance;
		}

		public String getAccountType() {
			return accountType;
		}

		public void setAccountType(String accountType) {
			accountType = accountType;
		}
		
		
		
		
}
