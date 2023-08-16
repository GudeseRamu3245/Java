import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("entr the prime number");
		int n= scan.nextInt();
		int count =0;
		for(int i=2; i<=n;i++)
		{
			if (n%i ==0)
			{
				count+=1;
			}

}
		if (count>2)
		{
		   System.out.println("not Prime");	
		   }
		else {
			System.out.println("Prime");
			
		}
	}

}
