/*
print from n -> 1
*/
package recursionbasicproblems;
import java.util.Scanner;
public class Problem2
{
    public static void f(int n,int i)
    {
        if(n<i)
        {
            return;
        }
        System.out.println(n);
       
        f(n-1,i);
    }
    public static void main(String[] args)
    {
        // here n = 10 so 10 -> 1
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n : ");
        int n=sc.nextInt(); 
        f(n,1); // function called
    }
}
/*

Enter n : 10
10
9
8
7
6
5
4
3
2 
*/
