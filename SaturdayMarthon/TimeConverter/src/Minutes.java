import java.util.Scanner;

public class Minutes {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the minutes");
		double minutes = scan.nextDouble();
		System.out.println(Hours.convertToHours(minutes));
		
	}

}
