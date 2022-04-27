package com.xworkz.hibernatedemo.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.hibernatedemo.entity.RestaurantEntity;

public class RestaurantDAO {
public void saveRestaurant(RestaurantEntity entity) {

		
		Configuration configuration = new Configuration();
		configuration.configure();

		SessionFactory sessionFactory = configuration.buildSessionFactory();

		Session session = sessionFactory.openSession();
		// In hibernate autoCommit is false.
		Transaction transaction = session.beginTransaction();

		session.persist(entity);

		transaction.commit();// it will save the data in the table.
	}
}
