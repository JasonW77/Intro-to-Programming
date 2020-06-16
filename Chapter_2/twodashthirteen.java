// Author Jason Waters
// Date 10/14/2019
// Assignment 2-13

import java.util.Scanner;

public class twodashthirteen {
	
	public static void main(String[] args) {
		
		// Create a Scanner object
		Scanner input = new Scanner(System.in) ;
		
		//prompts the user to enter a monthly saving amount
		System.out.print("Enter a monthly savings amount: ") ;
		double monthly = input.nextDouble() ;
		
		//compute savings total for first month
		double first = monthly * (1 + 0.00417) ;
		
		//compute savings total for second month
		double second = (first + monthly) * (1 + 0.00417) ;
		
		//compute savings total for third month
		double third = (second + monthly) * (1 + 0.00417) ;
		
		//compute savings total for fourth month
		double fourth = (third + monthly) * (1 + 0.00417) ;
		
		//compute savings total for fifth month
		double fifth = (fourth + monthly) * (1 + 0.00417) ;
		
		//compute savings total for sixth month
		double sixth = (fifth + monthly) * (1 + 0.00417) ;
		
		
		//displays the account value for the sixth month
		System.out.println ("Amount saved after 6 months $ " + sixth) ;
		
	}
}
