import java.util.Scanner;



public class MainFile {

	

	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		System.out.println("Enter you Temparature");
		double F =Scan.nextDouble();
		TempConverdstion temperatureConverter = new  TempConverdstion();
		System.out.printf("%.2f",temperatureConverter .convertFahrenheitToCelsius(F));
		

	}

}
