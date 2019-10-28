// Author Jason Waters
// Date 10/28/2019
// Assignment 5-11

//The program displays all the numbers from 100 to 200 ten per line.

//Only display numbers that are divisible by 5 or 6 but not both.	

//Display the product and align properly numbers are separated by exactly one space.


public class fivedasheleven {
		public static void main(String[] args) {
		
		
		//Display all the numbers between 100 and 200 while
	int count = 99 ;	
	int ten = 0 ;
	System.out.println("Counting from 100 to 200") ; 
	System.out.println("Divisible by 5 or 6, but not both") ;
	System.out.println("_______________________________________") ;
		
		//Display all the numbers between 100 and 200
		do {
			if (count % 5 == 0 ^ count % 6 == 0) {
				System.out.print(count + " ") ;
				ten++;
			}//display only 10 per line
			if (ten == 10){
				System.out.println() ;
				ten = 0 ;
			}
			count++ ;
		} while (count <= 200);	
			
	}		
}
