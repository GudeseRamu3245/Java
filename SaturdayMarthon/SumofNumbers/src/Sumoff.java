import java.util.Scanner;

public class Sumoff {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the N");
		int n= scan.nextInt();
		int sum = 0;
		for(int i=1 ; i<=n;i++) 
			
		{		
			sum+=i;
		}
		System.out.println("sum of "+sum);
	}
}
