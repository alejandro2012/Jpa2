package com.alex.publish;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MyEntity {
	
	private static final String PERSISTENCE_UNIT = "Jpa2";
	private static EntityManagerFactory factory = null;

	public static EntityManagerFactory getFactory(){
		if(factory == null)
			factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT);
		
		return factory;
	}
	
	public EntityManager getEntityManager(){
		EntityManager em = getFactory().createEntityManager();
		
		return em;
	}
	
	

}
