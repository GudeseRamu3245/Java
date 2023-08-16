import java.util.Scanner;

public class Converter {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the inches");
		int inches= scan.nextInt();
		Hight height = new Hight();
		System.out.printf("%.2f",height.convertInchesToFeet(inches));

	}

}
