package Valtechspring.tx;

import Valtechspring.jdbc.BikeDAO;

public interface BikeService {

	void updatePrice(int bikeId, float price);
	
	void setBikeDAO(BikeDAO bikeDAO);



//	   void updatePrice(int carId, float price)

}