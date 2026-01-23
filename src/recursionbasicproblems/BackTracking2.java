// NOTE: in backtracking if want to code for 1 to n try writing for n to 1 and just call the function before printing*
/*
print n to 1 with backtracking 
n=3
*/
package recursionbasicproblems;

import java.util.*;
public class BackTracking2
{
    // 3 -> 1
    public static void f(int i,int n) /// function
    {
       if(i>n) 
           return;
       f(i+1,n);
       System.out.print(i+" ");
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n : ");
        int n=sc.nextInt(); 
        f(1,3);
    }
}
