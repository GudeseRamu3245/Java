
public class Logic {
	static  int findsum(int num) {
		int sum=0;
		for(int i=1 ;i<num;i++)
		{
			if (num%i==0)
			{
				sum+=i;
			}
		}
		return sum;
		
		
	}

}
