import java.util.Scanner;

public class AutomarphicAPP {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the number");
		int num = scan.nextInt();
	
		boolean res=morpho.auto(num);
		if (res== true)
		{
			System.out.println("Enter number "+ num+" is AutoMorphic number");
		}
		else
		{
			System.out.println("Enter number "+ num+" is  not AutoMorphic number");

		}
	}

}
