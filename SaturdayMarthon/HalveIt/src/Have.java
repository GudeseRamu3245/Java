import java.util.Scanner;

public class Have {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the Number");
		double num =scan.nextDouble();
		
		Number n = new Number();
		System.out.println(n.halveTheNumber(num));
		

	}

}
