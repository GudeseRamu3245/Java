import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the number");
		int num= scan.nextInt();
		Logic logic = new Logic();
		int res=logic.findsum(num);
	 if (res>num)
	 {
		System.out.println("the number "+num+" is abudent number"); 
		
	 }
	 else
	 {
		 System.out.println("Enterd nuber is not abdent number");
	 }
	}
	

}
