// Author Jason Waters
// Date 11/19/2019
// Chapter8 Assignment8_3
public class Assignment8_3 {
	public static void main(String[] args) {
		
		double[][] a = {
			{1 , 2 , 3},
			{4 , 5 , 6},
			{7 , 8 , 9},
		};
		double[][] b = {
			{0 , 2 , 4},
			{1 , 4.5 , 2.2},
			{1.1 , 4.3 , 5.2},
		};
		double[][] c = addMatrix(a, b);	
			
		for (int i = 0; i < a.length; i++){
			for (int j = 0; j < b.length; j++){
				System.out.print(c[i][j] + " ");
			}
			System.out.println(" ");
		}	
	}	
	public static double[][] addMatrix(double[][] a, double[][] b){
		double[][] c = {
			{0 , 0 , 0},
			{0 , 0 , 0},
			{0 , 0 , 0},
		};
		
		for (int i = 0; i < a.length; i++){
			for (int j = 0; j < b.length; j++){
				c[i][j] = (a[i][j] + b[i][j]);
								
			}
		}
		return c;
	}
}