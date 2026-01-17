

// seearching min, number in the array


package linearsearch_;

import java.util.*;

public class MinNumberInArray 
{
    static int[] arr={12,4,5,7,8,9,56,45,2,23,48};  // array initialisation and declaration
    static int min=arr[0];
    public static void main(String[] args)
    {
        
        System.out.println("Array : "+Arrays.toString(arr));  // printing array
        
        min(arr);
    }
    
    static void min(int[] arr)
    {
       
        int i;
        for(i=0;i<arr.length;i++)
        {
            if(arr[i]<min)
            {
                 min=arr[i];
            }
            
        }
        System.out.println(min);
    }
}
