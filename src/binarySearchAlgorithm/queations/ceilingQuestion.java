



/*
CEILING : 

-> arr[10,27,41,55,62,70,80,92]  // sorted so binary
-> ceiling =  smallest number in the array that is greater than equal to the target element
-> EXAMPLE : ceiling(arr, target=70) 
   => ceiling = 70
-> EXample : ceiling(arr, target=75)
   => ceiling = 80

*/
package binarySearchAlgorithm.queations;

import java.util.*;

public class ceilingQuestion 
{
    public static void main(String[] args)
    {
       
       ceiling(new int[] {10,27,41,55,62,70,80,92},70); 
    }
    
    static int ceiling(int[] arr , int target)
    {
        System.out.println(Arrays.toString(arr));
        
         System.out.println("target : "+target);
       
        
        return -1;
    }
}
