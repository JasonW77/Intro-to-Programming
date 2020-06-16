// Author Jason Waters
// Date 10/30/2019
// Assignment 6-3

import java.util.Scanner ;

public class sixdashthree {
			
	public static void main(String[] args) {
				
		Scanner input = new Scanner(System.in);
			
		// Prompt the user to enter number
		System.out.print("Enter number: ");
		int n = input.nextInt();

		boolean u = isPalindrome(n);
		
		System.out.print("number is a palindrome = " +u);
		
	}
	//call for reversal
	//check if number is palindrome 
	//return true or false to main method
	public static boolean isPalindrome(int number) {
		
		int r = reverse(number);
		if (number == r) {
			return true;
		}
		else {
			return false;
		}
		
	}
	// return reversal of number to palindrome method
	public static int reverse(int number) {
		
		String s = number + "";
		String r = "";
		
		for (int n = 0; n<s.length(); n++) {
			r = s.charAt(n)+r;
		}
		return Integer.parseInt(r);
	}
}
	
