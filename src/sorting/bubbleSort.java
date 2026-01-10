/*
Bubble Sort : It works by repeatedly comparing adjacent elements and swapping them if 
         0R      they are in the wrong order, just like air bubbles rising to the top
Sinking Sort 
         OR
Exchanging Sort
-> It can be both in ascending and descending order
-> What is a Pass? ( for ASCENDING ORDER and vice-versa for DESCENDING ORDER )
- One pass = one full loop through the array
- After each pass, one element reaches its correct position
- Specifically, after each pass, the largest element (for ascending order) moves to the end
*/

/*
1. space complexity : O(n)
-> No extra space required i.e., copying the array , etc not required 
      also known as inplace algorithm 
NOTE : n is the number of comparisons 
2. Time complexity : 
- best case : O(n) => sorted 
- worst case : O(n^2) => sorting in opposite i.e., sorting the ascending order one to descending order 
-> NOTE IMP : In time complexity constants are ignored so the best case comparisions are n-1 but we keep
it n bcuz we only need a relationship
- HOW n-1 comparisons => arr[n]={1,3,4,5,6,...n} => COUNT THE NUMBER OF COMPARISIONS 
- In bubble sort comaprison is done and i is the pass
so for each pass j=0 ; j<n-i-1 (this because j will not visit the already sorted part anymore)
*/
package sorting;

import java.util.*;

public class bubbleSort 
{
    public static void main(String[] args)
    {
       // way one to pass array in functions : bubbleSort(int arr[]{1,2,3,4,5})
          /*
           way 2 :   int[] arr = {1,2,3,4,5,6};
           bubbleSort(arr); => better one

          */
        
    System.out.println("------Bubble Sort------");
        int[] arr = {11,-2,0,13,4,-50,16,33,3,8,-180,80};
    System.out.println("unsorted array : " + Arrays.toString(arr) );
         bubbleSort(arr);
    System.out.println("sorted array : " + Arrays.toString(arr) );

    }
    
    static void bubbleSort(int arr[])
    {
        /*
        If no swap occurs in a pass, the array is already sorted
        Then Bubble Sort stops early, possibly in fewer than n − 1 passe
        */
        boolean swapped;
       for (int i=0;i<arr.length;i++)  // i th pass 
       {
           swapped=false;
           for(int j=1;j<arr.length-i;j++)  /*
                                   j<n-i-1 (this because j will not visit the already sorted part anymore)
                                            */
           {
              if(arr[j]<arr[j-1]) // Ascending order
              {
                  int temp=arr[j];
                  arr[j]=arr[j-1];
                  arr[j-1]=temp;
                  swapped = true;
              }
           }
           /*
           Sometimes, the array is already sorted before completing all passes.
           So instead of wasting time doing useless passes, we use a flag variable called swapped.
           !swapped means swapped == false
           That means:
           -No swap occurred in the entire pass
           -The array is already sorted
           -So we stop the algorithm early using break
           */
           if(!swapped)
           {
               break;
           }
       }
    }
}
