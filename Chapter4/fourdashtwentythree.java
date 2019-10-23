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
			System.out.print("Employee Name: " + s1 ) ;
			//Hours
			System.out.print("Hours Worked: " hours ) ;
			//Pay rate
			System.out.print("Pay Rate:%.2f " payrate ) ;
			//Gross pay
			System.out.print("Gross Pay:%.2f " hours * payrate ) ;
			//Federal and state deductions % and total
			System.out.print("Deductions:") ;
				//Federal withholdings
				System.out.print("Federal Withholding (federal):%.2f " + (federal * (hours * payrate)) ;
				//State withholdings
				System.out.print("State Withholding (state):%.2f " + (state * (hours * payrate)) ;
				//Total deduction
				System.out.print("Total Deduction:%.2f " + (fedto + stato) ;
			//Net pay
			System.out.print("Net Pay:%.2f" + (hours * payrate) - (stato + fedto) ) ;
			

		}
}
