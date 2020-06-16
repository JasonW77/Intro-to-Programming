// Author Jason Waters
// Date 10/22/2019
// Assignment 4-1

import java.util.Scanner ;



public class fourdashone {
	public static void main(String[] args) {

		//create a Scanner object
		Scanner input = new Scanner(System.in) ;
		
		//prompt the user to enter r
		System.out.print("Enter the length from the center of a pentagon to a vertex: ") ;
		//reads an input from the user in a double value from the console as r
		double r = input.nextDouble() ;
		
		//Compute the “s” value from the “r” input
		double s = (2 * r) * Math.sin(Math.PI / 5) ;
		
		//Compute the area of the pentagon using the “s” value
		double area = (5 * (Math.pow(s,2)) / (4 * Math.tan(Math.PI / 5))) ;
		
		//Print results of the pentagons area.
		System.out.printf("Area is:%10.2f", + area) ;
			
		}
}
