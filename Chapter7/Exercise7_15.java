// Author Jason Waters
// Date 11/18/2019
// Assignment 7-15

import java.util.Scanner ;

public class Exercise7_15 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		double[] array = new double[10];
		
		//read in ten integers and populate array
		for (int d = 0; d < array.length; d++){
			System.out.print("Enter Number: ");
			array[d] = input.nextDouble();
		}	 
		eliminateDuplicates(int[] list)
		
		
		System.out.print("The number of distinct numbers is " + double);
		System.out.print("Array without duplicates: " + double);
		
	}		
	public static int[] eliminateDuplicates(int[] list){
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] < mmin) {
				mmin = array[i];
			}

			
		}
	}
	
	//public static double min(double array[]) {
	
		//double mmin = Integer.MAX_VALUE	;
		//find minimum number entered
		//		//}
		//return mmin;
	//}	
}



//Write a test program that reads in ten integers, invokes the method, and displays the result.

//(Hint: Use a for loop to read in the 10 values from the user. Create a method for eliminating the duplicates which accepts the user's array as a parameter. In the method, create a new array for storing the non-duplicates with the same size as the user's array.)