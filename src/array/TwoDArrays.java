
/*
Arrays.deepToString(arr);   =>> for multi dimensional array
                          =>> or simply do likeArrays.toString(arr[i]);   
*/
package array;

import java.util.*;


public class TwoDArrays 
{
    public static void main(String[] args)
    {
        /*
        
        WAYS TO DECLARE AND INITIALISE A 2-D ARRAY:
        
        1. int[][] A = new int[2][];
        -> NOTE: size of column is not necesaary to add
        -> so the no. of columns can be different for each row 
        
        2. int[][] A= {
                      {1,2,3,4,5},            // A[0][]
                      {1,2,3},             // A[1][]
                      {1,2,3,4}               // A[2][]
                      };
        */
        
        
        // INPUT IN A 2-D ARRAY:
        
        
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int a=sc.nextInt();
        System.out.print("Enter the number of columns: ");// taking fixed number of columns
        int b=sc.nextInt();
        
        System.out.print("Enter the inputs for rows and columns: ");
        int[][] arr=new int[a][b]; // a rows and b columns
        
        for(int i=0;i<a;i++)
        {
            int j;
            for(j=0;j<b;j++) /*if number of columns is not fixed then 
                             ->> for(int j=0;j<arr[i].length;j++)
                  
                 */
            {
                arr[i][j]=sc.nextInt();
               
            }
        }
      
       System.out.println("The 2-D array : ");
        for (int i=0;i<a;i++)
        {
            int j;
            for ( j=0;j<b;j++)
            {
                 
            }
           
        }
        System.out.print(java.util.Arrays.deepToString(arr));  // for multi-dimensional array
        /*
        If a class name in the same package matches an imported class,
        Java gives priority to the local class, which can cause name conflicts.
        */
        System.out.println();
            }
    
}
