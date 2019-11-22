// Author Jason Waters
// Date 11/22/2019
// Final Project - Battleship

import java.util.Scanner ;

public class Battleship {
	public static void main(String[] args) {
		
		String[][] game = {
			{" ", " ", " ", " ", " "},
			{" ", " ", " ", " ", " "},
			{" ", " ", " ", " ", " "},
			{" ", " ", " ", " ", " "},
			{" ", " ", " ", " ", " "},
		};
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter number of ships to place: ");
		int ship = input.nextInt();
		int hit = 1;
		
		for (int px = 0; px < ship; px++) {
			System.out.print("Enter a row (0,thru 4) for player O: ");
			int xr = input.nextInt();
			while(xr > 4 || xr < 0){
				System.out.print("Enter a row (0,thru 4) for player O: ");
				xr = input.nextInt();
			}
			System.out.print("Enter a column (0,thru 4) for player O: ");
			int xc = input.nextInt();
			while(xc > 4 || xc < 0){
				System.out.print("Enter a row (0,thru 4) for player O: ");
				xc = input.nextInt();
			}
				if (game[xr][xc] == " "){
					game[xr][xc] = "O";
				}
				else if (game[xr][xc] == "O"){
					System.out.println("\nShip already in this place!");
					px++;
					
				}
				
		}

		for (int g = 0; g < 25; g++) {
			
			if (hit <= ship){
				for (int po = 0; po < 1; po++) {
				System.out.print("Enter a row (0, 1, or 2) for player X: ");
				int or = input.nextInt();
				System.out.print("Enter a column (0, 1, or 2) for player X: ");
				int oc = input.nextInt();
					if (game[or][oc] == " "){
						game[or][oc] = "-";
						System.out.println("Miss!");
						
					}
					else if (game[or][oc] == "O"){
						game[or][oc] = "X";
						System.out.println("\nYou Sunk My battleship!");
						hit++;
					}
					else if (game[or][oc] == "-"){
						System.out.println("Double Miss");
						
					}
				}	
				System.out.println("-------");
				System.out.println("|" +(game[0][0]) + "|" + (game[0][1]) +"|"+ (game[0][2])+ "|"+ (game[0][3])+ "|"+ (game[0][4])+ "|");
				System.out.println("-------");
				System.out.println("|" +(game[1][0]) + "|" + (game[1][1]) +"|"+ (game[1][2])+ "|"+ (game[1][3])+ "|"+ (game[1][4])+ "|");
				System.out.println("-------");
				System.out.println("|" +(game[2][0]) + "|" + (game[2][1]) +"|"+ (game[2][2])+ "|"+ (game[2][3])+ "|"+ (game[2][4])+ "|");
				System.out.println("-------");
				System.out.println("|" +(game[3][0]) + "|" + (game[3][1]) +"|"+ (game[3][2])+ "|"+ (game[3][3])+ "|"+ (game[3][4])+ "|");
				System.out.println("-------");
				System.out.println("|" +(game[4][0]) + "|" + (game[4][1]) +"|"+ (game[4][2])+ "|"+ (game[4][3])+ "|"+ (game[4][4])+ "|");
				System.out.println("-------");
				
			}
		}
	}
}
