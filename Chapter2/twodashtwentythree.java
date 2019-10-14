// Author Jason Waters
// Date 10/14/2019
// Assignment 2-23

import java.util.Scanner;

public class twodashtwentythree {
	
	public static void main(String[] args) {
		
		// Create a Scanner object
		Scanner input = new Scanner(System.in) ;
			
		//prompts the user to enter the distance to drive
		System.out.print("Enter a Distance to be driven: ") ;
		double distance = input.nextDouble() ;

		//prompts the user to enter the miles per gallon
		System.out.print("Enter a MPG for your car: ") ;
		double miles = input.nextDouble() ;

		//prompts the user to enter the price per gallon of fuel
		System.out.print("Enter Price per gallon of fuel: ") ;
		double fuel = input.nextDouble() ;
			
		//displays the cost of the trip
		System.out.println ("Cost of Trip $ " + fuel * (distance / miles)) ;
		
	}
}