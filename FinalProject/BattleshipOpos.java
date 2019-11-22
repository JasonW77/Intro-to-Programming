// Author Jason Waters
// Date 11/22/2019
// Final Project - Battleship

import java.util.Scanner ;

public class BattleshipOpos {
	public static void main(String[] args) {
		
		String[][] opos = {
			{" ", " ", " ", " ", " "},
			{" ", " ", " ", " ", " "},
			{" ", " ", " ", " ", " "},
			{" ", " ", " ", " ", " "},
			{" ", " ", " ", " ", " "},
		};
		int ship = 0;
		Scanner input = new Scanner(System.in);
		
		//Player enters number of ships to place here
		for (int sn = 0; sn < 1; sn++) {
			System.out.print("Enter number of ships to place: ");
			ship = input.nextInt();
			if (ship >= (opos.length * 5)) {
				System.out.println("\nMaximum number of ships Exceded!");
				sn--;
			}
		}
		for (int px = 0; px < ship; px++) {
			//Player enters "x" Coordinates here
			System.out.print("Enter 'x' coordinate for player 1 Ship #" + (px + 1) + " (" +1 + ", thru " + opos.length + "): ");
			int xr = (input.nextInt()-1);
				if ((xr <= 0 - 1)) {
					System.out.println("\nShip placement out of bounds!");
				}
				else if ((xr >= 6 -1)) {
					System.out.println("\nShip placement out of bounds!");
				}
			//Player enters "y" Coordinates here	
			System.out.print("Enter 'y' coordinate for player 1 Ship #" + (px + 1) + " (" +1 + ", thru " + opos.length + "): ");
			int xc = (input.nextInt()-1);
				if ((xc <= 0 - 1)) {
					System.out.println("\nShip placement out of bounds!");
				}
				else if ((xc >= 6 -1)) {
					System.out.println("\nShip placement out of bounds!");
				}
				if (opos[xr][xc] == " "){
					opos[xr][xc] = "O";
				}
				else if (opos[xr][xc] == "O"){
					System.out.println("\nShip already in this place!");
					px--;	
				}	
		System.out.println("___________");
		System.out.println("|" +(opos[0][0]) + "|" + (opos[0][1]) +"|"+ (opos[0][2])+ "|"+ (opos[0][3])+ "|"+ (opos[0][4])+ "|");
		System.out.println("-----------");
		System.out.println("|" +(opos[1][0]) + "|" + (opos[1][1]) +"|"+ (opos[1][2])+ "|"+ (opos[1][3])+ "|"+ (opos[1][4])+ "|");
		System.out.println("-----------");
		System.out.println("|" +(opos[2][0]) + "|" + (opos[2][1]) +"|"+ (opos[2][2])+ "|"+ (opos[2][3])+ "|"+ (opos[2][4])+ "|");
		System.out.println("-----------");
		System.out.println("|" +(opos[3][0]) + "|" + (opos[3][1]) +"|"+ (opos[3][2])+ "|"+ (opos[3][3])+ "|"+ (opos[3][4])+ "|");
		System.out.println("-----------");
		System.out.println("|" +(opos[4][0]) + "|" + (opos[4][1]) +"|"+ (opos[4][2])+ "|"+ (opos[4][3])+ "|"+ (opos[4][4])+ "|");
		System.out.println("-----------");		
				
		}
	}
}