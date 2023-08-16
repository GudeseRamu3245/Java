import java.util.Scanner;
package Distance;

public class DistanceCalculation {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		double speed =scan.nextDouble();
		double time = scan.nextDouble();
		DistanceCalculation D1= new DistanceCalculation();
		System.out.println(D1.calculateDistance(speed,time));
		}

	private char[] calculateDistance(double speed, double time) {
		
		return speed*time;
	}

	
	}
	
	



