/*
1
01
101
0101
10101

*/
package patterns;

public class Pattern5
{
    public static void main(String[] args)
    {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            // for i = 1,3,5 => starts from 1
            // for i=2,4 => starts from 0
                int start=1; // i=1,3,5
                if(i%2==0) 
                {
                    start=0;
                }
                for(int j=1;j<=i;j++) // for 0 1 printing
            {
                 System.out.print(start);
                 start=1-start;
            }
               
               for(int j=n-i;j>=0;j--) //for space 4 -> 0
               { System.out.print( " ");} 
              System.out.print( " \n");  
            }
       
        }
    }

