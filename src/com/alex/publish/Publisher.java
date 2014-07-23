package com.alex.publish;

import javax.persistence.EntityManager;

import com.alex.entities.EscAlumno;

public class Publisher {
public static void main(String[] args) {
		
		MyEntity entity = new MyEntity();
		
		EscAlumno alumno = new EscAlumno();
		alumno.setAmaterno("duarte");
		alumno.setApaterno("arzate");
		alumno.setNombre("laura laura");
		
		EntityManager em = entity.getEntityManager();
		em.persist(alumno);
	}

}
