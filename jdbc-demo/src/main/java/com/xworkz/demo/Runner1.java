package com.xworkz.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Runner1 {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		
		insertMovie();
//		updateMovie();
//		deleteMovie();
	}

	private static void insertMovie() {
		
		System.out.println("enter movie id");
		int id=sc.nextInt();
		System.out.println("enter movie name");
		String name=sc.next();
		System.out.println("enter rating");
		double rate=sc.nextDouble();
		System.out.println("enter langauge");
		String lang=sc.next();
		System.out.println("enter budget");
		long budget=sc.nextLong();
		Connection connection = null;
		Statement statement = null;
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jan6", "root", "root");
			System.out.println("connection created");
			statement = connection.createStatement();
			System.out.println("statement created");
			statement.execute("INSERT INTO movie VALUES(("+id+"),('"+name+"'),("+rate+"),('"+lang+"'),("+budget+"))  ");
			System.out.println("successfully inserted");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			try {
				if (statement != null)
					statement.close();
				if (connection != null)
					connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	private static void updateMovie() {
		
		System.out.println("enter movie name");
		String name=sc.next();
		System.out.println("enter rating");
		double rate=sc.nextDouble();
		System.out.println("enter langauge");
		String lang=sc.next();
		System.out.println("enter budget");
		long budget=sc.nextLong();
		System.out.println("enter movie id");
		int id=sc.nextInt();
		Connection connection = null;
		Statement statement = null;
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jan6", "root", "root");
			System.out.println("connection created");
			statement = connection.createStatement();
			System.out.println("statement created");
			statement.execute("UPDATE movie SET name=('"+name+"'),rating=10,language='hindi',budget=198 WHERE id=3");
			System.out.println("successfully updated");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			try {
				if (statement != null)
					statement.close();
				if (connection != null)
					connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	private static void deleteMovie() {
		Connection connection = null;
		Statement statement = null;
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jan6", "root", "root");
			System.out.println("connection created");
			statement = connection.createStatement();
			System.out.println("statement created");
			statement.execute("DELETE FROM movie where id=2");
			System.out.println("successfully deleted");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			try {
				if (statement != null)
					statement.close();
				if (connection != null)
					connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
