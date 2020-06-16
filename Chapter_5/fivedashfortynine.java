// Author Jason Waters
// Date 10/28/2019
// Assignment 5-49

import java.util.Scanner ;



public class fivedashfortynine {
	public static void main(String[] args) {
		
		//assign chars
		char s1 = 'a';
		char s2 = 'e';
		char s3 = 'i';
		char s4 = 'o';
		char s5 = 'u';
		
		//create a scanner object
		Scanner input = new Scanner(System.in) ;
		
		//Prompt the user to input a string
		System.out.println("Enter a string ") ; 
		String s6 = input.nextLine().toLowerCase();
		
		//count the string
		int low = 0;
		int high = s6.length() ;
		int count = 0;
		
		//check for vowels
		while (low < high) {
			if (s6.charAt(low) == s1) {
				count++;
			}
			else if (s6.charAt(low) == s2) {
				count++;
			}
			else if (s6.charAt(low) == s3) {
				count++;
			}
			else if (s6.charAt(low) == s4) {
				count++; 	
			}
			else if (s6.charAt(low) == s5) {
				count++; 
			}
			low++;
		}
		
		System.out.println( "there are " + count + " vowels in the string.") ;
	}
}
