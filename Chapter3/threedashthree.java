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
		//reads useers input for (a) in a integer value from the console
		int a = input.nextInt() ;
				
		//Prompt the user to enter b, and assign to b.
		System.out.print("Enter b: ") ;
		//reads useers input for (b) in a integer value from the console
		int b = input.nextInt() ;
				
		//Prompt the user to enter c, and assign to c.
		System.out.print("Enter c: ") ;
		//reads useers input for (c) in a integer value from the console
		int c = input.nextInt() ;
				
		//Prompt the user to enter d, and assign to d.
		System.out.print("Enter d: ") ;
		//reads useers input for (d) in a integer value from the console
		int d = input.nextInt() ;
				
		//Check to see if (ad - bc) = 0, if (ad - bc) = 0 stop, and display the message “The equation has no solution.”
		if ( (a * d - b * c) == 0 ) {
			System.out.println("The equation has no solution.") ; 
			}
		else {
			
			//Prompt the user to enter e, and assign to e.
			System.out.print("Enter e: ") ;
			//reads useers input for (e) in a integer value from the console
			int e = input.nextInt() ;
		
			//Prompt the user to enter f, and assign to f.
			System.out.print("Enter f: ") ;
			//reads useers input for (f) in a integer value from the console
			int f = input.nextInt() ;
		
			//Solve for x, and y.
			double x = (e * d - b * f) / (a * d - b * c) ;
			double y = (a * f - e * c) / (a * d - b * c) ;
		
			//Display x, and y.
			System.out.println("x is " + x );
			System.out.println("y is " + y ); 
			}
		
	}
}