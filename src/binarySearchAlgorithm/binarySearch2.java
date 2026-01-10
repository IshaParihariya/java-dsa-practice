
//binary search with ascending order sorted array 

/*
 WHY BINARY SEARCH ???
->> linear serach compares N times 
->> binary search compares log N times 
->> EG: 1 million comparisons :
- linear search compares 1 million times
- but binary search compares log (1 million) = 20 times only
*/
package binarySearchAlgorithm;

import java.util.*;
public class binarySearch2
{
    
   public static void main(String[] args)
   {
      
      System.out.println("BINARY SEARCH");
      System.out.println("-----------------------");
     search(new int[]{1,2,3,4,5,6,7,8,9} , 0);   // ** array i/p in the function 
    //method called
   }
   
   static int search(int[] arr, int target)
   {
       
       System.out.println("Array : " + Arrays.toString(arr));
        System.out.println("-----------------------");
       int start=0;
       int end=arr.length-1;
       int mid=0;  
       
       while(start<=end)
       {
          /* mid=(start+end)/2;  
           -> if (start+end)/2 is out of range of integer in JAVA then error
           -> so instead using =>> start + (end-start)/2 = (start+end)/2
          */
           
           mid = start + (end-start)/2;
           
           if(arr[mid]==target) // case 1 
           {
               System.out.println( target +" found at :" +mid);
               return mid; // IMPORTANT
           }
           
          else if (arr[mid]>target)  // case 2 => left side search
           {
              end=mid-1; 
           }
          else // case 3 => right side
           {
               start=mid+1;
           }
            
       }
      
       
        System.out.println(" target not found ");
        return -1;
   }
}
