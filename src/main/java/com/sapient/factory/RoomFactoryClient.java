package com.sapient.factory;

import org.springframework.beans.factory.annotation.Autowired;

public class RoomFactoryClient {
	@Autowired
	private Factory factory;
	
	public void createRoom(){
		RoomFactory roomFactory = factory.getFactory();
		roomFactory.createDoor();
		roomFactory.createFloor();
	}
}
