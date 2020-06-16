// Author Jason Waters
// Date 10/29/2019
// Assignment 6-17

import java.util.Scanner ;

public class sixdashseventeen {
	
	public static void main(String[] args) {
		
	Scanner input = new Scanner(System.in);
	
		// Prompt the user to enter n 
		// Print n by n matrix header
		System.out.print("Enter n: ");
		int n = input.nextInt();

		printMatrix(n);
	}
		// Define method(n-by-n)
	public static void printMatrix(int n) {
		
		int c = 0;
		int sc = 0;
		
		// Print matrix in 1 and 0’s randomly in a matrix
		do {
			System.out.print((int)(Math.random() * (1 + 1)));
			c++;
			if (c == n){
				System.out.println() ;
				c = 0 ;
				sc++ ;
			} 
		}while (sc <= n -1) ;		
	}
}
