
package array;

import java.util.*;


public class PassingInFunctions
{
    public static void main( String[] args)
    {
        int[] nums={1,2,3,4,5,6,7,8,9};
        System.out.println(java.util.Arrays.toString(nums));
        /*
        If a class name in the same package matches an imported class,
        Java gives priority to the local class, which can cause name conflicts.
        */
        
        
        change(nums);
    }
    
    static void change(int[] arr)
    {
        arr[3]=0;       /*here even tho we have used arr insted of nums still it gonn work cuz
                          it is like a copy pointing towards the values
                          i.e., mutable so arrays are mutable and strings are not
                          mutable=>> object can be changed                        */
    }
}
