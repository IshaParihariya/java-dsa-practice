// descedning order Bubble sort :
// with each pass the smallest element will be moved to the last 
package sorting;

import java.util.Arrays;

public class BubbleSortDescendingOrder 
{
    public static void main(String[] args)
    {
       // way one to pass array in functions : BubbleSort(int arr[]{1,2,3,4,5})
          /*
           way 2 :   int[] arr = {1,2,3,4,5,6};
           BubbleSort(arr); => better one

          */
        
    System.out.println("------Bubble Sort------");
        int[] arr = {11,-2,0,13,4,-50,16,33,3,8,-180,80};
    System.out.println("unsorted array : " + Arrays.toString(arr) );
         bubbleSort1(arr);
    System.out.println("sorted array : " + Arrays.toString(arr) );

    }
    
    static void bubbleSort1(int arr[])
    {
        int n=arr.length;
        for(int i=0;i<=n-1;i++)
        {
            boolean swapped=false;
            for(int j=0;j<n-i-1;j++)
            {
                if(arr[j]<arr[j+1])
                {
                    // swapping
                   int temp=arr[j];
                   arr[j]=arr[j+1];
                   arr[j+1]=temp;
                   swapped= true;
                }
            }
            if(!swapped)
            {
                break;
            }
        }
    }
}
