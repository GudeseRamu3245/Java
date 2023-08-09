package doubleTrouble;

import java.util.Scanner;


	public class doubleTrouble{
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			 int num1= scan.nextInt();
			 int res=doubleTheNumber( num1);
			 System.out.println(res);
			 
			
			
			
			
		}
		public static int doubleTheNumber(int num) {
			return num*2;
		}

	}



