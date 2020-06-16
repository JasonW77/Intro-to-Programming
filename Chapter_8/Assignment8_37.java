// Author Jason Waters
// Date 11/20/2019
// Chapter8 Assignment8_37

import java.util.Scanner ;

public class Exercise8_37 {
	public static void main(String[] args) {
		
		
		String[][] state = {
			{"Alabama" , "Montgomery"},
			{"Alaska" , "Juneau"},
			{"Arizona" ,"Phoenix"},
			{"Arkansas" , "Little Rock"},
			{"California" , "Sacramento"},
			{"Colorado" , "Denver"},
			{"Connecticut" , "Hartford"},
			{"Delaware" , "Dover"},
			{"Florida" , "Tallahassee"},
			{"Georgia" , "Atlanta"},
		};
		int cnt = 0;
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < state.length; i++) {
				System.out.println("What is the capital of " + state[i][0]);
				String answer = input.nextLine();
				if (answer.equalsIgnoreCase(state[i][1])) {
					cnt++;
				}
		}
		System.out.println("Total Correct Answers: " + cnt);
	}	
}
