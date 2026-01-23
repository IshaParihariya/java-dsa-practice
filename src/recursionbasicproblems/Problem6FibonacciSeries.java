/*
fibonacci series :

0   1   1   2   3   5   8   13   21   34

*/
package recursionbasicproblems;

public class Problem6FibonacciSeries 
{
    // with recursion
    static void fibonacci(int i,int j,int n)
    {
       
       if(n==0)
       {
           return ;
       }
        int c=i+j;
       System.out.println(c);
       fibonacci(j,c,n-1);
      
    }
    
    // with multiple recursion
    static int fib(int n)
    {
        if(n<=1)
            return n;
        int last=fib(n-1);
        int slast=fib(n-2);
        return last+slast;
        
    }
    public static void main(String[] args)
    {
        fibonacci(0,1,12); // prints 12 fibonacci numbers from 0 and 1 starting from 1 
        System.out.println("-------------------");
        int n=fib(4); // the number at 4 // 3
        System.out.println(n);
    }
}
