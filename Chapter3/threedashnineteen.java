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
			int side1 = input.nextInt() ;
			
			//prompt the user to enter side2
			System.out.print("Enter length of side 2: ") ;
			//reads an input from the user in a double value from the console as side2
			int side2 = input.nextInt() ;
			
			//prompt the user to enter side3
			System.out.print("Enter length of side 3: ") ;
			//reads an input from the user in a double value from the console as side3
			int side3 = input.nextInt() ;
			
			//check validity of inputs from user
			if (side3 <= side1 + side2) { ;
				System.out.println("input is not valid") ;
			}
			else {System.out.println("Perimeter is: " + (side1+side2+side3)) ;
	}}
}