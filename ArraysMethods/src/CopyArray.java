import java.util.Scanner;

public class CopyArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the  array length ");
		int []arr1= new int[scan.nextInt()];
		int []arr2= new int[arr1.length];
		System.out.println("Enter the  array contents ");
		for (int i =0;i<=arr1.length-1;i++)
		{
			
			arr1[i]= scan.nextInt();
		}
		System.out.print("the arr1 contents are ");
		
		for (int i =0;i<=arr1.length-1;i++)
		{
			
			System.out.print(" "+arr1[i]);
		}
		
		for (int i =0;i<=arr1.length-1;i++)
		{
			
			arr2[i]= arr1[i];
		}
		System.out.println();
		System.out.print("the arr2 contents are ");
		for (int i =0;i<=arr1.length-1;i++)
		{
			
			System.out.print(" "+arr2[i]);
		}

	}

}
