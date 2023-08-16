package calculatorClass;

import java.util.Scanner;

public class mainprogram {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Hello user Wellcome to Kodnest");
		System.out.println("enter the you symbol");
		String input= scan.next();
		
		if (input == "+")
		{
			System.out.println("enter the  number ");
			int a= scan.nextInt();
			int b= scan.nextInt();
			System.out.println(a+b);
			kodnestapp kodnest = new kodnestapp();
			System.out.println(kodnest.kodnestapp(input));
			
			
		}

	}

}
