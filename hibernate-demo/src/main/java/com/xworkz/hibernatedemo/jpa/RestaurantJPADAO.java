package com.xworkz.hibernatedemo.jpa;

import com.xworkz.hibernatedemo.entity.RestaurantEntity;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class RestaurantJPADAO {
	public void saveRestaurant(RestaurantEntity entity) {

		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("JPA");

		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();

		entitymanager.persist(entity);
		entitymanager.getTransaction().commit();

		entitymanager.close();
		emfactory.close();

	}
}