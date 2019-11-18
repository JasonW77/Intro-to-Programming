// Author Jason Waters
// Date 11/18/2019
// Assignment 7-9

import java.util.Scanner ;

public class Exercise7_9 {
	
	public static void main(String[] args) {
			
			Scanner input = new Scanner(System.in);
			double[] array = new double[10];
			
			//populate array
			for (int d = 0; d < array.length; d++){
				System.out.print("Enter Number: ");
				array[d] = input.nextDouble();
			}	 
			double small = min(array);
			System.out.print("The minimum number is: " + small);
	}		
	//minimum method this finds the minimum value
	public static double min(double array[]) {
		
		double mmin = Integer.MAX_VALUE	;
		//find minimum number entered
		for (int i = 0; i < array.length; i++) {
			if (array[i] < mmin) {
				mmin = array[i];
			}
		}
		return mmin;
	}
}