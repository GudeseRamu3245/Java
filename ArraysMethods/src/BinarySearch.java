import java.util.Arrays;
import java.util.Scanner;
public class BinarySearch {

	public static void main(String[] args) {
		 int intArr[] = { 10, 20, 15, 22, 35 };
		  
	        Arrays.sort(intArr);
	        Scanner scan= new Scanner(System.in);
	        System.out.println("Enter the number");
	        int Key = scan.nextInt();
	   System.out.println( Key + " found at index = "+ Arrays.binarySearch(intArr, Key));
	           
	            

	}

}
