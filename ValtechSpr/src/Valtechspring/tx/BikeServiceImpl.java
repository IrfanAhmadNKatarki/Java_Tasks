package Valtechspring.tx;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import Valtechspring.jdbc.BikeDAO;
import Valtechspring.orm.Bike;

public class BikeServiceImpl implements BikeService {
	
	
	private BikeDAO  bikeDAO;
	
	
	@Transactional(propagation = Propagation.REQUIRED)
	public void updatePrice(int bikeId, float price) {

		Bike bike = bikeDAO.get(bikeId);
		bike.setPrice(price);
		bikeDAO.update(bike);
//		throw new RuntimeException("No changes should be made");
		
	}


//	public BikeDAO getBikeDAO() {
//		return bikeDAO;
//	}


	public void setBikeDAO(BikeDAO bikeDAO) {
		this.bikeDAO = bikeDAO;
	}

}
