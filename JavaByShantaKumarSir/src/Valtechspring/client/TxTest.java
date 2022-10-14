package Valtechspring.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Valtechspring.tx.BikeService;

public class TxTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext appCtx = new ClassPathXmlApplicationContext("hibernatetx.xml");
		BikeService bikeService = (BikeService) appCtx.getBean("bikeService");
		bikeService.updatePrice(1, 1344000);

	}

}
