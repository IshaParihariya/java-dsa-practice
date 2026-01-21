/*
*
**
***
****
*****
*/
package patterns;

class pattern
{
    public void printPattern2()
    {
  for(int i=1;i<=5;i++)
        {
    for(int j=1;j<=i;j++)
    {
        System.out.print("*");

    }
     System.out.println();
        }
    }
    
    public void printPattern3()
    {
         System.out.println("--------------------");
        for(int i=1;i<=5;i++)
        {
            for(int j=5;j>=i;j--) //also for(int j=1; j <= n - i + 1 ;j++)
                                  // here n = 5
            {
              System.out.print("*");  
            }
           System.out.println(); 
        }
    }
}
public class Pattern2
{
    public static void main(String[] args)
    {
        pattern p=new pattern();
        p.printPattern2();
        p.printPattern3();
    }
}
