
package array;

import java.util.*;

public class Array2 
{
    public static void main( String[] args)
    {
        System.out.print("Enter the 5 numbers:");
        Scanner sc= new Scanner(System.in);
        
        int[] A=new int[5];
        
        for(int i=0;i<A.length;i++)
        {
            A[i]=sc.nextInt();
            
        }
        for(int i=0;i<A.length;i++)
        {
            System.out.print(A[i] + " ");
            
        }
         System.out.println();
         
        // enhanced: for each loop
        
        for(int a: A)
            
        {
            System.out.print(a + " "); 
        }
        System.out.println();
        
        // easiest way : Arrays.toString(A)
        
        System.out.println(Arrays.toString(A));  // only for 1-D array
        
        
    }
}
