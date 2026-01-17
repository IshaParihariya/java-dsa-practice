

/*
order agnostic binary search :
-> when we dont know whether the SORTED array in ascending or descending order
*/

/*
STEPS : NOTE: Array is sorted already
-> compare arr[start] and arr[end]
-> if arr[start]> arr[end] =>> descending array
-> if arr[start] < arr[end] =>> ascending array
*/
package binarysearchalgo;

import java.util.*;

public class OrderAgnosticBinarySearch 
{
    public static void main(String[] args)
    {
      System.out.println("BINARY SEARCH");
      System.out.println("-----------------------");
     search(new int[]{1,2,3,4,5,6,7,8,9} , 8);   // ** array i/p in the function 
    //method called
        
    }
    
    static int search(int[] arr, int target)
    {
        int start=0;
        int end= arr.length-1;
        int mid;
        
        if (arr[start] < arr[end] )  // case 1 ascending array
        {
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
          else if (arr[mid]<target)// case 3 => right side
           {
               start=mid+1;
           }
         
       }
            // IF loop finishes → not found
            System.out.println("target not found");
            return -1; // Target NOT found
                        // -1 is used universally to mean “not present”.
        }
        
        
         
        else if(arr[start] > arr[end] )//  case 2  descending order
        {
            while(start<= end)
            {
               mid=  start + (end-start)/2;
               
               if(arr[mid]==target) // case 1 
           {
               System.out.println( target +" found at :" +mid);
               return mid; // IMPORTANT
           }
               else if (arr[mid]>target)  // case 2 => left side search
           {
              start=mid+1; 
           }
               else
               {
                   end=mid-1;
               }
               
            }
            
           // IF loop finishes → not found
            System.out.println("target not found");
            return -1;  
        }
        System.out.println("target not found in the array");
        
        return -1;    
    }
}
