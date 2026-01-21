/*
1
12
123
1234
12345
*/
package patterns;

public class Pattern3 
{
     public static void main(String[] args)
    {
        for(int i=1;i<=5;i++) //pattern 1
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
             System.out.println();
        }
        
        System.out.println("----------------------");
        
        
        for(int i=1;i<=5;i++) //pattern 2
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(i);
            }
             System.out.println();
        }
    }
}
