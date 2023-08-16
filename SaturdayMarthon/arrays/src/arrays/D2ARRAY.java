package arrays;

import java.util.Scanner;

public class D2ARRAY {
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);

		float[][] arry = new float[4][3];
		for(int i=0; i<=arry.length-1;i++)
		{
			
			for (int j=0; j<=arry[i].length-1;j++) {
			
				arry[i][j] =scan.nextFloat();
				System.out.println("player"+i+"height"+j);
				
			}
				
		}
		
	}

}
