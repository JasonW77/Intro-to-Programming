// Author Jason Waters
// Date 10/22/2019
// Assignment 4-23

import java.util.Scanner ;



public class fourdashtwentythree {
	public static void main(String[] args) {

		//create a Scanner object
		Scanner input = new Scanner(System.in) ;
		
		//Prompt the user to Enter employees name
		System.out.print("Enter the Employees Name: ") ;
		//Read input and store value as String s1
		String s1 = input.nextline() ;
		
		//Prompt the user to Enter hours worked
		System.out.print("Enter the Hours Worked: ") ;
		//Read input and store value as double hours
		double hours = input.nextDouble() ;
		
		//Prompt user to enter employee pay rate
		System.out.print("Enter the Hourly Rate: ") ;
		//Read input and store as double pay
		double payrate = input.nextDouble() ;
		
		//Prompt the user to enter federal tax withholdings
		System.out.print("Enter the Federal Tax: ") ;
		//Read input and store as double fed
		double federal = input.nextDouble() ;
		
		//Prompt user to enter state tax withholdings
		System.out.print("Enter the State Tax: ") ;
		//Read input and store as double state
		double state = input.nextDouble() ;
		
		//Validity checks
		
		//Computations
		
		//Print payroll statement displaying:
			//Name
			//Hours
			//Pay rate
			//Gross pay
			//Fed deductions % and total
			//State deductions % and total
			//Total deduction
			//Net pay

		}
}
