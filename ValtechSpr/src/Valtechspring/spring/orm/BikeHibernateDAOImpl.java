package Valtechspring.spring.orm;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import Valtechspring.jdbc.BikeDAO;
import Valtechspring.orm.Bike;

public class BikeHibernateDAOImpl extends HibernateDaoSupport implements BikeDAO {

	@Override
	public Bike get(int id) {
		// TODO Auto-generated method stub
		return getHibernateTemplate().load(Bike.class, id);
	}

	@Override
	public List<Bike> getAll() {
		// TODO Auto-generated method stub
		return getHibernateTemplate().find("Select b from Bike b");
	}

	@Override
	public void update(Bike bike) {
		// TODO Auto-generated method stub
		getHibernateTemplate().update(bike);
	}

	@Override
	public void save(Bike bike) {
		
		getHibernateTemplate().save(bike);
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Bike bike) {
		// TODO Auto-generated method stub
		getHibernateTemplate().delete(bike);
	}

}
