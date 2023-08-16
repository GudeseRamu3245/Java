package thirdArry;
import java.util.Scanner;

public class ThirdArry {
	

	
		public static  void main(String[] args) {

			
			Scanner Scan =new Scanner(System.in);
			int rry[][][] = new int  [3][2][3];
			for(int i=0; i<=rry.length-1;i++ )
			{
				for(int j= 0; j<=rry[i].length-1;j++)
				{
					for(int k=0; k<=rry[i][j].length-1;k++)
					{
						System.out.println("Enter the marks of school "+i+" class"+j+"students"+k);
						rry[i][j][k] =Scan.nextInt();
						
					}
					
				}
			}
	System.out.println("The arry contnts are ........");
	for(int i=0; i<=rry.length-1;i++ )
	{
		for(int j= 0; j<=rry[i].length-1;j++)
		{
			for(int k=0; k<=rry[i][j].length-1;k++)
			{
				System.out.println(rry[i][j][k]);
				
			}
		System.out.println("..............");
		}
System.out.println("..............");
	}

			
		
				
			

		}

	}



