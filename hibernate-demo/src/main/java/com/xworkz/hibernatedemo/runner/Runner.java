package com.xworkz.hibernatedemo.runner;

import com.xworkz.hibernatedemo.dao.RestaurantDAO;
import com.xworkz.hibernatedemo.entity.RestaurantEntity;

public class Runner {
	public static void main(String[] args) {
		RestaurantEntity restaurantEntity = new RestaurantEntity();
		// by default it will take preparedStatements rather than the statement.
		
		restaurantEntity.setRestaurantId(1);
		restaurantEntity.setRestaurantName("Udupi grand");
		restaurantEntity.setRestaurantNUM(9740935);
		restaurantEntity.setRestaurantRating(7.2);
		restaurantEntity.setRestaurantType("veg");
		
		RestaurantDAO restaurantDAO = new RestaurantDAO();
		restaurantDAO.saveRestaurant(restaurantEntity);
		System.out.println("Saved successfully");
	}
}

