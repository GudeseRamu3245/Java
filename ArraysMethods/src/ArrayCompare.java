import java.util.Arrays;
public class ArrayCompare {

	public static void main(String[] args) {
		 
        int intArr[] = { 10, 20, 15, 22, 35 ,4,334,1423};
  
    
        int intArr1[] = { 20, 15, 22, 45, 60, 35 };
  
      
         if(Arrays.compare(intArr, intArr1)>0)
         {
        	 System.out.println("intarr is Greaterthen intarr1");
         }
         else
         {
        	 if (Arrays.compare(intArr, intArr1)<0) { System.out.println("intarr1 is lesserthen intarr");
        		 
        	 }       		
     }
    }

}
