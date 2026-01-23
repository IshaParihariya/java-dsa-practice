/*
backtacking : 
Backtracking in recursion is the process of reverting changes after a recursive call returns, 
in order to explore alternative solutions.
*/
package recursionbasicproblems;

import java.util.Scanner;

public class BackTracking1 
{
    // print 1 to n=3 using backtacking concept
    public static void backtracking(int i,int n)
    {
      if(i<1)
          return;
      backtracking(i-1,n);
      System.out.print(i+" ");
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n : ");
        int n=sc.nextInt(); 
        backtracking(n,n); // function called
    }
}
