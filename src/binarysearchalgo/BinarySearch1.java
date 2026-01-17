
// BINARY SEARCH 

/*
STEPS : 

-> sorted array needed
-> find the middle element
-> if target < middle element 
1. serach in left side
-> if target > middle element
2. again middle one in the left side and the same process
1. search in the right side 
2. again middle one in the right side and the same process
-> if target== middle element
1. target found
*/
package binarysearchalgo;

import java.util.*;
public class BinarySearch1 
{  // tried and answer is right but not binary search 

    static int target=0; // target
    static int[] arr = new int[]{1,2,3,4,5,6,7,8,9};  // sorted array
   
    static int topIndex=0; 
    static int lastIndex=arr.length-1; // lastIndex of array = lenth of array - 1 = 9 - 1 = 8
    static int middleIndex1=lastIndex/2; // middle ones index
 
    public static void main(String[] args)
    {
     
      System.out.println("Array : " + Arrays.toString(arr));
      System.out.println("Target : " + target);
      System.out.println("last index : "+ lastIndex);
      
      search(arr);  
    }
    
    static int search(int[] arr)
    { 
        int i;
        
        
           if(arr[middleIndex1]==target) // case 1
           {
              System.out.println("target found aat index : " +middleIndex1);
              return middleIndex1;
           }
 
           
           else if(arr[middleIndex1]>target) // case 2
           {
               for(i=0;i<middleIndex1;i++)// for left hand side
               {
                   if(arr[i]==target)
                   {
                       System.out.println("target found at index : " +i);
                        return i; // always otherwise it will always return -1 which will cause confusion
                   }
               }
              
            }
           
           else   // case 3
           {
               for(i=middleIndex1;i<=lastIndex;i++)
               {
                   if(arr[i]==target)
                   {
                      System.out.println("target found at index : " +i);
                      return i; // always otherwise it will always return -1 which will cause confusion
                   }
               }
               
           }
           
        
        System.out.println(" target not found ");
        return -1;
    }
}
