// Author Jason Waters
// Date 10/14/2019
// Assignment 2-1

import java.util.Scanner ;

public class twodashone {
	public static void main(String[] args) {
		
		//create a Scanner object
		Scanner input = new Scanner(System.in) ;
		
		//prompt the user to enter Celsius
		System.out.print("Enter temperature in Celsius: ") ;
		
		//reads a Celsius degrees in a double value from the console
		double Celsius = input.nextDouble() ;
		
		//convert Celsius to Fahrenheit
		double fahrenheit = (9.0 / 5) * Celsius + 32 ;
		
		//displays the result
		System.out.println("Degrees in Fahrenheit from Celsius " + fahrenheit );
		
	}
}
