package arrays;
import java.util.Scanner;

import java.util.Scanner;

public class GamesArray {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of games");
		int [][]array = new int[scan.nextInt()][];
		for(int i=0;i<=array.length-1;i++) {
			System.out.println("enter the number of players in a game"+i);
			array[i] = new int[scan.nextInt()];
		}
		
		for(int i=0; i<=array.length-1;i++)
		{
		for(int j=0;i<=array[i].length-1;i++) {
			System.out.println("Enter the game"+i+"player"+j+ "score");
			array[i][j] = scan.nextInt();
		}
	}
	
	
}
}