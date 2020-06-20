package com.ashish.eclipselink.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import com.ashish.eclipselink.entity.NonTeachingStudent;
import com.ashish.eclipselink.entity.TeachingStudent;

public class SaveStudent {
	
	public static void main( String[ ] args ) {
	      EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "JPA_Eclipselink" );
	      EntityManager entitymanager = emfactory.createEntityManager( );
	      entitymanager.getTransaction( ).begin( );

	      //Teaching staff entity 
	      TeachingStudent ts1 = new TeachingStudent(1,"Ashish","MSc MEd","Maths");
	      TeachingStudent ts2 = new TeachingStudent(2, "Manisha", "BSc BEd", "English");
	      
	      //Non-Teaching Staff entity
	      NonTeachingStudent nts1 = new NonTeachingStudent(3, "Satish", "Accounts");
	      NonTeachingStudent nts2 = new NonTeachingStudent(4, "Krishna", "Office Admin");

	      //storing all entities
	      entitymanager.persist(ts1);
	      entitymanager.persist(ts2);
	      entitymanager.persist(nts1);
	      entitymanager.persist(nts2);

	      entitymanager.getTransaction().commit();
	      entitymanager.close();
	      emfactory.close();
	   }

}
