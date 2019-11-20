// Author Jason Waters
// Date 11/20/2019
// Chapter8 Assignment8_9

import java.util.Scanner ;

public class Exercise8_9 {
	public static void main(String[] args) {
		
		String[][] game = /*new String[3][3];*/ {
			{" ", " ", " "},
			{" ", " ", " "},
			{" ", " ", " "},
		};
		
		Scanner input = new Scanner(System.in);
		
		for (int g = 0; g < 5; g++) {
			for (int px = 0; px < 1; px++) {
				System.out.println("Enter a row (0, 1, or 2) for player X: ");
				int xr = input.nextInt();
				System.out.println("Enter a column (0, 1, or 2) for player X: ");
				int xc = input.nextInt();
					if (game[xr][xc] == " "){
						game[xr][xc] = "X";
					}
					else if (game[xr][xc] == "O") {
						System.out.println("place already taken");
						px--;
					}
					else if (game[xr][xc] == "X"){
						System.out.println("place already taken");
						px--;
					}
				
				for (int i = 0; i < game.length; i++) {
					System.out.println(" ");
					for (int j = 0; j < game[i].length; j++) {
						System.out.print("|" + (game[i][j]));
					}
				}
			}
			if (g < 4){
				for (int po = 0; po < 1; po++) {
				System.out.println("Enter a row (0, 1, or 2) for player O: ");
				int or = input.nextInt();
				System.out.println("Enter a column (0, 1, or 2) for player O: ");
				int oc = input.nextInt();
					if (game[or][oc] == " "){
						game[or][oc] = "O";
					}
					else if (game[or][oc] == "O"){
						System.out.println("place already taken");
						po--;
					}
					else if (game[or][oc] == "X"){
						System.out.println("place already taken");
						po--;
					}
				}	
				for (int i = 0; i < game.length; i++) {
					System.out.println(" ");
					for (int j = 0; j < game[i].length; j++) {
						System.out.print("|" + (game[i][j]));
					}
				}
			}
		}
	}
}
