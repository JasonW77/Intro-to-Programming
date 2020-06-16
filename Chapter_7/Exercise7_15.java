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
		//call method eliminateDuplicates()
		double[] end = eliminateDuplicates(array);
		int cnt = 0;
		//Display the result
		System.out.println("The number of distinct numbers is " + end.length);
		System.out.print("Array without duplicates: ");
			for (int i = 0; i < end.length; i++) {
				System.out.print(end[i] + " ");
		}
	}		
	public static double[] eliminateDuplicates(double[] list){
		double[] list2 = new double[list.length];
		boolean duplicate = false;
		int pos = 0;
		for (int d = 0; d < list.length; d++){
			for (int c = 0; c < list2.length; c++){
				if(list[d] == list2[c]){
					duplicate = true;	
				}
			}
			if (duplicate == false){
				list2[pos] = list[d];
				pos++;
			}
			else {
				duplicate = false;
			}
		}
		double[] end = new double[pos];
	
		for (int i = 0; i < pos; i++) {
			end[i] = list2[i];
		}
		return end;
	}
}
