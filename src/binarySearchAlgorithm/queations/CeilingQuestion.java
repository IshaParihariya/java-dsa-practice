



/*
CEILING : 

-> arr[10,27,41,55,62,70,80,92]  // sorted so binary
-> ceiling =  smallest number in the array that is greater than equal to the target element
-> EXAMPLE : ceiling(arr, target=70) 
   => ceiling = 70
-> EXample : ceiling(arr, target=75)
   => ceiling = 80

One-line rule : **
After binary search ends, start points to the ceiling element
start points to ceiling only when the ceiling exists in a sorted array using correct binary search logic.***
*/
package binarySearchAlgorithm.queations;

import java.util.*;

public class CeilingQuestion 
{
    public static void main(String[] args)
    {
       
       int c=ceiling(new int[] {10,27,41,55,62,70,80,92,100},70); 
       System.out.println("ceiling : "+c);
    }
    
    static int ceiling(int[] arr , int target)
    {
         System.out.println(Arrays.toString(arr)); //print array
        
         System.out.println("target : "+target); //print target 
        // with binary search solution
        
        int start=0; // start index of the array
        int end=arr.length-1;//end index of the array
        int mid;
        
        if(target>arr[arr.length-1]) //target is greater than the largest number in the array 
        {
            return -1;
        }
       while(start<=end)
        {
            mid=start+(end-start)/2; //middle index
            
            if(arr[mid]==target)
            {
                return arr[mid];
            }
            else if(arr[mid]>target) //left hand side search
            {
                //same start 
                end=mid-1; //end changed   
            }
            else //arr[mid]<target right hand side search
            {
                //same end 
                start=mid+1; //new start
            }
        }
       
        /*start <=end is the condition of while loop but in the process of finding 
                  the ceiling start > end (loop condition violated)hence
                  this is where the loop ends and this is where arr[start] = celing so we retuen arr[start]*/
        return arr[start]; /*start points to ceiling only when the ceiling exists in a 
                           sorted array using correct binary search logic.*/
    }
}
