// Author Jason Waters
// Date 11/19/2019
// Assignment 7-23

public class Exercise7_23 {
	
	public static void main(String[] args) {
		
		boolean[] locker = new boolean[100];
		
		for (int s = 0; s < locker.length; s++){
			for (int l = 1; l < locker.length; l += (s + 1)) {
				locker[l] =! locker[l];
			}
		}		
		for (int i = 0; i < locker.length; i++ ){
			if ( locker[i] == true ) {
				System.out.print(( i + 1 ) + " ");
			}
		}
	}	
}
