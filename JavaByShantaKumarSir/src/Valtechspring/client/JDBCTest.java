package Valtechspring.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Valtechspring.jdbc.BikeDAO;
import Valtechspring.jdbc.BikeDAOImpl;
import Valtechspring.orm.Bike;

public class JDBCTest {
	
	public static void main(String[] args) {
		ApplicationContext appCtx = new ClassPathXmlApplicationContext("jdbc.xml");
		BikeDAO bikeDAO = (BikeDAO) appCtx.getBean("bikeDAO");
		Bike bike = bikeDAO.get(1);
		System.out.println(bike);
	}
	

}
