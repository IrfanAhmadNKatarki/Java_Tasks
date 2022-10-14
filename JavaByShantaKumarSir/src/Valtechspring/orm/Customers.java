package Valtechspring.orm;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "I_Customer")
@NamedQueries({@NamedQuery(name="customersByAccountType",query="SELECT c from Customers c JOIN c.accounts a where a.accountType = ?")})
public class Customers {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int id;
	private String name;
	@Temporal(TemporalType.DATE)
	private Date dateOfBirth;
	private int gender;
	@OneToOne(targetEntity = Addresss.class, cascade = { CascadeType.MERGE,
			CascadeType.PERSIST }, mappedBy = "customers")
	private Addresss addresss;
	@ManyToMany(targetEntity = Account.class, cascade = { CascadeType.MERGE,
			CascadeType.PERSIST }, mappedBy = "customers")
	private Set<Account> accounts;

	public Customers() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customers(String name, Date dateOfBirth, int gender) {
		super();

		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
	}
	public void addAccount(Account ac) {
		// TODO Auto-generated method stub

	if(getAccounts()==null){
		
		accounts = new HashSet<Account>();
		
	}
		accounts.add(ac);
		if(ac.getCustomers()==null){
			
			ac.setCustomers(new HashSet<Customers>());
		}
			ac.getCustomers().add(this);
		
	}

	public Set<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(Set<Account> accounts) {
		this.accounts = accounts;
	}

	public Addresss getAddress() {
		return addresss;
	}

	public void setAddress(Addresss addresss) {
		this.addresss = addresss;
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

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public int getGender() {
		return gender;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Customers [id=" + id + ", name=" + name + ", dateOfBirth=" + dateOfBirth + ", gender=" + gender
				+ ", addresss=" + addresss + "]";
	}
	

}
