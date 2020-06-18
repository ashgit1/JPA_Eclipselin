package com.ashish.eclipselink.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ashish.eclipselink.entity.Employee;

public class NamedQueries {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("JPA_Eclipselink");
		EntityManager entitymanager = emfactory.createEntityManager();

		Query query = entitymanager.createNamedQuery("find employee by id");
		query.setParameter("id", 1201);
		List<Employee> employee = query.getResultList();

		for (Employee e : employee) {
			System.out.print("Employee ID :" + e.getEid());
			System.out.println("\t Employee Name :" + e.getEname());
		}

	}

}
