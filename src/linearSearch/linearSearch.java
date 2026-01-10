
package linearSearch;

/*
NOTE: 
->> TIME COMPLEXITY:
-> best case O(1) constant
-> worst case O(N) where N is the size of the array
*/

/*
either only 1 comparison -> best case (pahli bar mein 1st comparisosn mein hi answer)
or N comparisons -> worst one (last takk jana pada so N time comparisons)
*/

public class linearSearch
{
    public static void main(String[] args)
    {
        // find whether 14 exists in the array
        
        int[] arr={1,2,3,4,5,6,7,8,9,1,34,56,1,2,0,45};   // array declared and initialised
        int i;
        for( i=0;i<arr.length;i++)
        {
           int a=arr[i];   // accessing the array   
        
        if(a==14)
           {
               System.out.println("14 found at index : " +i);
           }
        
        }
       
        
        
                
    }
}
