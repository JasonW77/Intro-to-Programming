// Author Jason Waters
// Date 10/16/2019
// Assignment 3-3

import java.util.Scanner ;

public class threedashthree {
	public static void main(String[] args) {
		
		//create a Scanner object
		Scanner input = new Scanner(System.in) ;
		
		//Prompt the user to enter a, and assign to a.
		System.out.print("Enter a: ") ;
		//reads users input for (a) in a double value from the console
		double a = input.nextDouble() ;
				
		//Prompt the user to enter b, and assign to b.
		System.out.print("Enter b: ") ;
		//reads users input for (b) in a double value from the console
		double b = input.nextDouble() ;
				
		//Prompt the user to enter c, and assign to c.
		System.out.print("Enter c: ") ;
		//reads users input for (c) in a double value from the console
		double c = input.nextDouble() ;
				
		//Prompt the user to enter d, and assign to d.
		System.out.print("Enter d: ") ;
		//reads users input for (d) in a double value from the console
		double d = input.nextDouble() ;
				
		//Check to see if (ad - bc) = 0, if (ad - bc) = 0 stop, and display the message “The equation has no solution.”
		if ( (a * d - b * c) == 0 ) {
			System.out.println("The equation has no solution.") ; 
			}
		else {
			
			//Prompt the user to enter e, and assign to e.
			System.out.print("Enter e: ") ;
			//reads users input for (e) in a double value from the console
			double e = input.nextDouble() ;
		
			//Prompt the user to enter f, and assign to f.
			System.out.print("Enter f: ") ;
			//reads users input for (f) in a double value from the console
			double f = input.nextDouble() ;
		
			//Solve for x, and y.
			double x = (e * d - b * f) / (a * d - b * c) ;
			double y = (a * f - e * c) / (a * d - b * c) ;
		
			//Display x, and y.
			System.out.println("x is " + x );
			System.out.println("y is " + y ); 
			}
		
	}
}
