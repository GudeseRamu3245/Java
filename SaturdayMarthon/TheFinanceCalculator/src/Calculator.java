import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the amount");
		double principle = scan.nextDouble();
		double rate = scan.nextDouble();
		double time = scan.nextDouble();
		Finace calculator = new Finace();

		System.out.println(calculator.calculateSimpleInterest(principle, rate, time));
		
		

	}

}
