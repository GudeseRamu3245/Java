
public class Checker {
	public int number (int n) 
	{
	int CubeOff =0;
	
	while(n!=0)
	{
		double res= n%10;
		CubeOff+=Math.pow(res,3);
		n=n/10;
		
	}
		
	return CubeOff;
	

}
}
