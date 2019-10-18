// Author Jason Waters
// Date 10/16/2019
// Assignment 3-19

import java.util.Scanner ;



public class threedashnineteen {
	public static void main(String[] args) {

			//create a Scanner object
			Scanner input = new Scanner(System.in) ;
			
			//prompt the user to enter side1
			System.out.print("Enter length of side 1: ") ;
			//reads an input from the user in a double value from the console as side1
			double side1 = input.nextDouble() ;
			
			//prompt the user to enter side2
			System.out.print("Enter length of side 2: ") ;
			//reads an input from the user in a double value from the console as side2
			double side2 = input.nextDouble() ;
			
			//prompt the user to enter side3
			System.out.print("Enter length of side 3: ") ;
			//reads an input from the user in a double value from the console as side3
			double side3 = input.nextDouble() ;
			
			//check validity of inputs from user
			if (side3 >= (side1 + side2)) { ;
				System.out.println("input is not valid") ;
			}
			else {double perimeter = (side1+side2+side3) ;
				System.out.println("Perimeter is: " + perimeter) ;
	}}
}
