import java.util.Arrays;
public class ArrayCopyOff {
	
	public static void main(String[] args)
    {
  
     
        int intArr[] = { 45, 60, 25, 20, 1125 };
  
    
        System.out.println("Integer Array: " + Arrays.toString(intArr));
                          
  
        System.out.println("\nNew Arrays by copyOf:\n");
  
        System.out.println("Integer Array: " + Arrays.toString( Arrays.copyOf(intArr, 5)));

                          
                                
}
}
