package com.xworkz.hybernate.entity;


@Data
@Entity
@Table(name="resturant")

public class RestaurantEntity {
	
	@Id
	@Column(name = "id")
	private int resturantId;
	@Column (name ="Contact_no")
	private long contactNo;
	private String name;
	private String type;
	private double rating;
	
	
	
	
	
	
	

}
