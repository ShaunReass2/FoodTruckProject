package com.skilldistillery.app;

import java.util.Iterator;
import java.util.Scanner;

public class FoodTruckApp {

	private static FoodTruckApp app = new FoodTruckApp();

	private FoodTruck[] foodTruckArray = new FoodTruck[5];

	public static void main(String[] args) {

//		app.run(); 
		app.userInput();
		app.menuOptions();

	}
//
//	public void run() {
//		foodTruckArray = new FoodTruck[5]; 
//		
//	}

	public void userInput() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Welcome to Velp, the most sophisticated foodie rating app. Period. ");
		System.out.println("Your tummy's been fed, tell us what's in your head!");
		System.out.println("");

		for (int i = 0; i < foodTruckArray.length; i++) {

			System.out.println("Please enter the name of the food truck you wish to rate, or enter 'quit' to exit: ");
			String truckName = scanner.nextLine();
			if (truckName.equals("quit")) {
				menuOptions();
			}
			// foodTruckArray [i].setTruckName(truckName);

			System.out.println("Please enter the type of food the truck served: ");
			String foodType = scanner.nextLine();
			// foodTruckArray [i].setFoodType(foodType);

			System.out.println(
					"Please provide a number to rate your experience, with 1 being catastrophic and 5 being heavenly: ");
			double numericRating = scanner.nextDouble();
			scanner.nextLine();
			// foodTruckArray [i].setNumericRating(numericRating);

			foodTruckArray[i] = new FoodTruck(truckName, foodType, numericRating);
		}
	}

	public void menuOptions() {
		Scanner scanner = new Scanner(System.in);
		boolean menu = true;

		while (menu) {

			System.out.println("Your info has been loaded onto the truck! ");
			System.out.println("Please choose from the follwoing menu options: ");
			System.out.println("");
			System.out.println("");
			System.out.println("****************************************");
			System.out.println("*                                      *");
			System.out.println("*                 MENU                 *");
			System.out.println("*                                      *");
			System.out.println("*        (Please choose a number)      *************");
			System.out.println("*                                      *             *");
			System.out.println("*                                      *               *");
			System.out.println("*     1. List existing food trucks     *                 *");
			System.out.println("*     2. List average ratings          *                   ******");
			System.out.println("*     3. Display highest rated         *                         *");
			System.out.println("*     4. Quit                          *            ********     *");
			System.out.println("*                                      *          *         *    *");
			System.out.println("**************************************************           *****");
			System.out.println("*          *       *                              *        *      ");
			System.out.println("*           *     *                                *      *       ");
			System.out.println("*             ***                                     ***         ");

			int menuChoice = scanner.nextInt();

			switch (menuChoice) {
			case 1:
				menuFoodTruckList();
				break;
			case 2:
				menuAverageRatings();
				break;
			case 3:
				menuHighestRated();
				break;
			case 4:
				menuQuit();
				menu = false;
				break;

			default:
				System.out.println("That is not a valid selection. Please choose a numeral from 1 through 4.");
			}
		}
	}

	public void menuFoodTruckList() {
		for (int i = 0; i < foodTruckArray.length; i++) {
			if (foodTruckArray[i] != null) {
				System.out.println(foodTruckArray[i].toString());
			}
		}
	}

	public void menuAverageRatings() {
		double averageRatings = 0.0;
		double sumRatings = 0.0;
		int totalRatings = 0;

		for (int i = 0; i < foodTruckArray.length; i++) {
			if (foodTruckArray[i] != null) {
				totalRatings++;
				sumRatings += foodTruckArray[i].getNumericRating();
			}
		}
		averageRatings = sumRatings / totalRatings;
		System.out.println("The average rating is: " + averageRatings);
	}

	public void menuHighestRated() {
		double highValue = 0.0;
		int index = 0;

		for (int i = 0; i < foodTruckArray.length; i++) {
			if (foodTruckArray[i] != null) {
				if (foodTruckArray[i].getNumericRating() > highValue) {
					highValue = foodTruckArray[i].getNumericRating();
					index = i;
				}
			}
		}
		System.out.println(foodTruckArray[index].toString());
	}

	public void menuQuit() {

		System.out.println("Thank you for your rating! We look forward to seeing you again!");

	}
}
