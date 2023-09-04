import java.util.Scanner;

public class sortapp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Array Length");
		int arr[]=new int[scan.nextInt()];
		System.out.println("Enter "+arr.length+" number of elements");
		for(int i=0;i<=arr.length-1;i++)
		{
		arr[i]=scan.nextInt();

	}
		System.out.println("Arrays before sorting ...");
		for (int x : arr) {
			System.out.print(x+" ");
			}
	System.out.println();
	Sort sort=new Sort();
	sort.bubbleSort(arr);


	System.out.println("Arrays Aefore sorting ...");
	for (int x : arr) {
		System.out.print(x+" ");
		}
System.out.println();
}
}
