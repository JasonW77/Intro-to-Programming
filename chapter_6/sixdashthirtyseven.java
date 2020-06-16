// Author Jason Waters
// Date 10/31/2019
// Assignment 6-37

import java.util.Scanner ;


public class sixdashthirtyseven {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter number and width
		System.out.print("Enter number: ");
		int number = input.nextInt();
		System.out.print("Enter width: ");
		int width = input.nextInt();
		
		//call format method
		String ret = format(number, width);
				
		// Print final result	
		System.out.print(ret);
		
	}
	
	public static String format(int number, int width){
		
		//convert number to string
		String str = number + "";
		String end = "";
	
		//creating 0's needed and putting them in end
		for (int cnt = width - str.length();cnt > 0; cnt--) {
			end += "0"; 
		}
		
		//combining 0's + number; 
		end += str;
		
		//return value to main
		return end;
	}
}
