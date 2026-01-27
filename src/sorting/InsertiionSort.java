// ascending order 
package sorting;

import java.util.Arrays;

public class InsertiionSort 
{
    static void insertionSort(int arr[])
    {
        int n=arr.length;
       for(int i=0;i<=n-1;i++)
       {
           int elementShifted=0; // false
           for(int j=i;j<n-1;j++)
           {
               if(arr[j+1]<arr[j])
               {
                   while(arr[j+1]>arr[j]) // shift by one till this condition
                   {
                       int temp=arr[j+1];
                       arr[j+1]=arr[j];
                       arr[j]=arr[j+1];
                       j--;
                   elementShifted=1;//true
                   }
               }
               if( elementShifted==0) // false
           {
               break;
           }
           }
       }
    }
    public static void main(String[] args)
    {
         System.out.println("------Bubble Sort------");
        int arr[]={9,14,15,12,6,8,13};
        System.out.println("unsorted array : " + Arrays.toString(arr) );
        insertionSort(arr); // method called
    System.out.println("sorted array : " + Arrays.toString(arr) );

    }
}
