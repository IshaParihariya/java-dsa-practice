/*
sum of n numbers with recursion 
*/
package recursionbasicproblems;

public class Problem3
{
    // n=3
    public static int sum=0;
    public static int sum(int n)
    {
       
       if(n<0)
       { 
       return sum;
       }
     return sum=n +  sum(n-1);
      
       
        
    }
    public static void main(String[] args)
    {
        System.out.println(sum(3)); 
    }
}
