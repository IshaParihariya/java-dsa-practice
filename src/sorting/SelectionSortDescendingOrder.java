// selection sort in Descending order : 
package sorting;

import java.util.Arrays;

public class SelectionSortDescendingOrder 
{
    static void selectionSort1(int arr[])
    {
       // chhose the maximum one and keep placing it on the right place
        // ith pass
        for(int i=0;i<=arr.length-1;i++)
        {
            int max=i;
            int j;
            for( j=i;j<arr.length;j++)
            {
                if(arr[max]<arr[j])
                {
                    max=j;
                }
            }
            // after each pass the placing of the max element on the right place
            /*
            i = position where the correct element must go
            j = only used for searching
            */
             int temp = arr[i];
             arr[i] = arr[max];
             arr[max] = temp;
            
        }
    }
    public static void main(String[] args)
    {
        System.out.println("-----selection sort-----");
   int arr[] = {11,-2,0,13,4,-50,16,33,3,8,-180,80};  
   System.out.println("unsorted array :"+ Arrays.toString(arr));
   
   selectionSort1(arr);
   System.out.println("sorted array :"+ Arrays.toString(arr));
    }
}
