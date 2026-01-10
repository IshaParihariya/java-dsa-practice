
package Arrays;

import java.util.*;


public class passingInFunctions
{
    public static void main( String[] args)
    {
        int[] nums={1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(nums));
        
        
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
