package com.skilldistillery.app;

public class FoodTruck {

	private static int count = 0; 
	
	private int numericID;
	private String truckName;
	private String foodType;
	private double numericRating;
	
	public FoodTruck() {		
	}
	
	public FoodTruck(String truckName, String foodType, double numericRating) {
		this.numericID = count; 
		count = count + 1; 
		
		this.truckName = truckName;
		this.foodType = foodType;
		this.numericRating = numericRating; 
	}
	
	@Override
	public String toString() {
		return "FoodTruck ID Number: " + numericID + "\n" + "Truck Name: " + truckName + "\n" + "Food Type: " + foodType
				+ "\n" + "Rating: " + numericRating + "\n";
	
//		return "FoodTruck ID = " + numericID + "/n Truck name =" + truckName; 
	}
	
	private int getNumericID() {
		return numericID;
	}

	private void setNumericID(int numericID) {  
		this.numericID = numericID;
	}

	public String getTruckName() {
		return truckName;
	}

	public void setTruckName(String truckName) {
		this.truckName = truckName;
	}

	public String getFoodType() {
		return foodType;
	}

	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}

	public double getNumericRating() {
		return numericRating;
	}

	public void setNumericRating(double numericRating) {
		this.numericRating = numericRating;
	}
		
}