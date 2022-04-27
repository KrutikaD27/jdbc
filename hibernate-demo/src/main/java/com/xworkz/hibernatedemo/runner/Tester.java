package com.xworkz.hibernatedemo.runner;

import com.xworkz.hibernatedemo.entity.RestaurantEntity;
import com.xworkz.hibernatedemo.jpa.RestaurantJPADAO;

public class Tester {
	public static void main(String[] args) {
		RestaurantEntity entity = new RestaurantEntity();
		// by default it will take preparedStatements rather than the statement.
		
		entity.setRestaurantId(2);
		entity.setRestaurantName("SLV");
		entity.setRestaurantNUM(9740945);
		entity.setRestaurantRating(7.2);
		entity.setRestaurantType("veg");
		
		RestaurantJPADAO restaurantJPADAO = new RestaurantJPADAO();
		restaurantJPADAO.saveRestaurant(entity);
		System.out.println("Saved successfully");
	}
}