import java.util.Scanner;

public class AmstrongChecker {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("enter the Amstrong number");
		int n = scan.nextInt();
		Checker check =new Checker();
		int result=check.number(n);
		System.out.println(result);
		scan.close();
		if (n== result)
		{
			System.out.println("It is Amstrong number "+result);
		}
		else
		{
			System.out.println("It is not amstrong number");
		}
		

	}

}
