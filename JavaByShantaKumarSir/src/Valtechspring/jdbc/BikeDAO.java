package Valtechspring.jdbc;

import java.util.List;

import Valtechspring.orm.Bike;

public interface BikeDAO {

	/* (non-Javadoc)
	 * @see ValtechSpring.jdbc.CarDAO#get(int)
	 */
	Bike get(int id);

	/* (non-Javadoc)
	 * @see ValtechSpring.jdbc.CarDAO#getAll()
	 */
	List<Bike> getAll();

	void update(Bike bike);
	
	void save(Bike bike);
	
	void delete(Bike bike);

}