import java.util.Scanner;

public class mainProgram {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("enter the radius");
		double radius =scan.nextDouble();
		Explor explor = new Explor();
		System.out.println(explor.calculateSurfaceArea(radius));
		
		

	}

}
