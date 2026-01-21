/*
   *
  ***
 *****
*******

*/
package patterns;

public class Pattern4 
{
    public static void main(String[] args)
    {
        int n=4; //pattern 1
      for(int i=1;i<=n;i++) //outer loop
      {
          for(int j=1;j<=n-i;j++)  // spaces 3 -> 0
          {
              System.out.print(" ");
          }
          
          for(int j=1;j<=2*i-1;j++)
          {
               System.out.print("*");
          }
              
          for(int j=1;j<=n-i;j++)  // spaces 3 -> 0
          {
              System.out.print(" ");
          }
          System.out.println();
      }
      
      System.out.println("--------------------");
      
      //pattern 2
      for(int i=1;i<=4;i++) //outer loop
      {
          for(int j=0;j<i;j++) //for spaces 0 -> 3
          {
              System.out.print(" ");
          }
          for(int j=(2*n-(2*i-1));j>=1;j--) //for stars
          {
              System.out.print("*");
          }
           for(int j=0;j<i;j++)//for spaces 0 -> 3
          {
              System.out.print(" ");
          }
           System.out.println();
      }
    }
}
