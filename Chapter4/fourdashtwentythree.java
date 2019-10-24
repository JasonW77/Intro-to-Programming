// Author Jason Waters
// Date 10/24/2019
// Assignment 4-23

import java.util.Scanner ;



public class fourdashtwentythree {
	public static void main(String[] args) {

		//create a Scanner object
		Scanner input = new Scanner(System.in) ;
		
		//Prompt the user to Enter employees name
		System.out.print("Enter employee's name: ") ;
		//Read input and store value as String s1
		String s1 = input.nextLine() ;
		
		//Prompt the user to Enter hours worked
		System.out.print("Enter number of hours worked: ") ;
		//Read input and store value as double hours
		double hours = input.nextDouble() ;
		
		//Prompt user to enter employee pay rate
		System.out.print("Enter hourly pay rate: ") ;
		//Read input and store as double pay
		double payrate = input.nextDouble() ;
		
		//Prompt the user to enter federal tax withholdings
		System.out.print("Enter Federal Tax rate: ") ;
		//Read input and store as int fed
		double federal = input.nextDouble() ;
		
		//Prompt user to enter state tax withholdings
		System.out.print("Enter State Tax rate: ") ;
		//Read input and store as int state
		double state = input.nextDouble() ;
		
		//Print payroll statement displaying:
			//Name
			System.out.println("\nEmployee Name: " + s1 ) ;
			//Hours
			System.out.println("Hours Worked: " + hours ) ;
			//Pay rate
			System.out.printf("Pay Rate: $%.2f " , payrate ) ;
			//Gross pay
			System.out.printf("\nGross Pay: $%.2f " , (hours * payrate) ) ;
			//Federal and state deductions % and total
			System.out.print("\nDeductions:") ;
			//Federal withholdings
			System.out.printf("\n\tFederal Withholding: (%.1f): $%.2f " , federal * 100 , (federal * (hours * payrate))) ;
			//State withholdings
			System.out.printf("\n\tState Withholding: (%.1f%%): $%.2f " , state * 100 , (state * (hours * payrate))) ;
			//Total deduction
			System.out.printf("\n\tTotal Deduction: $%.2f " , ((federal * (hours * payrate) + (state * (hours * payrate))))) ;
			//Net pay
			System.out.printf("\nNet Pay: $%.2f" ,  (hours * payrate) - (federal * (hours * payrate) + (state * (hours * payrate))));
			

		}
}
